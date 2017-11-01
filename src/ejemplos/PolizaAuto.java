/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

/**
 *
 * @author efrain
 */
public class PolizaAuto {
    private int numeroCuenta;
    private String marcaYModelo;
    private String estado;

    public PolizaAuto() {
    }

    public PolizaAuto(int numeroCuenta, String marcaYModelo, String estado) {
        this.numeroCuenta = numeroCuenta;
        this.marcaYModelo = marcaYModelo;
        this.estado = estado;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getMarcaYModelo() {
        return marcaYModelo;
    }

    public void setMarcaYModelo(String marcaYModelo) {
        this.marcaYModelo = marcaYModelo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    //Metodo predicado que devuelve si el estado tiene seguro sin culpa
    public boolean esEstadoSinCulpa(){
        boolean estadoSinCulpa;
        
        //Determina si el estado tiene seguro de auto sin culpa
        switch(getEstado()){
            case "MA":
            case "NJ":
            case "NY":
            case "PA":
                estadoSinCulpa = true;
                break;
            default:
                estadoSinCulpa = false;
                break;
        }
        
        return estadoSinCulpa;
    }
}
