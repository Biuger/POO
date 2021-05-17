/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2_t1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author INFO-ANGELDAVIDMEDIN
 */
public class main_herencia {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Scanner t = new Scanner(System.in);
        int opcion2 = 0;
        boolean volver = true;
        int ver = 0;
        boolean volver2 = false;
        boolean volver3 = false;
        
        Cliente cliente = new Cliente();
        Administrador admin = new Administrador();
        Usuario usuario = new Usuario();
        
        int opcion = 0;
        
        System.out.println("SISTEMA SENCILLITO COOP DESARROLLO");
        do{
        System.out.println("1- registrar");
        System.out.println("2- mostrar info");
        System.out.println("0- salir");
            System.out.print("accion a realizar: ");
        opcion = t.nextInt();
        if (opcion==1) {
            System.out.println("1- cliente");
            System.out.println("2- usuario ");
            System.out.println("3- administrador");
            while(volver2==false){
            System.out.print("que desea registrar?: ");
            opcion2 = t.nextInt();
            
            
            if (opcion2==1) {
                volver2 = true;
                System.out.print("Id del cliente: ");
                cliente.setIdCliente(bf.readLine());
                System.out.print("nombre del cliente: ");
                cliente.setNombre(bf.readLine());
                System.out.print("apellidos del cliente: ");
                cliente.setApellidos(bf.readLine());
                System.out.print("edad del cliente: ");
                cliente.setEdad(t.nextInt());
                System.out.print("numero de cuenta: ");
                cliente.setNumeroDeCuenta(t.nextInt());
                System.out.print("saldo del cliente: $");
                cliente.setSaldo(t.nextDouble());
            }
            else if (opcion2==2) {
                volver2 = true;
                System.out.print("Id del usuario: ");
                usuario.setIdUsuario(bf.readLine());
                System.out.print("nombre del usuario: ");
                usuario.setNombre(bf.readLine());
                System.out.print("apellidos del usuario: ");
                usuario.setApellidos(bf.readLine());
                System.out.print("edad del usuario: ");
                usuario.setEdad(t.nextInt());
                
            }
            else if (opcion2==3) {
                volver2 = true;
                System.out.print("Id del administrador: ");
                admin.setIdAdmin(bf.readLine());
                System.out.print("nombre del administrador: ");
                admin.setNombre(bf.readLine());
                System.out.print("apellidos del administrador: ");
                admin.setApellidos(bf.readLine());
                System.out.print("edad del administrador: ");
                admin.setEdad(t.nextInt());
                System.out.print("contraseña del administrador: ");
                admin.setContraseña(bf.readLine());
                
            }
            else{
                volver2 = false;
                System.out.println("opcion no valida");
            }
        }
        }
        else if (opcion==2) {
            System.out.println("1- cliente");
            System.out.println("2- usuario ");
            System.out.println("3- administrador");
            while(volver3 == false){
            System.out.print("que informacion desea ver?: ");
            ver = t.nextInt();
            
            if (ver==1) {
                volver3 = true;
                System.out.println("nombre del cliente: " + cliente.getNombre());
                System.out.println("apellidos del cliente: " + cliente.getApellidos());
                System.out.println("edad del cliente: " + cliente.getEdad());
                System.out.println("numero de cuenta del cliente: " + cliente.getNumeroDeCuenta());
                System.out.println("saldo del cliente: " + cliente.getSaldo());
                
            }
            else if (ver==2) {
                volver3 = true;
                System.out.println("Id del usuario: " + usuario.getIdUsuario());
                System.out.println("nombre del usuario: " + usuario.getNombre());
                System.out.println("apellidos del cliente: " + usuario.getApellidos());
                System.out.println("edad del cliente: " + usuario.getEdad());
            }
            else if (ver==3) {
                volver3 = true;
                System.out.println("nombre del administrador: " + admin.getNombre());
                System.out.println("apellidos del administrador: " + admin.getApellidos());
                System.out.println("edad del administrador: " + admin.getEdad());
                System.out.println("contraseña del administrador: " + admin.getContraseña());        
            }
            else{
                volver3 = false;
                System.out.println("opcion no valida");
                
            }
        }
            
        }
        else if(opcion==0){
            volver = false; 
            System.out.println("sesión finalizada....");
            System.exit(0);
        }
    }while(volver==true);
    }
}
