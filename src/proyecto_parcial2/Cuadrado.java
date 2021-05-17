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
public class Cuadrado extends cuadrilatero {
    protected double areaCuadrado;

    public double getAreaCuadrado() {
        return areaCuadrado;
    }

    public void setAreaCuadrado(double areaCuadrado) {
        this.areaCuadrado = areaCuadrado;
    }

    @Override
    public void setX(double x) {
        this.x = x;
    }
    @Override
    public double getX(){
        return x;
    }
    @Override
    public void setY(double y) {
        this.y = y;
    }
    @Override
    public double getY(){
        return y;
    }

}
