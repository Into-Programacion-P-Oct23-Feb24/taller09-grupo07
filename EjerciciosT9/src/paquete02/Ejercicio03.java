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
        int suma = 0;
        int promedio;
        String resultado = "";
        int[] arreglo = {1, 10, 11, 12, 12, 13, 16, 2, 3, 4, 9, 10, 21};
        for (int i = 0; i < arreglo.length; i++) {
            suma = suma + arreglo[i];
            promedio = suma / 13;
            if (arreglo[i] > promedio) {
                resultado = String.format("%s%d",
                         resultado, arreglo[i]);
            } else {
                if (arreglo[i] < promedio) {
                    resultado = String.format("%s%d",
                             resultado, arreglo[i]);
                }
            }
        }
        System.out.printf("%s", resultado);
    }

}
