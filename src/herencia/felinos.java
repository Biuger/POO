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
public abstract class felinos extends mamifero{
    protected String oido;
    
    public abstract void setOido(String oido);
    public abstract String getOido();
    
    @Override
    public void setAmamantan(String amamantan) {
        this.amamantan = amamantan;
    }
    @Override
    public String getAmamantan(){
        return amamantan;
    }
}
