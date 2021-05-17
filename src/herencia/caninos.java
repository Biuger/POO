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
public abstract class caninos extends mamifero{
    protected String olfato;
    
    public abstract void setOlfato(String amamantan);
    public abstract String getOlfato();
    
    @Override
    public void setAmamantan(String amamantan) {
        this.amamantan = amamantan;
    }
    @Override
    public String getAmamantan(){
        return amamantan;
    }
    
}
