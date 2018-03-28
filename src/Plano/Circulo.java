/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Plano;
import java.lang.Math;

/**
 *
 * @author utku33
 */
public class Circulo extends Figura2D {
    

    private final int LADOS = 0;
    
    private double radio;
/**
 * 
 * 
 * @param radio  Radio del 
 * 
 */
    public Circulo (double radio){
        super(0,0);
        this.radio = radio;
    }
    /**
     * 
     * @param radio Radio dle circulo a crear.
     * @param x valor que va a tomar x en la posicion del circulo
     * @param y valor que va a tomar y en la posicion del circulo
     */
  
     public Circulo (double radio, double x, double y){
     super(x,y);
     this.radio = radio;
    }
   
     /**
      * Calcula el perimetro del Circulo en base al radio. 
      *  @return Perimetro del Circulo 
      */
    
    @Override
    public double Perimetro (){
    double perimetro;
    perimetro= (2*Math.PI*this.getRadio());
    return perimetro;
    }
    /**
     * Calcula la superficie del Circulo en base al radio.
     * @return Superficie del Circulo
     */
    public double Superficie(){
    double superficie;
    superficie = (Math.PI*(this.getRadio() * this.getRadio()));
    return superficie;
    }
    
    /**
     * 
     * @param a se pasa una posicion que no se utiliza pero permite utilizar el
     *          mismo llamado indistinto de que Figuara2D lo utiliza.
     * @return La distancia del centro del circulo al perimetro del mismo
     *          utilizando el valor del radio del mismo.
     */
    
    public double DistanciaPerimetro(Posicion2D a){
    return radio;
    }
    
     /**
     * @return the LADOS
     */
    public int getLADOS() {
        return LADOS;
    }

    /**
     * @return the radio
     */
    public double getRadio() {
        return radio;
    }

    /**
     * @param radio the radio to set
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }
    
}
