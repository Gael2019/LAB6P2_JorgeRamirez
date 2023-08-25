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
public class ConsolaPortatil extends Consola {
    private String tamanoPantalla;
    private int duracionBateria;
    private boolean tieneEstuche;

    public ConsolaPortatil(String tamanoPantalla, int duracionBateria, boolean tieneEstuche) {
        this.tamanoPantalla = tamanoPantalla;
        this.duracionBateria = duracionBateria;
        this.tieneEstuche = tieneEstuche;
    }

    public ConsolaPortatil(String tamanoPantalla, int duracionBateria, boolean tieneEstuche, int identificacion, String fabricante, int anosUso, double precio, ArrayList<Juego> juegosDisponibles, String modelo) {
        super(identificacion, fabricante, anosUso, precio, juegosDisponibles, modelo);
 
    }
    
    public String getTamanoPantalla() {
        return tamanoPantalla;
    }

    public void setTamanoPantalla(String tamanoPantalla) {
        this.tamanoPantalla = tamanoPantalla;
    }

    public int getDuracionBateria() {
        return duracionBateria;
    }

    public void setDuracionBateria(int duracionBateria) {
        this.duracionBateria = duracionBateria;
    }

    public boolean isTieneEstuche() {
        return tieneEstuche;
    }

    public void setTieneEstuche(boolean tieneEstuche) {
        this.tieneEstuche = tieneEstuche;
    }

    @Override
    public String toString() {
        return "ConsolaPortatil{" + "tamanoPantalla=" + tamanoPantalla + ", duracionBateria=" + duracionBateria + ", tieneEstuche=" + tieneEstuche + '}';
    }
    
    
}
