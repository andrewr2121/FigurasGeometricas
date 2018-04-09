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
     * @throws Plano.DimensionIncorrectaException
     */
    public Triangulo (float lado1, float lado2, float lado3) throws FueraDelPlanoException, DimensionIncorrectaException{
    super(0,0);
    this.setLado1(lado1);
    this.setLado2(lado2);
    this.setLado3(lado3);
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
    public Triangulo (float lado1, float lado2, float lado3, double x, double y)throws FueraDelPlanoException{
        super(x,y);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    } 
    
    
    public double Perimetro (){
    
    double perimetro;
    perimetro = (getLado1() + getLado2() + getLado3());
    return perimetro;
    
    }
  
    public double Superficie (){
    double superficie;
    double semip;
    double calc1;
    semip = (this.Perimetro()/2);
    calc1 = (semip*(semip - this.getLado1())*(semip - this.getLado2())*(semip - this.getLado3()));
    superficie = Math.sqrt(calc1);
    return superficie;
    
    }

    /**
     * @return the LADOS
     */
    public int getLADOS() {
        return LADOS;
    }

    /**
     * @return the lado1
     */
    public float getLado1() {
        return lado1;
    }

    /**
     * @param lado1 the lado1 to set
     */
    public void setLado1(float lado1) throws DimensionIncorrectaException {
        if(lado1>0){
        this.lado1 = lado1;
        }
        else{
            throw new DimensionIncorrectaException ("Ingrese un valor mayor a 0");
        }
    }
        
    /**
     * @return the lado2
     */
    public float getLado2() {
        return lado2;
    }

    /**
     * @param lado2 the lado2 to set
     * @throws Plano.DimensionIncorrectaException
     */
    public void setLado2(float lado2) throws DimensionIncorrectaException {
        if(lado2>0){
        this.lado2 = lado2;
        }
        else{
            throw new DimensionIncorrectaException ("Ingrese un valor mayor a 0");
        }
    }

    /**
     * @return the lado3
     */
    public float getLado3() {
        return lado3;
    }

    /**
     * @param lado3 the lado3 to set
     * @throws Plano.DimensionIncorrectaException
     */
    public void setLado3(float lado3)  throws DimensionIncorrectaException {
        if(lado3>0){
        this.lado3 = lado3;
        }
        else{
            throw new DimensionIncorrectaException ("Ingrese un valor mayor a 0");
        }
    }
    
 public double DistanciaPerimetro(Posicion2D a){
  return 0;
  }
 
  protected void CalcularExtremos () throws FueraDelPlanoException{}
    
}
