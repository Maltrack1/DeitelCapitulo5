/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

import java.util.Scanner;

/**
 *
 * @author efrain
 */
public class CalificacionesLetra {
    public static void main(String[] args) {
        int total = 0;
        int contadorCalif = 0;
        int aCuenta = 0;
        int bCuenta = 0;
        int cCuenta = 0;
        int dCuenta = 0;
        int fCuenta = 0;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.printf("%s%n%s%n %s%n %s%n", 
                "Introduzca las calificaciones en el rango de 0-100.",
                "Escriba el indicador de fin de archivo para terminar la entrada:",
                "En UNIX/Linux/Mac OS escriba <Ctrl> d y oprima Intro",
                "En Windows escriba <Ctrl> z y oprima Intro");
        
        //Itera hasta que el usuario introduzca el indicador de fin de archivo
        while (entrada.hasNext()) {            
            int calificacion = entrada.nextInt();
            total += calificacion;
            ++contadorCalif;
            
            //Incrementa el contador de calificaion de letra apropiado
            switch(calificacion / 10){
                case 10:
                case 9://Calificacion entre 90 y 100
                    ++aCuenta;
                    break;//Sale del switch
                case 8://Calificacion entre 80 y 89
                    ++bCuenta;
                    break;//Sale del switch
                case 7://Calificacion entre 70 y 79
                    ++cCuenta;
                    break;//Sale del switch
                case 6://Calificacion entre 60 y 69
                    ++dCuenta;
                    break;//Sale del switch
                default://Calificacion menor a 60
                    ++fCuenta;
                    break;//Sale del switch
            }//Fin de swith
        }//Fin del while
        
        //Muestra reporte de calificaciones
        System.out.print("%nReporte de calificaciones:%n");
        
        //Si el usuario introdujo al menos una calificacion
        if(contadorCalif != 0){
            //Calcula el promedio de todas las calificaciones introducidas
            double promedio = (double) total / contadorCalif;
            
            //Muestra resumen de resultados en pantalla
            System.out.printf("El total de las %d calificaciones introducidas es %d%n", contadorCalif, total);
            System.out.printf("El promedio de la clase es %.2f%n", promedio);
            System.out.printf("%n%s%n%s%d%n%s%d%n%s%d%n%s%d%n%s%d%n",
                    "Numero de estudiantes que recibieron cada calificacion:",
                    "A: ", aCuenta,
                    "B: ", bCuenta,
                    "C: ", cCuenta,
                    "D: ", dCuenta,
                    "F: ", fCuenta);
        }else{//No se introdjeron califiaciones por lo que se muestra el mensaje apropiado
            System.out.println("No se introdujeron calificaciones");
        }
    }//Fin del main
}//Fin de la clase CalificacionesPrueba
