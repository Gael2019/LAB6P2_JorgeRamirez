/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6p2_jorgeramirez;

import java.util.Date;

/**
 *
 * @author Jorge Ramirez
 */
public class Juego {
    private String nombre;
    private String descripcion;
    private Date fechaLanzamiento;
    private double precio;
    private String estado;
    private String rentable;
    private String agregado;
    private int cantidadDisponible;

    public Juego() {
    }

    public Juego(String nombre, String descripcion, Date fechaLanzamiento, double precio, String estado, String rentable, String agregado, int cantidadDisponible) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaLanzamiento = fechaLanzamiento;
        this.precio = precio;
        this.estado = estado;
        this.rentable = rentable;
        this.agregado = agregado;
        this.cantidadDisponible = cantidadDisponible;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public void setFechaLanzamiento(Date fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String isRentable() {
        return rentable;
    }

    public void setRentable(String rentable) {
        this.rentable = rentable;
    }

    public String isAgregado() {
        return agregado;
    }

    public void setAgregado(String agregado) {
        this.agregado = agregado;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

    @Override
    public String toString() {
        return "Juego{" + "nombre=" + nombre + ", descripcion=" + descripcion + ", fechaLanzamiento=" + fechaLanzamiento + ", precio=" + precio + ", estado=" + estado + ", rentable=" + rentable + ", agregado=" + agregado + ", cantidadDisponible=" + cantidadDisponible + '}';
    }
    
    
}
