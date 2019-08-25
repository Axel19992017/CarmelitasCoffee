package com.carmelitascoffee.pojo;
// Generated 08-05-2019 01:35:41 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Orden generated by hbm2java
 */
public class Orden  implements java.io.Serializable {


     private int idOrden;
     private Cliente cliente;
     private Empleado empleado;
     private String numeroFactura;
     private Date fechaOrden;
     private Date fechaEntrega;
     private Date fechaRequerida;
     private String tipoOrden;
     private Set detalleOrdenProductos = new HashSet(0);
     private Set detalleOrdenServicios = new HashSet(0);

    public Orden() {
    }

	
    public Orden(int idOrden, Cliente cliente, Empleado empleado) {
        this.idOrden = idOrden;
        this.cliente = cliente;
        this.empleado = empleado;
    }
    public Orden(int idOrden, Cliente cliente, Empleado empleado, String numeroFactura, Date fechaOrden, Date fechaEntrega, Date fechaRequerida, String tipoOrden, Set detalleOrdenProductos, Set detalleOrdenServicios) {
       this.idOrden = idOrden;
       this.cliente = cliente;
       this.empleado = empleado;
       this.numeroFactura = numeroFactura;
       this.fechaOrden = fechaOrden;
       this.fechaEntrega = fechaEntrega;
       this.fechaRequerida = fechaRequerida;
       this.tipoOrden = tipoOrden;
       this.detalleOrdenProductos = detalleOrdenProductos;
       this.detalleOrdenServicios = detalleOrdenServicios;
    }
   
    public int getIdOrden() {
        return this.idOrden;
    }
    
    public void setIdOrden(int idOrden) {
        this.idOrden = idOrden;
    }
    public Cliente getCliente() {
        return this.cliente;
    }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Empleado getEmpleado() {
        return this.empleado;
    }
    
    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
    public String getNumeroFactura() {
        return this.numeroFactura;
    }
    
    public void setNumeroFactura(String numeroFactura) {
        this.numeroFactura = numeroFactura;
    }
    public Date getFechaOrden() {
        return this.fechaOrden;
    }
    
    public void setFechaOrden(Date fechaOrden) {
        this.fechaOrden = fechaOrden;
    }
    public Date getFechaEntrega() {
        return this.fechaEntrega;
    }
    
    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }
    public Date getFechaRequerida() {
        return this.fechaRequerida;
    }
    
    public void setFechaRequerida(Date fechaRequerida) {
        this.fechaRequerida = fechaRequerida;
    }
    public String getTipoOrden() {
        return this.tipoOrden;
    }
    
    public void setTipoOrden(String tipoOrden) {
        this.tipoOrden = tipoOrden;
    }
    public Set getDetalleOrdenProductos() {
        return this.detalleOrdenProductos;
    }
    
    public void setDetalleOrdenProductos(Set detalleOrdenProductos) {
        this.detalleOrdenProductos = detalleOrdenProductos;
    }
    public Set getDetalleOrdenServicios() {
        return this.detalleOrdenServicios;
    }
    
    public void setDetalleOrdenServicios(Set detalleOrdenServicios) {
        this.detalleOrdenServicios = detalleOrdenServicios;
    }




}

