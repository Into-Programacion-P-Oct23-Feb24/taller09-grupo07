/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejercicio {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int n;
        int contador = 0;
        String marca;
        String resultado = "";
        System.out.println("Ingrese el numero de elementos que desea");
        
        // se pide el numero de elementos para el arreglo
        
        n = entrada.nextInt();
        
        // se guarda el numero de elementos del arreglo
        
        entrada.nextLine();
        
        // limpieza buffer
        
        String[] marcas = new String[n];
            
        while (contador < n) {
            System.out.println("Ingrese la marca de un automovil");
            marca = entrada.nextLine();
            String inicial = marca.substring(0, 1);
            if (inicial.equals("A") || inicial.equals("C")
                    || inicial.equals("T")) {
                System.out.println("ERROR, datos no permitidos");
            } else {
                marcas[contador] = marca;
                contador = contador + 1;
            }
            /* El while se utiliza para poder generar la restriccion donde se debe
            de re-hacer la pregunta sin aumentar el contador ni guardar la
            informacion en el arreglo, se utiliza un condicional para mayor
            facilidad
            */
        }
        for (int i = 0; i < marcas.length; i++) {
            resultado = String.format("%s%s\n", resultado, marcas[i]);
        }
        System.out.printf("%s", resultado);
    }

}
