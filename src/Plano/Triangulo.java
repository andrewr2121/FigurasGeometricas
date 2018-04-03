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
public class Triangulo extends Figura2D {
    
    private final int LADOS = 3;
    private float lado1;
    private float lado2;
    private float lado3;
    
    /**
     * Crea una objeto Triangulo con la posicion por defecto en las cordenadas (0,0)
     * @param lado1 Valor del Lado 1 del Triangulo
     * @param lado2 Valor del Lado 2 del Triangulo
     * @param lado3 Valor dle Lado 3 del Triangulo
     * @throws Plano.FueraDelPlanoExeption
     */
    public Triangulo (float lado1, float lado2, float lado3) throws FueraDelPlanoExeption{
    super(0,0);
    this.lado1 = lado1;
    this.lado2 = lado2;
    this.lado3 = lado3;
    }
    
    /**
     * Crea el objeto Triangulo en la posicion especificadas por los parametros
     * @param lado1 Valor del Lado 1 del Triangulo
     * @param lado2 Valor del Lado 1 del Triangulo
     * @param lado3 Valor del Lado 1 del Triangulo
     * @param x Parametro X para la posicion del triangulo
     * @param y Parametro Y para la posicion del triangulo
     * @throws Plano.FueraDelPlanoExeption
     */
    public Triangulo (float lado1, float lado2, float lado3, double x, double y)throws FueraDelPlanoExeption{
        super(x,y);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    } 
    
    
    public double Perimetro (){
    
    double perimetro;
    perimetro = (lado1 + lado2 + lado3);
    return perimetro;
    
    }
  
    public double Superficie (){
    double superficie;
    double semip;
    double calc1;
    semip = (this.Perimetro()/2);
    calc1 = (semip*(semip - this.lado1)*(semip - this.lado2)*(semip - this.lado3));
    superficie = Math.sqrt(calc1);
    return superficie;
    
    }
    
    
}
