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
public class Cilindro extends Figura3D{
    
    private double radio;
    private double largo;
    
    public Cilindro (double radio, double largo) {
     this.radio = radio;
     this.largo = largo;
    }
    
    public double Superficie(){
    double superficie;
    Circulo circulo1 = new Circulo (this.radio);
    superficie = ((circulo1.Perimetro() * this.largo)+(2*circulo1.Superficie()));
    return superficie;
    }
    
    public double Volumen (){
        double volumen;
        Circulo circulo1 = new Circulo (this.radio);
        volumen = (circulo1.Superficie()*this.largo);
        return volumen;
    }
    
}
