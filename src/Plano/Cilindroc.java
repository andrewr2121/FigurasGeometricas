/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Plano;

/**
 *
 * @author Alumno
 */
public class Cilindroc {
    
    public Circulo base;
    private double largo;
    private double radio;
    
    public Cilindroc (double radio, double largo){
    
        this.base = new Circulo(radio);
        this.largo = largo;
    }

    public double Superficie(){
        double superficie;
        superficie = ((base.Perimetro() * largo)+(2*base.Superficie()));
        return superficie;
     }
    
    public double Volumen (){
        double volumen;
        volumen = (base.Superficie()* largo);
        return volumen;
    }
    
}
