/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;

import DTO.ClienteDTO;
import Persistencia.ClienteDAO;
import entidad.Cliente;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jesus
 */
public class ClienteNegocio {
    
      private ClienteDAO clienteDAO;

    public ClienteNegocio(ClienteDAO clienteDAO) {
        this.clienteDAO = clienteDAO;
    }

    public void registrarCliente(ClienteDTO clienteDTO) throws SQLException {
        Cliente cliente = new Cliente(
            clienteDTO.getNombre(),
            clienteDTO.getApellidoPaterno(),
            clienteDTO.getApellidoMaterno(),
            clienteDTO.getCorreo(),
            clienteDTO.getFechaNacimiento(),
            clienteDTO.getLatitud(),
            clienteDTO.getLongitud(),
            clienteDTO.getContrasena()
        );
        clienteDAO.crear(cliente);
    }

    
}
