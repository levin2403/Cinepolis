/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import entidad.Cliente;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO {

    private IConexionBD conexionBD;

    public ClienteDAO(IConexionBD conexionBD) {
        this.conexionBD = conexionBD;
    }

    public void crear(Cliente cliente) throws SQLException {
        String query = "INSERT INTO clientes (nombre, apellidoPaterno, apellidoMaterno, correo, fechaNacimiento, latitud, longitud, contrasena) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = conexionBD.crearConexion(); PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, cliente.getNombre());
            stmt.setString(2, cliente.getApellidoPaterno());
            stmt.setString(3, cliente.getApellidoMaterno());
            stmt.setString(4, cliente.getCorreo());
            stmt.setDate(5, Date.valueOf(cliente.getFechaNacimiento()));
            stmt.setDouble(6, cliente.getLatitud());
            stmt.setDouble(7, cliente.getLongitud());
            stmt.setString(8, cliente.getContrasena());
            stmt.executeUpdate();
        }
    }

    public List<Cliente> obtenerClientes() throws SQLException {
        List<Cliente> clientes = new ArrayList<>();
        String query = "SELECT * FROM Cliente";
        try (Connection conn = conexionBD.crearConexion(); PreparedStatement stmt = conn.prepareStatement(query); ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Cliente cliente = new Cliente();
                cliente.setIdCliente(rs.getInt("ID_Cliente"));
                cliente.setNombre(rs.getString("Nombre"));
                cliente.setApellidoPaterno(rs.getString("ApellidoPaterno"));
                cliente.setApellidoMaterno(rs.getString("ApellidoMaterno"));
                cliente.setCorreo(rs.getString("Correo"));
                cliente.setFechaNacimiento(rs.getDate("FechaNacimiento").toLocalDate());
                cliente.setLatitud(rs.getDouble("Latitud"));
                cliente.setLongitud(rs.getDouble("Longitud"));
                clientes.add(cliente);
            }
        }
        return clientes;
    }
    

    public void actualizar(Cliente cliente) throws SQLException {
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
        }
    }

    public void borrar(int idCliente) throws SQLException {
        String query = "DELETE FROM clientes WHERE idCliente = ?";
        try (Connection conn = conexionBD.crearConexion(); PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, idCliente);
            stmt.executeUpdate();
        }
    }
}
