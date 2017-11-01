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
public class ContadorFor {
    public static void main(String[] args) {
        
        /*El encabezado de la intruccion for incluye la 
        inicializacion, la condicion de continuacion de 
        ciclo y el incremento*/
        for (int contador = 1; contador <= 10; contador++) {
            System.out.printf("%d ", contador);
        }
        System.out.println();
    }
}
