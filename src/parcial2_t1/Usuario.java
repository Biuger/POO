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
public class Usuario extends Persona {
    protected String IdUsuario;

    public String getIdUsuario() {
        return IdUsuario;
    }

    public void setIdUsuario(String IdUsuario) {
        this.IdUsuario = IdUsuario;
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
