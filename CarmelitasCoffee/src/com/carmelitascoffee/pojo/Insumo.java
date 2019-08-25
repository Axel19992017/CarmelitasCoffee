package com.carmelitascoffee.pojo;
// Generated 08-05-2019 01:35:41 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Insumo generated by hbm2java
 */
public class Insumo  implements java.io.Serializable {


     private int idInsumo;
     private String descripcion;
     private Integer cantidadInventario;
     private Set detalleFacturaInsumos = new HashSet(0);

    public Insumo() {
    }

	
    public Insumo(int idInsumo) {
        this.idInsumo = idInsumo;
    }
    public Insumo(int idInsumo, String descripcion, Integer cantidadInventario, Set detalleFacturaInsumos) {
       this.idInsumo = idInsumo;
       this.descripcion = descripcion;
       this.cantidadInventario = cantidadInventario;
       this.detalleFacturaInsumos = detalleFacturaInsumos;
    }
   
    public int getIdInsumo() {
        return this.idInsumo;
    }
    
    public void setIdInsumo(int idInsumo) {
        this.idInsumo = idInsumo;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Integer getCantidadInventario() {
        return this.cantidadInventario;
    }
    
    public void setCantidadInventario(Integer cantidadInventario) {
        this.cantidadInventario = cantidadInventario;
    }
    public Set getDetalleFacturaInsumos() {
        return this.detalleFacturaInsumos;
    }
    
    public void setDetalleFacturaInsumos(Set detalleFacturaInsumos) {
        this.detalleFacturaInsumos = detalleFacturaInsumos;
    }




}

