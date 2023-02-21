
package com.mycompany.smarttv;

/**
 *
 * @author Oscar
 */
public class SmartTv {
    private String marca;
    private int pulgadas;
    private int resolucion;

    public SmartTv() {
    }
    
    

    public SmartTv(String marca, int pulgadas, int resolucion) {
        this.marca = marca;
        this.pulgadas = pulgadas;
        this.resolucion = resolucion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    @Override
    public String toString() {
        return "SmartTv{" + "marca=" + marca + ", pulgadas=" + pulgadas + ", resolucion=" + resolucion + '}';
    }
    
    
    
}
