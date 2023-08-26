/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6p2_jorgeramirez;

import java.util.ArrayList;

/**
 *
 * @author Jorge Ramirez
 */
public class Consola {
    private int identificacion;
    private String fabricante;
    private int anosUso;
    private double precio;
    private ArrayList <Juego> juegosDisponibles;
    private String modelo;

    public Consola(int identificacion, String fabricante, int anosUso, double precio, String modelo) {
        this.identificacion = identificacion;
        this.fabricante = fabricante;
        this.anosUso = anosUso;
        this.precio = precio;
        this.modelo = modelo;
    }

    public Consola() {
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getAnosUso() {
        return anosUso;
    }

    public void setAnosUso(int anosUso) {
        this.anosUso = anosUso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public ArrayList<Juego> getJuegosDisponibles() {
        return juegosDisponibles;
    }

    public void setJuegosDisponibles(ArrayList<Juego> juegosDisponibles) {
        this.juegosDisponibles = juegosDisponibles;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Consola{" + "identificacion=" + identificacion + ", fabricante=" + fabricante + ", anosUso=" + anosUso + ", precio=" + precio + ", juegosDisponibles=" + juegosDisponibles + ", modelo=" + modelo + '}';
    }
    
    
}


