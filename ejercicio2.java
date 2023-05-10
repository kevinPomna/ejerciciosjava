/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USUARIO 1
 */
public class ejercicio2 {

    public static void main(String[] args) {
        
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Ingrese la cantidad de elementos del arreglo: ");
        int n = sc.nextInt();

        int[] arreglo = new int[n];

        // Pedir al usuario que ingrese los elementos del arreglo
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el elemento " + (i + 1) + " del arreglo: ");
            arreglo[i] = sc.nextInt();
        }

        System.out.print("Ingrese el valor que desea buscar en el arreglo: ");
        int valor = sc.nextInt();

        // Comprobar si el valor está en el arreglo
        boolean encontrado = false;
        for (int i = 0; i < n; i++) {
            if (arreglo[i] == valor) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("El valor " + valor + " está en el arreglo.");
        } else {
            System.out.println("El valor " + valor + " no está en el arreglo.");
        }

    }
}
