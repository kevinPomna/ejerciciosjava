
package com.mycompany.mavenproject1;

import java.util.Scanner;


public class ejercicio3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de elementos del arreglo: ");
        int n = sc.nextInt();

        int[] arreglo = new int[n];

        // Pedir al usuario que ingrese los elementos del arreglo
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el elemento " + (i + 1) + " del arreglo: ");
            arreglo[i] = sc.nextInt();
        }

        int maximo = arreglo[0];
        int minimo = arreglo[0];

        // Encontrar el valor máximo y mínimo del arreglo
        for (int i = 1; i < n; i++) {
            if (arreglo[i] > maximo) {
                maximo = arreglo[i];
            }
            if (arreglo[i] < minimo) {
                minimo = arreglo[i];
            }
        }

        System.out.println("El valor máximo del arreglo es: " + maximo);
        System.out.println("El valor mínimo del arreglo es: " + minimo);
    }
}
