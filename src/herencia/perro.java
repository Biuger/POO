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
public class perro extends caninos{
    protected String ladrar;
    
    public perro(){
        this.ladrar ="ladran";
        this.amamantan ="si";
        this.años = "entre 8 y 20 años de vida promedio";
        this.color = "muchos colores";
        this.olfato = "agudo";
        this.comp = "propicio";
   
    }
    public void setLadrar(String ladrar) {
        this.ladrar = ladrar;
    }
    public String getLadrar() {
        return ladrar;
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
