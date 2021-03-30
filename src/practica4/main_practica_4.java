package practica4;
import java.util.Scanner;
public class main_practica_4 {
    
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        Practica_4[] promedio;
        int tamaño=10;
        double suma=0;
        double resultado=0;
        promedio = new Practica_4[tamaño];
        
        for (int i = 0; i < promedio.length ; i++) {
            promedio[i] = new Practica_4();
        }
        for (int i = 0; i < tamaño; i++) {
            System.out.print((i+1) +"- numero: ");
            promedio[i].setNumero(t.nextDouble());
            System.out.println("");
            suma += promedio[i].getNumero();
        } 
        System.out.println("numeros capturados: ");
        for (int i = 0; i < promedio.length; i++) {
            System.out.println("" + promedio[i].getNumero());
        }
        resultado = suma / tamaño;
        System.out.println("El promedio final es de: " + resultado);
    }
}

