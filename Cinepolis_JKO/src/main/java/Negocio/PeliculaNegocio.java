/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;

import Persistencia.ConexionBD;
import Persistencia.PeliculaDAO;
import Persistencia.PersistenciaException;
import entidad.Pelicula;
import java.util.List;

/**
 *
 * @author jesus
 */
public class PeliculaNegocio {

    PeliculaDAO peliculaDAO = new PeliculaDAO(new ConexionBD());

    public PeliculaNegocio() {
    }

    public PeliculaNegocio(PeliculaDAO peliculaDAO) {
        this.peliculaDAO = peliculaDAO;
    }
    
    
    public List<Pelicula> obtenerPeliculas() throws PersistenciaException {

        return peliculaDAO.obtenerPeliculas();

    }

}
