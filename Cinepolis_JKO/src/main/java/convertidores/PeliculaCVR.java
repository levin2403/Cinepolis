/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package convertidores;

import DTO.PeliculaDTO;
import entidad.Pelicula;

/**
 *
 * @author skevi
 */
public class PeliculaCVR {
    
    public PeliculaDTO entidad_dto(Pelicula pelicula){
        int id = pelicula.getIdPais();
        String titulo = pelicula.getTitulo();
        String sinopsis = pelicula.getSinopsis();
        int idPais = pelicula.getIdPais();
        int duracion = pelicula.getDuracion();
        String clasificacion = pelicula.getClasificacion();
        String trailer = pelicula.getTrailer();
        String imagen = pelicula.getImagen();
        int idGenero = pelicula.getIdGenero();
        return new PeliculaDTO(id, titulo, sinopsis, idPais, duracion, clasificacion, trailer, imagen, idGenero);
    }
    
    public Pelicula dto_entidad(PeliculaDTO peliculaDTO){
        String titulo = peliculaDTO.getTitulo();
        String sinopsis = peliculaDTO.getSinopsis();
        int idPais =  peliculaDTO.getIdPais();
        int duracion =  peliculaDTO.getDuracion();
        String clasificacion = peliculaDTO.getClasificacion();
        String trailer= peliculaDTO.getTrailer();
        String imagen= peliculaDTO.getImagen();
        int idGenero = peliculaDTO.getIdGenero();
        return new Pelicula(titulo, sinopsis, idPais, duracion, clasificacion, trailer, imagen, idGenero);
    }
    
}
