/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;

import Persistencia.ConexionBD;
import Persistencia.IPeliculaDAO;
import Persistencia.PeliculaDAO;
import Persistencia.PersistenciaException;
import entidad.Pelicula;
import java.util.List;

/**
 *
 * @author jesus
 */
public class PeliculaNegocio implements IPeliculaNegocio {

    IPeliculaDAO peliculaDAO = new PeliculaDAO(new ConexionBD());

    public PeliculaNegocio() {
    }

    public PeliculaNegocio(PeliculaDAO peliculaDAO) {
        this.peliculaDAO = peliculaDAO;
    }
    
    
    @Override
    public List<Pelicula> obtenerPeliculas() throws NegocioException, PersistenciaException {

        return peliculaDAO.obtenerPeliculas();

    }

}
