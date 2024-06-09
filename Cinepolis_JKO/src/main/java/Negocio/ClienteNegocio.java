package Negocio;

import DTO.ClienteDTO;
import Persistencia.ClienteDAO;
import entidad.Cliente;
import java.sql.SQLException;

public class ClienteNegocio {
    
    private ClienteDAO clienteDAO;

    public ClienteNegocio(ClienteDAO clienteDAO) {
        this.clienteDAO = clienteDAO;
    }

    public void registrarCliente(ClienteDTO clienteDTO) throws SQLException {
        Cliente cliente = new Cliente();
        cliente.setNombre(clienteDTO.getNombre());
        cliente.setApellidoPaterno(clienteDTO.getApellidoPaterno());
        cliente.setApellidoMaterno(clienteDTO.getApellidoMaterno());
        cliente.setCorreo(clienteDTO.getCorreo());
        cliente.setFechaNacimiento(clienteDTO.getFechaNacimiento());
        cliente.setLatitud(clienteDTO.getLatitud());
        cliente.setLongitud(clienteDTO.getLongitud());
        cliente.setContrasena(clienteDTO.getContrasena());
        
        clienteDAO.crear(cliente);
    }
}

