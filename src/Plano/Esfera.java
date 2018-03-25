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
public class Esfera extends Figura3D{
    
     private double radio;
     
     public Esfera (double radio){
     
     this.radio = radio;
     
     }
     
     public double Superficie() {
        double superficie;
        superficie = (4*(Math.PI*(this.radio * this.radio)));
        return superficie;
        }
     
     public double Volumen(){
         double volumen;
         volumen = ((4*(Math.PI* Math.pow(this.radio, 3)))/3);
         return volumen;
     }
    
}
