/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2_t1;

/**
 *
 * @author INFO-ANGELDAVIDMEDIN
 */
public class Cliente extends Persona {
    protected String IdCliente;
    protected int NumeroDeCuenta;
    protected double saldo;

    public String getIdCliente() {
        return IdCliente;
    }

    public void setIdCliente(String IdCliente) {
        this.IdCliente = IdCliente;
    }

    public int getNumeroDeCuenta() {
        return NumeroDeCuenta;
    }

    public void setNumeroDeCuenta(int NumeroDeCuenta) {
        this.NumeroDeCuenta = NumeroDeCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre ;
    }
    @Override
    public String getNombre(){
        return nombre;
    } 
    @Override
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    @Override
    public String getApellidos(){
        return apellidos;
    }
    @Override
    public void setEdad(int edad) {
        this.edad = edad;
    }
    @Override
    public int getEdad(){
        return edad;
    }
}
