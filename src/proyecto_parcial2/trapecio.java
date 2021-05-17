/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_parcial2;

/**
 *
 * @author INFO-ANGELDAVIDMEDIN
 */
public class trapecio extends cuadrilatero{
    protected double altura;
    protected double areaTrapecio;

    public double getAreaTrapecio() {
        return areaTrapecio;
    }

    public void setAreaTrapecio(double areaTrapecio) {
        this.areaTrapecio = areaTrapecio;
    }

    public double getAltura() {
        return altura;
    }
    
    public void setAltura(double altura) {
        this.altura = altura;
    }
    @Override
    public double getX() {
        return x;
    }
    @Override
    public void setX(double x) {
        this.x = x;
    }
    @Override
    public double getY() {
        return y;
    }
    @Override
    public void setY(double y) {
        this.y = y;
    }
    
}
