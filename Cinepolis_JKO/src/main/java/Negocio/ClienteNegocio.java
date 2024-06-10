package Negocio;

import DTO.ClienteDTO;
import Persistencia.ClienteDAO;
import Persistencia.ConexionBD;
import Persistencia.PersistenciaException;
import entidad.Cliente;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClienteNegocio {

    ClienteDAO clienteDAO = new ClienteDAO(new ConexionBD());

    public ClienteNegocio() {

    }

    public ClienteNegocio(ClienteDAO clienteDAO) {
        this.clienteDAO = clienteDAO;
    }

    public void registrarCliente(ClienteDTO clienteDTO) throws NegocioException, PersistenciaException {
        // Validaciones de campos obligatorios
        if (clienteDTO.getNombre() == null || clienteDTO.getNombre().isEmpty()) {
            throw new NegocioException("El nombre es obligatorio.");
        }
        if (clienteDTO.getApellidoPaterno() == null || clienteDTO.getApellidoPaterno().isEmpty()) {
            throw new NegocioException("El apellido paterno es obligatorio.");
        }
        if (clienteDTO.getApellidoMaterno() == null || clienteDTO.getApellidoMaterno().isEmpty()) {
            throw new NegocioException("El apellido materno es obligatorio.");
        }
        if (clienteDTO.getCorreo() == null || clienteDTO.getCorreo().isEmpty()) {
            throw new NegocioException("El correo electrónico es obligatorio.");
        }
        if (clienteDTO.getFechaNacimiento() == null) {
            throw new NegocioException("La fecha de nacimiento es obligatoria.");
        }
        if (clienteDTO.getContrasena() == null || clienteDTO.getContrasena().isEmpty()) {
            throw new NegocioException("La contraseña es obligatoria.");
        }

        // Validación de formato del correo electrónico
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(clienteDTO.getCorreo());
        if (!matcher.matches()) {
            throw new NegocioException("El formato del correo electrónico no es válido.");
        }

        // Validación de fecha de nacimiento (mayor de 18 años)
        LocalDate fechaNacimiento = clienteDTO.getFechaNacimiento();
        LocalDate ahora = LocalDate.now();
        if (Period.between(fechaNacimiento, ahora).getYears() < 18) {
            throw new NegocioException("El cliente debe ser mayor de 18 años.");
        }

        // Validación de contraseña (mínimo 8 caracteres, al menos una letra y un número)
        String contrasena = clienteDTO.getContrasena();
        if (contrasena.length() < 8 || !contrasena.matches(".*[a-zA-Z].*") || !contrasena.matches(".*\\d.*")) {
            throw new NegocioException("La contraseña debe tener al menos 8 caracteres, incluyendo letras y números.");
        }

        // Asignación de datos al objeto Cliente
        Cliente cliente = new Cliente();
        cliente.setNombre(clienteDTO.getNombre());
        cliente.setApellidoPaterno(clienteDTO.getApellidoPaterno());
        cliente.setApellidoMaterno(clienteDTO.getApellidoMaterno());
        cliente.setCorreo(clienteDTO.getCorreo());
        cliente.setFechaNacimiento(clienteDTO.getFechaNacimiento());
        cliente.setContrasena(clienteDTO.getContrasena());

        // Registro del cliente
        clienteDAO.crear(cliente);
    }

    public List<Cliente> obtenerClientes() throws PersistenciaException {
        return clienteDAO.obtenerClientesSinUBI();

    }
}
