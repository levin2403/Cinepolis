

package Negocio;

import DTO.ClienteDTO;
import Persistencia.ClienteDAO;
import Persistencia.ConexionBD;
import Persistencia.PersistenciaException;
import convertidores.ClienteCVR;


public class ClienteNegocio {

    ClienteDAO clienteDAO = new ClienteDAO(new ConexionBD());
    ClienteCVR clienteCVR = new ClienteCVR();

    public ClienteNegocio() {

    }

    public ClienteNegocio(ClienteDAO clienteDAO) {
        this.clienteDAO = clienteDAO;
    }

    public void registrarCliente(ClienteDTO clienteDTO) throws NegocioException{
        try{
            clienteDAO.agregar(clienteCVR.dto_entidad(clienteDTO));
        }
        catch(PersistenciaException e){
            
        }
        
    }
}
