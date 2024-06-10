/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package convertidores;

import DTO.ClienteDTO;
import entidad.Cliente;
import java.time.LocalDate;

/**
 *
 * @author skevi
 */
public class ClienteCVR {
    
     public ClienteDTO entidad_dto(Cliente cliente){
         int idCliente = cliente.getIdCliente();
         String nombre = cliente.getNombre();
         String apellidoPaterno = cliente.getApellidoPaterno();
         String apellidoMaterno = cliente.getApellidoMaterno();
         String correo = cliente.getCorreo();
         LocalDate fechaNacimiento = cliente.getFechaNacimiento();
         Double latitud = cliente.getLatitud();
         Double longitud = cliente.getLongitud();
         String contrasena = cliente.getContrasena();
         return new ClienteDTO (idCliente, nombre, apellidoPaterno, apellidoMaterno, 
                 correo, fechaNacimiento, latitud, longitud, contrasena); 
     }
     
     public Cliente dto_entidad(ClienteDTO clienteDTO){
         String nombre = clienteDTO.getNombre();
         String apellidoPaterno = clienteDTO.getApellidoPaterno();
         String apellidoMaterno = clienteDTO.getApellidoMaterno();
         String correo = clienteDTO.getCorreo();
         LocalDate fechaNacimiento = clienteDTO.getFechaNacimiento();
         Double latitud = clienteDTO.getLatitud();
         Double longitud = clienteDTO.getLongitud();
         String contrasena = clienteDTO.getContrasena();
         return new Cliente(nombre, apellidoPaterno, apellidoMaterno, correo, 
                 fechaNacimiento, latitud, longitud, contrasena); 
     }
     
}
