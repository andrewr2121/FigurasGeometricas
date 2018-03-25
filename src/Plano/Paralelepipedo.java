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
public class Paralelepipedo extends Figura3D {
    
    private final int LADOS = 3;
    private double lado1;
    private double lado2;
    private double lado3;
    
    
public Paralelepipedo (double lado1, double lado2, double lado3){
    
    this.lado1 = lado1;
    this.lado2 = lado2;
    this.lado3 = lado3;
    
    }

public double Volumen (){
    double volumen;
    volumen = (this.lado1 * this.lado2 * this.lado3);
    return volumen;
}

public double Superficie(){
    double superficie;
    superficie = (2*((this.lado1*this.lado2) + (this.lado1*this.lado3) + (this.lado2*this.lado3)));
    return superficie;
}

}
