/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author INFO-ANGELDAVIDMEDIN
 */
public abstract class Animales implements comportamiento{
 protected String color;
 protected String años;
 protected String comp;
 
 public abstract void setColor(String color);
 public abstract String getColor();
 
 public abstract void setAños(String años);
 public abstract String getAños();
 
 @Override
    public void setComp(String comp) {
        this.comp = comp;
    }
    @Override
    public String getComp(){
        return comp;
    }
}
