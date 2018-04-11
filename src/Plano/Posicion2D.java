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
    
    private static final double limMinX = -1000;
    private static final double limMinY = -1000;
    private static final double limMaxX = 1000;
    private static final double limMaxY = 1000;
    private double x;
    private double y;

    public Posicion2D (){
    
     x=0;
     y=0;
    }

    
    public Posicion2D (double x, double y) throws FueraDelPlanoException{
        try{
            this.setX(x);
            this.setY(y);
        }catch (FueraDelPlanoException ex){
            System.out.println(ex) ;  
        }
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
    public void setX(double x) throws FueraDelPlanoException {
        if (x<=limMaxX && x>=limMinX){
        this.x = x;
        }
        else {
          throw new FueraDelPlanoException("Ingrese un valor de X entre el limte maximo " + limMaxX + "y el valor minimo " + limMinX);  
        }
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
    public void setY(double y)throws FueraDelPlanoException {
         if (y<=limMaxY && y>=limMinY){
        this.y = y;
        }
        else {
          throw new FueraDelPlanoException("Ingrese un valor entre el limte maximo y minimo");  
        }
    }
   

}
