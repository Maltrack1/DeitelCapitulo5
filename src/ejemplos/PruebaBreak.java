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
public class PruebaBreak {
    public static void main(String[] args) {
        int cuenta;
        
        for (cuenta = 0; cuenta < 10; cuenta++) {
            if( cuenta == 5){
                break;
            }
            System.out.printf("%d ", cuenta);
        }
        
        System.out.printf("%n Salio del ciclo en cuenta = %d%n", cuenta);
    }
}
