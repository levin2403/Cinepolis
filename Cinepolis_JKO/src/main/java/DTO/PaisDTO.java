/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import entidad.*;

/**
 *
 * @author jesus
 */
public class PaisDTO {
    
    private int idPais;
    private String nombre;

    public PaisDTO() {
    }

    public PaisDTO(int idPais, String nombre) {
        this.idPais = idPais;
        this.nombre = nombre;
    }

    public int getIdPais() {
        return idPais;
    }

    public void setIdPais(int idPais) {
        this.idPais = idPais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}
