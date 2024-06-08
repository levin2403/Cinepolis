/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import entidad.Pelicula;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PeliculaDAO {

    private ConexionBD conexionBD;

    public PeliculaDAO(ConexionBD conexionBD) {
        this.conexionBD = conexionBD;
    }

    public void agregarPelicula(Pelicula pelicula) throws SQLException {
        String query = "INSERT INTO Pelicula (Titulo, ID_Genero, ID_Pais) VALUES (?, ?, ?)";
        try (Connection conn = conexionBD.crearConexion(); PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, pelicula.getTitulo());
            stmt.setInt(2, pelicula.getIdGenero());
            stmt.setInt(3, pelicula.getIdPais());
            stmt.executeUpdate();
        }
    }

    public List<Pelicula> obtenerPeliculas() throws SQLException {
        List<Pelicula> peliculas = new ArrayList<>();
        String query = "SELECT * FROM Pelicula";
        try (Connection conn = conexionBD.crearConexion(); PreparedStatement stmt = conn.prepareStatement(query); ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Pelicula pelicula = new Pelicula();
                pelicula.setIdPelicula(rs.getInt("ID_Pelicula"));
                pelicula.setTitulo(rs.getString("Nombre"));
                pelicula.setIdGenero(rs.getInt("ID_Genero"));
                pelicula.setIdPais(rs.getInt("ID_Pais"));
                peliculas.add(pelicula);
            }
        }
        return peliculas;
    }

}
