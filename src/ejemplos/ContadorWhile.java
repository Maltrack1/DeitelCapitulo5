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
public class ContadorWhile {

    public static void main(String[] args) {
        int contador = 1;

        while (contador <= 10) {//condicion de continuacion
            System.out.printf("%d ", contador);
            ++contador;//incremento de la variable de control
        }
        System.out.println();
    }
}
