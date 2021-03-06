package poo_1;

import java.util.Scanner;
public class Piramide{
    public static void main(String[] args) {
        int cantidad;
        boolean resp;
        Scanner t = new Scanner(System.in);
        System.out.println("Cuantas columnas tendra la piramide?");
        cantidad = t.nextInt();
        
                for (int i = 0; i < cantidad; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }       
    }
} 
