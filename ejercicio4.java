/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author USUARIO 1
 */
public class ejercicio4 {

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int n = arr.length;
        double promedio = 0;
        for (int i = 0; i < n; i++) {
            promedio += arr[i];
        }
        promedio /= n;
        int contador = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > promedio) {
                contador++;
            }
        }
        System.out.println("El promedio es: " + promedio);
        System.out.println("Hay " + contador + " números mayores que el promedio.");
    }
}
