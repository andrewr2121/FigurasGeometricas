/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Plano;
import java.util.ArrayList;
import java.lang.Math;
import java.util.Iterator;

/**
 *
 * @author Alumno
 */
public class Plano {
    
    private ArrayList<Figura2D> figuras;
    private ArrayList<Circulo> circulos;
    private ArrayList<Rectangulo> rectangulos;

    public Plano (){
      
      figuras = new ArrayList<>();
      circulos = new ArrayList<>();
      rectangulos = new ArrayList<>();
    }
  
     public void addCirculo(Circulo x){
        circulos.add(x);
        figuras.add(x);
    }
  
    public void addRectangulo(Rectangulo x){
        rectangulos.add(x);
        figuras.add(x);
    }
  
 
    public double DistanciasFiguras (Figura2D a, Figura2D b){
        double distancia;
        distancia = a.posicion.Distancia(b.posicion); 
         return distancia;
    }
  

    
    public boolean Solapamiento (Figura2D a, Figura2D b){
        boolean solapamiento = false;
        double sumadistanciaperimetros;
        sumadistanciaperimetros = (a.DistanciaPerimetro(b.posicion)+ b.DistanciaPerimetro(a.posicion));
        if (DistanciasFiguras (a , b)<= sumadistanciaperimetros){
        solapamiento = true;
        }
      return solapamiento;
    }
  
    public boolean Solapamiento (Rectangulo x){
        boolean solapamiento = false;
            for (Figura2D b : figuras){
                if(Solapamiento(x, b)){
                    solapamiento = true;
                }   
            }
        return solapamiento;
    }
  
    public boolean Solapamiento (Circulo x){
        boolean solapamiento = false;
            for (Figura2D b : figuras){
                if(Solapamiento(x, b)){
                    solapamiento = true;
                }  
            }
        return solapamiento;
    }
  
    
    public static void main(String[] args) {
     
    /*   Triangulo triangulo1 = new Triangulo (3,4,5);
    *    Rectangulo rectangulo1 = new Rectangulo (6,8);
    *    Circulo circulo1 = new Circulo (6.8);
    *    Paralelepipedo paralelepipedo1 = new Paralelepipedo (6.97, 6.7, 5);
    *    Esfera esfera1 = new Esfera (9.8);
    *    Cilindro cilindro1 = new Cilindro (8.5 , 97);
    *    Cilindroc cilindro1c = new Cilindroc (8.5 , 97);
    *    
    *    System.out.println ("Trinagulo - " + "Perimetro: " + triangulo1.Perimetro() + " Superficie: " + triangulo1.Superficie());
    *    System.out.println ("Rectangulo - " + "Perimetro: " + rectangulo1.Perimetro() + " Superficie: " + rectangulo1.Superficie());
    *    System.out.println ("Circulo - " + "Perimetro: " + circulo1.Perimetro() + " Superficie: " + circulo1.Superficie());
    *    System.out.println ("Paralelepipedo - " + "Superficie: " + paralelepipedo1.Superficie()+ " Volumen: " + paralelepipedo1.Volumen());
    *    System.out.println ("Esfera - " + "Superficie: " + esfera1.Superficie()+ " Volumen: " + esfera1.Volumen());
    *    System.out.println ("Cilindro - " + "Superficie: " + cilindro1.Superficie()+ " Volumen: " + cilindro1.Volumen());
    *    System.out.println ("CilindroC - " + "Superficie: " + cilindro1c.Superficie()+ " Volumen: " + cilindro1c.Volumen());
    *    System.out.println("Radi de CilindroC: " + cilindro1c.base.getRadio());
     */   
        
        
        
    }
    
}
