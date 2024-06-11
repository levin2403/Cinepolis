/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Persistencia.interfaces;

import Persistencia.excepcion.PersistenciaException;
import entidad.Cliente;
import java.util.List;

/**
 *
 * @author jesus
 */
public interface IClienteDAO {

    public void crear(Cliente cliente) throws PersistenciaException;

    public List<Cliente> obtenerClientes() throws PersistenciaException;

    public void actualizar(Cliente cliente) throws PersistenciaException;

    public void borrar(Cliente cliente) throws PersistenciaException;
    
    public Cliente buscarPorCorreo()throws PersistenciaException;

}
