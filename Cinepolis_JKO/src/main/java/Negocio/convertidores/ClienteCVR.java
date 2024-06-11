/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio.convertidores;

import DTO.ClienteDTO;
import entidad.Cliente;
import java.time.LocalDate;

/**
 *
 * @author skevi
 */
public class ClienteCVR {
    
    
    public Cliente ClienteDTO_entidad(ClienteDTO clienteDTO){
        int idCliente = clienteDTO.getIdCliente();
        String nombre = clienteDTO.getNombre();
        String apellidoPaterno = clienteDTO.getApellidoPaterno();
        String apellidoMaterno = clienteDTO.getApellidoMaterno();
        String correo = clienteDTO.getCorreo();
        LocalDate fechaNacimiento = clienteDTO.getFechaNacimiento();
        Double latitud = clienteDTO.getLatitud();
        Double longitud = clienteDTO.getLongitud();
        String contrasena = clienteDTO.getContrasena();
        return new Cliente(idCliente, nombre, apellidoPaterno, 
                apellidoMaterno, correo, fechaNacimiento, latitud,
                longitud, contrasena);
    }
    
}
