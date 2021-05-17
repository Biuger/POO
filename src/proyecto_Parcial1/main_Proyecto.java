/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_Parcial1;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
/**
 *
 * @author INFO-ANGELDAVIDMEDIN
 */
public class main_Proyecto {
    public static void main(String[] args){
        Scanner t = new Scanner(System.in);
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int tamaño = 0, opcion = 0, cartera, regreso2= 1, aux = 0, submenu = 0, buscarporcodigo;
        boolean resp = true, resp2 = true, regreso =true, regresosubmenu = true;
        String buscarpornombre;
        
        Proyecto[] Cliente;
    
        System.out.print("Cuantos clientes tendra la cartera: ");
        tamaño = t.nextInt();
        Cliente = new Proyecto[tamaño];
        cartera = tamaño;
        
        for (int i = 0; i < Cliente.length; i++) {
            Cliente[i] = new Proyecto();
        }
        
        while(regreso=true){
        
        do{
        System.out.println("====================================");
        System.out.println("Tamaño de la cartera: "+ tamaño);
        System.out.println("Espacios disponibles: " +cartera);
        System.out.println("1- agregar cliente");
        System.out.println("2- mostrar clientes");
        System.out.println("3- buscar cliente  ");
        System.out.println("0- Salir del sistema");
        System.out.print("que accion desea realizar?: ");
        opcion = t.nextInt();
        
        if (opcion == 1){
            
            if(cartera>0){
            try{
                regreso2 = 1;
                while(regreso2 !=0){
                    int i = aux;
                System.out.println(">> REGISTRAR CLIENTE <<");
                System.out.print("nuevo codigo del cliente " + (i+1) +": ");
                Cliente[i].setCodigocliente(t.nextInt());
                System.out.print("nuevo nombre del cliente "+ (i+1) +": ");
                Cliente[i].setNombre(bf.readLine());
                System.out.print("nuevo apellido paterno del cliente "+ (i+1) +": ");
                Cliente[i].setApellidoPaterno(bf.readLine());
                System.out.print("nuevo apellido materno del cliente "+ (i+1) +": ");
                Cliente[i].setApellidoMaterno(bf.readLine());
                System.out.print("nuevo telefono del cliente "+ (i+1) +": ");
                Cliente[i].setTelefono(bf.readLine());
                System.out.print("nueva direccion del cliente "+ (i+1) +": ");
                Cliente[i].setDireccion(bf.readLine());
                System.out.print("nueva edad del cliente "+ (i+1) +": ");
                Cliente[i].setEdad(t.nextInt()); 
                aux++;    
                cartera--;
                regreso2 = 0;
                    System.out.println("Se ha registrado el cliente correctamente!");
                }
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
                
            }
            else{
                System.out.println("================================================================");
                System.out.println("lo sentimos ya no quedan mas espacios disponibles en la cartera");
                System.out.println("=================================================================");
            }
            
        }
        else if(opcion==2){
            System.out.println(">> MOSTRAR CLIENTES <<");
            for (int i = 0; i < Cliente.length; i++) {
                
                System.out.println("===========> CLIENTE "+ (i+1) +" <==============");
                System.out.println(" Id del cliente "+ (i+1) +": " + Cliente[i].getCodigocliente() );
                System.out.println(" Nombre del cliente "+ (i+1) +": "+ Cliente[i].getNombre() );
                System.out.println(" Apellido paterno del cliente "+ (i+1) +": "+ Cliente[i].getApellidoPaterno() );
                System.out.println(" Apellido materno del cliente "+ (i+1) +": "+ Cliente[i].getApellidoMaterno() );
                System.out.println(" Direccion del cliente "+ (i+1) +": "+ Cliente[i].getDireccion() );
                System.out.println(" Telefono del cliente "+ (i+1) +": "+ Cliente[i].getTelefono() );
                System.out.println(" Edad del cliente "+ (i+1) +": "+ Cliente[i].getEdad() );
                
            }

            
        }
        else if(opcion==3){
            System.out.println(">> BUSCAR CLIENTES <<");
            System.out.println("1- buscar por codigo");
            System.out.println("2- buscar por nombre");
            System.out.println("0- Regresar al menu principal");
            do{
            System.out.print("Que accion desea tomar?: ");
            submenu = t.nextInt();
            if (submenu==1) {
                System.out.println(">> BUSCAR POR CODIGO <<");
                System.out.print("Ingresa el codigo del cliente que desea buscar: ");
                buscarporcodigo = t.nextInt();
                
                for (int i = 0; i < Cliente.length; i++) {
                    
                    if (Cliente[i].getCodigocliente() == buscarporcodigo) {
                        System.out.println("===========> CLIENTE "+ (i+1) +" <==============");
                        System.out.println(" Id del cliente "+ (i+1) +": " + Cliente[i].getCodigocliente() );
                        System.out.println(" Nombre del cliente "+ (i+1) +": "+ Cliente[i].getNombre() );
                        System.out.println(" Apellido paterno del cliente "+ (i+1) +": "+ Cliente[i].getApellidoPaterno() );
                        System.out.println(" Apellido materno del cliente "+ (i+1) +": "+ Cliente[i].getApellidoMaterno() );
                        System.out.println(" Direccion del cliente "+ (i+1) +": "+ Cliente[i].getDireccion() );
                        System.out.println(" Telefono del cliente "+ (i+1) +": "+ Cliente[i].getTelefono() );
                        System.out.println(" Edad del cliente "+ (i+1) +": "+ Cliente[i].getEdad());
                        
                    }

                } 

            }
            else if(submenu==2){
                try {
                    resp2 = true;
                    System.out.println(" >> BUSCAR POR NOMBRE <<");
                    System.out.print("Ingresa el nombre del cliente que desea buscar: ");
                    buscarpornombre = bf.readLine();
                    
                    for (int i = 0; i < Cliente.length; i++) {
                         
                        if (Cliente[i].getNombre().equals(buscarpornombre)){
                            System.out.println("===========> CLIENTE "+ (i+1) +" <==============");
                            System.out.println(" Id del cliente "+ (i+1) +": " + Cliente[i].getCodigocliente() );
                            System.out.println(" Nombre del cliente "+ (i+1) +": "+ Cliente[i].getNombre() );
                            System.out.println(" Apellido paterno del cliente "+ (i+1) +": "+ Cliente[i].getApellidoPaterno() );
                            System.out.println(" Apellido materno del cliente "+ (i+1) +": "+ Cliente[i].getApellidoMaterno() );
                            System.out.println(" Direccion del cliente "+ (i+1) +": "+ Cliente[i].getDireccion() );
                            System.out.println(" Telefono del cliente "+ (i+1) +": "+ Cliente[i].getTelefono() );
                            System.out.println(" Edad del cliente "+ (i+1) +": "+ Cliente[i].getEdad());
                        }
                    }
                } catch (Exception e) { 
                    System.out.println();
                }
            }
            else if(submenu==0){
                resp2 = true;
                while(regresosubmenu = false){  
                }
                System.out.println("Regresando...");
            }
            else{
                System.out.println("opcion no valida");
                resp2 = false;
            }
            }while(resp2 == false);
        }
        else if(opcion==0){
            System.out.println("Se ha finalizado el programa correctamente! 😀");
            System.exit(0); 
        }
        
        else{
            System.out.println("opcion no valida");
            resp = false;
        }
        }while(resp==false);
    }
    }
}
