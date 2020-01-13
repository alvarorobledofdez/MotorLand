
package Models;

public class Motor {
    private String modelo, fabricante;
    private int potencia, peso, cantidad;

    public Motor(){
        
    }

    public Motor(String modelo, String fabricante, int potencia, int peso, int cantidad) {
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.potencia = potencia;
        this.peso = peso;
        this.cantidad = cantidad;
    }
    
    
    
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
}
