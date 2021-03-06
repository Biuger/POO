package poo_1;
import java.util.Scanner;
public class OrdenDeNumeros {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int numero[], cantidad, auxiliar;
        
        System.out.print("Cantidad de numeros a capturar: ");
        cantidad = t.nextInt();
        numero = new int[cantidad];
        
        for (int i = 0; i < cantidad; i++) {
            System.out.print((i+1) + "- numero: ");
            numero[i] = t.nextInt();
        }
        for (int i = 0; i < (cantidad-1); i++) {
            for (int j = 0; j < (cantidad-1); j++) {
                if (numero[j] > numero[j+1]) {
                    auxiliar = numero[j];
                    numero[j] = numero[j+1];
                    numero[j+1] = auxiliar;  
                }
            }
        }
        System.out.println("El orden de los numeros es: ");
        for (int i = 0; i < cantidad; i++) {
            System.out.print(numero[i] + ", ");
        }
    }
}
