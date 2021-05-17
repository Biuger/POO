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
public class lobo extends caninos{
    protected String aullar;

    public lobo(){
        this.aullar ="aullan";
        this.amamantan ="si";
        this.años = "14 años de vida promedio";
        this.color = "muchos colores";
        this.olfato = "agudo";
        this.comp = "hostil";
    }
    public String getAullar() {
        return aullar;
    }

    public void setAullar(String aullar) {
        this.aullar = aullar;
    }
    
    @Override
    public void setOlfato(String amamantan) {
       this.olfato = olfato;
    }

    @Override
    public String getOlfato() {
       return olfato;
    }
    @Override
    public void setComp(String comp) {
        this.comp = comp;
    }
    @Override
    public String getComp(){
        return comp;
    }
}
