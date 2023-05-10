
package com.mycompany.mavenproject1;

public class ejercicio5 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 2, 9};
        int n = arr.length;
        boolean estaOrdenado = true;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                estaOrdenado = false;
                break;
            }
        }
        if (estaOrdenado) {
            System.out.println("El arreglo está ordenado en orden ascendente.");
        } else {
            System.out.println("El arreglo no está ordenado en orden ascendente.");
        }
    }
}
