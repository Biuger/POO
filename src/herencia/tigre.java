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
public class tigre extends felinos {
    protected String asechar;
    
    public tigre(){
        this.amamantan = "si";
        this.años = "12 años de vida promedio";
        this.color = "muchos colores";
        this.asechar = "asechan a sus presas";
        this.oido = "agudo";
        this.comp = "hostil";
    }

    public String getAsechar() {
        return asechar;
    }

    public void setAsechar(String maullar) {
        this.asechar = asechar;
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
