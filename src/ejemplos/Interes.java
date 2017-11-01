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
public class Interes {

    public static void main(String[] args) {
        double monto;//monto depositado al finl de cada año
        double principal = 1000.0;//Monto inicial antes de los intereses
        double tasa = 0.05;//Tasa de interes

        //Muestra los encabezados
        System.out.printf("%s%20s%n", "Anio", "Monto en deposito");

        //Calcula el monto en deposito para cada uno en diez años
        for (int anio = 1; anio <= 10; ++anio) {
            //Calcula el nuevo monto para el año especificado
            monto = principal * Math.pow(1.0 + tasa, anio);

            //Muestra el año y el monto
            System.out.printf("%4d%,20.2f%n", anio, monto);
        }
    }
}
