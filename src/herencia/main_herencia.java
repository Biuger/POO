/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author INFO-ANGELDAVIDMEDIN
 */
public  class main_herencia {
    public static void main(String[] args) throws IOException {
         BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Scanner t = new Scanner(System.in);
         String opcion;
         int opcion2 = 0; 
         int opcion3 = 0;
         int opcion4 = 0;
         int opcion5 = 0;
         int opcion6 = 0;
         
         perro perraco = new perro();
         gato gatete = new gato();
         lobo lobenzo = new lobo();
         tigre tigrete = new tigre();
        
        System.out.println("menu animales 🐱");
        System.out.println("a. Mamifero");
        System.out.println("b. Ovíparo");
        opcion = bf.readLine();
        if (opcion.equals("a") || opcion.equals("A")) {
            System.out.println("1- canino");
            System.out.println("2- felino");
            opcion2 = t.nextInt();
            
            if (opcion2==1) {
                System.out.println("1- perro");
                System.out.println("2- lobo");
                opcion3 = t.nextInt();
                
                if (opcion3==1) {
                System.out.println(perraco.getLadrar());
                System.out.println("amamantan: "+perraco.getAmamantan());
                System.out.println("años: "+ perraco.getAños());
                System.out.println("color: "+ perraco.getColor());
                System.out.println("olfato: "+ perraco.getOlfato());
                    System.out.println("comportamiento:" + perraco.getComp());
                }
                else if (opcion3==2) {
                System.out.println(perraco.getLadrar());
                System.out.println("amamantan: "+lobenzo.getAmamantan());
                System.out.println("años: "+ lobenzo.getAños());
                System.out.println("color: "+ lobenzo.getColor());
                System.out.println("olfato: "+ lobenzo.getAullar());
                System.out.println("comportamiento:" + lobenzo.getComp());
                }
                else{
                    System.out.println("opcion no vaida, volvería a preguntar pero me dio flojera hacer el ciclo. Asi que aqui acabo");
                }
            }
            else if (opcion2==2) {
                System.out.println("1- gato ");
                System.out.println("2- tigre");
                
                if (opcion4==1) {
                   System.out.println(gatete.getMaullar());
                   System.out.println("amamantan: "+gatete.getAmamantan());
                    System.out.println("años: "+ gatete.getAños());
                    System.out.println("color: "+ gatete.getColor());
                    System.out.println("oido: "+ gatete.getOido());
                    System.out.println("comportamiento:" + gatete.getComp());
                }
                else if (opcion4==2) {
                    System.out.println(tigrete.getAsechar());
                    System.out.println("amamantan: "+tigrete.getAmamantan());
                    System.out.println("años: "+ tigrete.getAños());
                    System.out.println("color: "+ tigrete.getColor());
                    System.out.println("oido: "+ tigrete.getOido());
                    System.out.println("comportamiento:" + tigrete.getComp());
                }
                else{
                  System.out.println("opcion no vaida, volvería a preguntar pero me dio flojera hacer el ciclo. Asi que aqui acabo ");   
                }
            }
            else{
                System.out.println("opcion no vaida, volvería a preguntar pero me dio flojera hacer el ciclo. Asi que aqui acabo");
            }
        }
        else if (opcion.equals("b") || opcion.equals("B")) {
            System.out.println("1- ave");
            System.out.println("2- pez");
            opcion5 = t.nextInt();
            
            if (opcion5==1) {
                System.out.println("");
            }
            else if (opcion5==2) {
                System.out.println("");
            }
            else{
                System.out.println("opcion no vaida, volvería a preguntar pero me dio flojera hacer el ciclo. Asi que aqui acabo ");
            }
        }
        else{
            System.out.println("opcion no vaida, volvería a preguntar pero me dio flojera hacer el ciclo. Asi que aqui acabo ");
        }
    }
    }
  