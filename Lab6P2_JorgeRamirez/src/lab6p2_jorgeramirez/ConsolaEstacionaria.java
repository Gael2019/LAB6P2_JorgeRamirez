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
public class ConsolaEstacionaria extends Consola {
    private int numControles;
    private String almacenamiento;
    private String tipoConexion;

    public ConsolaEstacionaria(int numControles, String almacenamiento, String tipoConexion) {
        this.numControles = numControles;
        this.almacenamiento = almacenamiento;
        this.tipoConexion = tipoConexion;
    }

    public int getNumControles() {
        return numControles;
    }

    public void setNumControles(int numControles) {
        this.numControles = numControles;
    }

    public String getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(String almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public String getTipoConexion() {
        return tipoConexion;
    }

    public void setTipoConexion(String tipoConexion) {
        this.tipoConexion = tipoConexion;
    }

    public ConsolaEstacionaria(int numControles, String almacenamiento, String tipoConexion, int identificacion, String fabricante, int anosUso, double precio, String modelo) {
        super(identificacion, fabricante, anosUso, precio,modelo);
    }

    @Override
    public String toString() {
        return "ConsolaEstacionaria{" + "numControles=" + numControles + ", almacenamiento=" + almacenamiento + ", tipoConexion=" + tipoConexion + '}';
    }
    
    
}
