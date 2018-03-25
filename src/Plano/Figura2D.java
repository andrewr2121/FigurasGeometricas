/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Plano;

/**
 *
 * @author utku33
 */
public abstract class Figura2D extends FiguraGeometrica{
    
     Posicion2D posicion;
    
    public Figura2D (double x, double y){
    
        posicion = new Posicion2D (x, y);
    
    }
    
    
 
    
    public abstract double Perimetro ();
    
    public abstract double DistanciaPerimetro(Posicion2D a);
        
}
