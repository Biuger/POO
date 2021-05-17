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
public class gato extends felinos{
    protected String maullar;
    
    public gato(){
        this.amamantan = "si";
        this.años = "12 años de vida promedio";
        this.color = "muchos colores";
        this.maullar = "maullan";
        this.oido = "agudo";
        this.comp = "hostil";
    }

    public String getMaullar() {
        return maullar;
    }

    public void setMaullar(String maullar) {
        this.maullar = maullar;
    }
    
    @Override
    public void setOido(String oido) {
        this.oido = oido;
    }
    @Override
    public String getOido(){
        return oido;
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
