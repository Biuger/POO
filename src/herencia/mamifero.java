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
public abstract class mamifero extends Animales{
    protected String amamantan;;
    
    public abstract void setAmamantan(String amamantan);
    public abstract String getAmamantan();
   
            
    @Override
    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public String getColor(){
        return color;
    }
    @Override
    public void setAños(String años) {
        this.años = años;
    }
    @Override
    public String getAños(){
        return años;
    }
    
}
