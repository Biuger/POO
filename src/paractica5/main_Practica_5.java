/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paractica5;
import java.util.Scanner;

/**
 *
 * @author angel
 */
public class main_Practica_5 {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        practica_5[] indice;
        double num;  
        int tamaño = 10; 
        indice = new practica_5[tamaño];
        
        for (int i = 0; i < indice.length; i++) {
            indice[i] = new practica_5();
        }
        for (int i = 0; i < indice.length; i++) {
            System.out.print( (i+1) +"- numero: ");
            indice[i].setNumero(t.nextDouble());
        }
        System.out.print("Numero a buscar: ");
        num = t.nextDouble();
        
        if (num>=0 && num <= indice.length) {
                    for (int i = 0; i < indice.length; i++) {
            if (indice[i].getNumero()==num) {
                System.out.println("Numero encontrado en la pocicion: "+ i + ", recurde que el Indice comienza en 0");
            }
        }
        }
        else{
            System.out.println("ese numero no existe");
        }
        
    }
}
