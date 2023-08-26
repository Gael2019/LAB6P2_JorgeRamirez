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
    private int tamanoPantalla;
    private int duracionBateria;
    private String tieneEstuche;


    public ConsolaPortatil(int tamanoPantalla, int duracionBateria, String tieneEstuche, int identificacion, String fabricante, int anosUso, double precio, String modelo) {
        super(identificacion, fabricante, anosUso, precio, modelo);
 
    }
    
    public int getTamanoPantalla() {
        return tamanoPantalla;
    }

    public void setTamanoPantalla(int tamanoPantalla) {
        this.tamanoPantalla = tamanoPantalla;
    }

    public int getDuracionBateria() {
        return duracionBateria;
    }

    public void setDuracionBateria(int duracionBateria) {
        this.duracionBateria = duracionBateria;
    }

    public String isTieneEstuche() {
        return tieneEstuche;
    }

    public void setTieneEstuche(String tieneEstuche) {
        this.tieneEstuche = tieneEstuche;
    }

    @Override
    public String toString() {
        return "ConsolaPortatil{" + "tamanoPantalla=" + tamanoPantalla + ", duracionBateria=" + duracionBateria + ", tieneEstuche=" + tieneEstuche + '}';
    }
    
    
}
