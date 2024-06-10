/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package convertidores;

import DTO.BoletoDTO;
import entidad.Boleto;
import java.time.LocalDate;

/**
 *
 * @author skevi
 */
public class BoletoCVR {
    
    public BoletoDTO entidad_dto(Boleto boleto){
        int idBoleto = boleto.getIdBoleto();
        LocalDate fechaCompra = boleto.getFechaCompra();
        boolean estado = boleto.getEstado();
        int idCliente = boleto.getIdCliente();
        int idFuncion = boleto.getIdFuncion();
        return new BoletoDTO(idBoleto, fechaCompra, estado, idCliente, idFuncion);
    }
    
    public Boleto dto_entidad(BoletoDTO boletoDTO){
        LocalDate fechaCompra = boletoDTO.getFechaCompra();
        boolean estado = boletoDTO.getEstado();
        int idCliente = boletoDTO.getIdCliente();
        int idFuncion = boletoDTO.getIdFuncion();
        return new Boleto(fechaCompra, estado, idCliente, idFuncion);
    }
    
}
