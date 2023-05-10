
package com.mycompany.mavenproject1;

import java.util.Scanner;

public class ejercicios {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de elementos del arreglo: ");
        int n = sc.nextInt();
        
        int[] arreglo = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el elemento " + (i+1) + " del arreglo: ");
            arreglo[i] = sc.nextInt();
        }
        
        int suma = 0;
        for (int i = 0; i < n; i++) {
            suma += arreglo[i];
        }
        
        double promedio = (double) suma / n;
        
        System.out.println("El valor promedio de los elementos del arreglo es: " + promedio);
        
    }
          
}
