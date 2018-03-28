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
    
    /**
     *
     * @param radio Radio de la base del Cilindro
     * @param largo Largo del Cilindro
     */
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
    
    /**
     * Devuleve el volumen del Cilindro
     * @return Volumen tipo double
     */
    public double Volumen (){
        double volumen;
        Circulo circulo1 = new Circulo (this.radio);
        volumen = (circulo1.Superficie()*this.largo);
        return volumen;
    }
    
}
