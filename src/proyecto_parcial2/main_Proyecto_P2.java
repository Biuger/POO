/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_parcial2;

import java.util.Scanner;

/**
 *
 * @author INFO-ANGELDAVIDMEDIN
 */
public class main_Proyecto_P2 {
    public static void main(String[] args) {
        int opcion;
        boolean ciclo;
        Scanner t = new Scanner(System.in);
        
        Cuadrado cuadrado = new Cuadrado();
        rectangulo Rectangulo = new rectangulo();
        trapecio Trapecio = new trapecio();
        
        do{
        System.out.println("Seleccione la figura de la cual desea obtener el area");
        System.out.println("1- cuadrado");
        System.out.println("2- rectangulo");
        System.out.println("3- trapecio");
        System.out.println("0- salir");
            System.out.print("opcion a elegir: ");
        opcion = t.nextInt();
        if (opcion==1) { 
            System.out.println(" ===> CUADRADO <===");
            System.out.print("valor del lado: ");
            cuadrado.setX(t.nextDouble());
            
            
            cuadrado.setAreaCuadrado(cuadrado.getX() * cuadrado.getX());
            System.out.println("el area del cuadrado es: " + cuadrado.getAreaCuadrado() + " unidades");
            System.out.println("");
            ciclo = true;
        }
        else if(opcion==2){
            ciclo = true;
            System.out.println("===> RECTANGULO <===");
            System.out.print("valor de la base: " );
            Rectangulo.setX(t.nextDouble());
            System.out.println("valor de la altura: ");
            Rectangulo.setY(t.nextDouble());
            
            Rectangulo.setAreaRectangulo(Rectangulo.getX() * Rectangulo.getY());
            System.out.println("el area del rectangulo es: "+ Rectangulo.getAreaRectangulo()+ " unidades");
            System.out.println("");
        }
        else if (opcion==3) {
                System.out.println("===> TRAPECIO <===");
                System.out.print("valor de la base mayor: " );
                Trapecio.setX(t.nextDouble());
                System.out.print("valor de la base menor: " );
                Trapecio.setY(t.nextDouble());
                System.out.print("valor de la altura: ");
                Trapecio.setAltura(t.nextDouble());
                
                Trapecio.setAreaTrapecio( (Trapecio.getX() + Trapecio.getY())*Trapecio.getAltura() / 2 );
                System.out.println("el area del trapecio es: "+ Trapecio.getAreaTrapecio()+ " unidades");
                System.out.println("");
            }
        else if (opcion==0) {
            ciclo = false;
                System.out.println("programa finalizado finalizado...");
                    System.exit(0);
            }
              
         }while(ciclo=true);
    }
}
