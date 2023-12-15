/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

/**
 *
 * @author reroes
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double suma = 0;
        int arriba = 0;
        int abajo = 0;
        int[] arreglo = {1, 10, 11, 12, 12, 13, 16, 2, 3, 4, 9, 10, 21};
        for (int i = 0; i < arreglo.length; i++) {
            suma = suma + arreglo[i];

        }
        double promedio = suma / arreglo.length;
        for (int j = 0; j < arreglo.length; j++) {
            if (arreglo[j] > promedio) {
                arriba++;
            } else {
                if (arreglo[j] < arreglo.length) {
                    abajo++;
                }
            }
        }
        System.out.printf("Promedio: %.2f\nCantidad de Elementos por "
                + "arriba del promedio: %d\nElementos por debajo del promedio: "
                + "%d\n",promedio,arriba,abajo);
    }

}
