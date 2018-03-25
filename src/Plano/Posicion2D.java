/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Plano;
import java.lang.Math;

/**
 *
 * @author Alumno
 */
public class Posicion2D  {
    
    private double x;
    private double y;

    public Posicion2D (){
    
     x=0;
     y=0;
    }

    
    public Posicion2D (double x, double y){
    
     this.x=x;
     this.y=y;
    
    }
    
    public double Distancia (Posicion2D ab){
        double distancia;
        double ladox;
        double ladoy;
        ladox = Math.abs(DiferenciaX(ab));
        ladoy = Math.abs(DiferenciaY(ab));
        distancia = Math.hypot(ladox ,ladoy);
    return distancia;
     }
    
 
    public double DiferenciaX  (Posicion2D b){
        double diferenciaX = (Math.abs(getX() - b.getX()));
    return diferenciaX;
    }
  
    public double DiferenciaY  (Posicion2D b){
        double diferenciaY = (Math.abs(getY()- b.getY()));
    return diferenciaY;
    }

  

    /**
     * @return the x
     */
    public double getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public double getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(double y) {
        this.y = y;
    }
   
    
}
