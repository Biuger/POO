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
public abstract class Persona {
    protected String nombre; 
    protected String apellidos; 
    protected int edad;
    
    public abstract void setNombre(String nombre);
    public abstract String getNombre();
    
    public abstract void setApellidos(String apellidos);
    public abstract String getApellidos();
    
    public abstract void setEdad (int edad);
    public abstract int getEdad();
}
