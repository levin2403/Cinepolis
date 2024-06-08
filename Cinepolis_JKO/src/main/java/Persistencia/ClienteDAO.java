/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import entidad.Cliente;
import java.sql.Connection;
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

    public void agregarCliente(Cliente cliente) throws SQLException {
        String query = "INSERT INTO Cliente (Nombre, ApellidoPaterno, ApellidoMaterno, Correo, FechaNacimiento, Latitud, Longitud) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = conexionBD.crearConexion(); PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, cliente.getNombre());
            stmt.setString(2, cliente.getApellidoPaterno());
            stmt.setString(3, cliente.getApellidoMaterno());
            stmt.setString(4, cliente.getCorreo());
            stmt.setDate(5, new java.sql.Date(cliente.getFechaNacimiento().getTime()));
            stmt.setDouble(6, cliente.getLatitud());
            stmt.setDouble(7, cliente.getLongitud());
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
                cliente.setFechaNacimiento(rs.getDate("FechaNacimiento"));
                cliente.setLatitud(rs.getDouble("Latitud"));
                cliente.setLongitud(rs.getDouble("Longitud"));
                clientes.add(cliente);
            }
        }
        return clientes;
    }

}
