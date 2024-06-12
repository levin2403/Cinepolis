/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Persistencia.interfaces;

import entidad.Sucursal;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author skevi
 */
public interface ISucursalDAO {
    
    
    public void agregarSucursal(Sucursal sucursal) throws SQLException;
    
    public List<Sucursal> obtenerSucursales() throws SQLException;
        
    
}
