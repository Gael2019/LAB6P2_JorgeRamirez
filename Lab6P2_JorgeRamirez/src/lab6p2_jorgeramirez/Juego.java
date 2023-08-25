/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6p2_jorgeramirez;

/**
 *
 * @author Jorge Ramirez
 */
public class Juego {
    private String nombre;
    private String descripcion;
    private String fechaLanzamiento;
    private double precio;
    private String estado;
    private boolean rentable;
    private boolean agregado;
    private int cantidadDisponible;

    public Juego() {
    }

    public Juego(String nombre, String descripcion, String fechaLanzamiento, double precio, String estado, boolean rentable, boolean agregado, int cantidadDisponible) {
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

    public String getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public void setFechaLanzamiento(String fechaLanzamiento) {
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

    public boolean isRentable() {
        return rentable;
    }

    public void setRentable(boolean rentable) {
        this.rentable = rentable;
    }

    public boolean isAgregado() {
        return agregado;
    }

    public void setAgregado(boolean agregado) {
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
