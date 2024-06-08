/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;
import entidad.Pais;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PaisDAO {
    private ConexionBD conexionBD;

    public PaisDAO(ConexionBD conexionBD) {
        this.conexionBD = conexionBD;
    }

    public void agregarPais(Pais pais) throws SQLException {
        String query = "INSERT INTO Pais (Nombre) VALUES (?)";
        try (Connection conn = conexionBD.crearConexion();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, pais.getNombre());
            stmt.executeUpdate();
        }
    }

    public List<Pais> obtenerPaises() throws SQLException {
        List<Pais> paises = new ArrayList<>();
        String query = "SELECT * FROM Pais";
        try (Connection conn = conexionBD.crearConexion();
             PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Pais pais = new Pais();
                pais.setIdPais(rs.getInt("ID_Pais"));
                pais.setNombre(rs.getString("Nombre"));
                paises.add(pais);
            }
        }
        return paises;
    }

}
