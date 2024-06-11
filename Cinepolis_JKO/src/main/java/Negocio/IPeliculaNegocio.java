/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Negocio;

import Persistencia.PeliculaDAO;
import Persistencia.PersistenciaException;
import entidad.Pelicula;
import java.util.List;

/**
 *
 * @author jesus
 */
public interface IPeliculaNegocio {
      
    
    public List<Pelicula> obtenerPeliculas() throws NegocioException, PersistenciaException;
}
