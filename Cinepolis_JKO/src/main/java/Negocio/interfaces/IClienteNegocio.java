/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Negocio.interfaces;

import DTO.ClienteDTO;
import Negocio.excepcion.NegocioException;
import Persistencia.excepcion.PersistenciaException;
import entidad.Cliente;
import java.util.List;

/**
 *
 * @author jesus
 */
public interface IClienteNegocio {

    public void registrarCliente(ClienteDTO clienteDTO) throws NegocioException, PersistenciaException;

    public List<Cliente> obtenerCliente() throws PersistenciaException;

    public Cliente buscarPorCorreo(String correo)throws PersistenciaException;
    
}
