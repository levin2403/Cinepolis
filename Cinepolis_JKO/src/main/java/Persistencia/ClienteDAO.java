package Persistencia;

import Persistencia.interfaces.IConexionBD;
import Persistencia.interfaces.IClienteDAO;
import Persistencia.excepcion.PersistenciaException;
import entidad.Cliente;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO implements IClienteDAO {

    private IConexionBD conexionBD;

    public ClienteDAO(ConexionBD conexionBD) {
        this.conexionBD = conexionBD;
    }

    @Override
    public void crear(Cliente cliente) throws PersistenciaException {
        String query = "INSERT INTO cliente (nombre, apellidoPaterno, apellidoMaterno, correo, fechaNacimiento, contrasena) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection conn = conexionBD.crearConexion(); PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, cliente.getNombre());
            stmt.setString(2, cliente.getApellidoPaterno());
            stmt.setString(3, cliente.getApellidoMaterno());
            stmt.setString(4, cliente.getCorreo());
            stmt.setDate(5, Date.valueOf(cliente.getFechaNacimiento()));
            stmt.setString(6, cliente.getContrasena());
            stmt.executeUpdate();
        } catch (SQLException ex) {
            throw new PersistenciaException("Error al crear un cliente en la base de datos: " + ex.getMessage());
        }
    }

    @Override
    public List<Cliente> obtenerClientes() throws PersistenciaException {
        List<Cliente> clientes = new ArrayList<>();
        String query = "SELECT ID_Cliente, Nombre, ApellidoPaterno, ApellidoMaterno, Correo, contrasena, FechaNacimiento, Latitud, Longitud FROM Cliente";
        try (Connection conn = conexionBD.crearConexion(); PreparedStatement stmt = conn.prepareStatement(query); ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Cliente cliente = new Cliente();
                cliente.setIdCliente(rs.getInt("ID_Cliente"));
                cliente.setNombre(rs.getString("Nombre"));
                cliente.setApellidoPaterno(rs.getString("ApellidoPaterno"));
                cliente.setApellidoMaterno(rs.getString("ApellidoMaterno"));
                cliente.setCorreo(rs.getString("Correo"));
                cliente.setContrasena(rs.getString("contrasena"));
                cliente.setFechaNacimiento(rs.getDate("FechaNacimiento").toLocalDate());
                cliente.setLatitud(rs.getDouble("Latitud"));
                cliente.setLongitud(rs.getDouble("Longitud"));
                clientes.add(cliente);
            }
        } catch (SQLException ex) {
            throw new PersistenciaException("Error al obtener clientes de la base de datos: " + ex.getMessage());
        }
        return clientes;
    }

    @Override
    public void actualizar(Cliente cliente) throws PersistenciaException {
        String query = "UPDATE clientes SET nombre = ?, apellidoPaterno = ?, apellidoMaterno = ?, correo = ?, fechaNacimiento = ?, latitud = ?, longitud = ?, contrasena = ? WHERE idCliente = ?";
        try (Connection conn = conexionBD.crearConexion(); PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, cliente.getNombre());
            stmt.setString(2, cliente.getApellidoPaterno());
            stmt.setString(3, cliente.getApellidoMaterno());
            stmt.setString(4, cliente.getCorreo());
            stmt.setDate(5, Date.valueOf(cliente.getFechaNacimiento()));
            stmt.setDouble(6, cliente.getLatitud());
            stmt.setDouble(7, cliente.getLongitud());
            stmt.setString(8, cliente.getContrasena());
            stmt.setInt(9, cliente.getIdCliente());
            stmt.executeUpdate();
        } catch (SQLException ex) {
            throw new PersistenciaException("Error al actualizar un cliente en la base de datos: " + ex.getMessage());
        }
    }

    @Override
    public void borrar(Cliente cliente) throws PersistenciaException {
        String query = "DELETE FROM clientes WHERE idCliente = ?";
        try (Connection conn = conexionBD.crearConexion(); PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, cliente.getIdCliente());
            stmt.executeUpdate();
        } catch (SQLException ex) {
            throw new PersistenciaException("Error al borrar un cliente en la base de datos: " + ex.getMessage());
        }
    }

    @Override
    public Cliente buscarPorCorreo(String correo) throws PersistenciaException {
        
        String query = "SELECT * FROM Cliente WHERE Correo = ?";
        
        try (Connection conexion = conexionBD.crearConexion();
             PreparedStatement statement = conexion.prepareStatement(query)) {
            statement.setString(1, correo);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    int idCliente = resultSet.getInt("ID_Cliente");
                    String nombre = resultSet.getString("Nombre");
                    String apellidoPaterno = resultSet.getString("ApellidoPaterno");
                    String apellidoMaterno = resultSet.getString("ApellidoMaterno");
                    LocalDate fechaNacimiento = resultSet.getDate("FechaNacimiento").toLocalDate();
                    Double latitud = resultSet.getDouble("Latitud");
                    Double longitud = resultSet.getDouble("Longitud");
                    String contrasena = resultSet.getString("Contrasena");
                    
                    return new Cliente(idCliente, nombre, apellidoPaterno, apellidoMaterno, 
                                       correo, fechaNacimiento, latitud, longitud, contrasena);
                } else {
                    return null;
                }
            }
        } catch (SQLException e) {
            throw new PersistenciaException("Error al buscar cliente por correo");
        }
    }
    
}
