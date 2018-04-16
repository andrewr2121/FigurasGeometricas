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
     * @throws Plano.FueraDelPlanoExeption 
     * @throws Plano.DimensionIncorrectaException 
 * 
 */
    public Circulo (double radio) throws FueraDelPlanoException, DimensionIncorrectaException {
           super(0,0);
           this.Id= "Circulo-" + this.nroOrden;
           this.setRadio(radio);
     }
    /**
     * 
     * @param radio Radio dle circulo a crear.
     * @param x valor que va a tomar x en la posicion del circulo
     * @param y valor que va a tomar y en la posicion del circulo
     * @throws Plano.FueraDelPlanoExeption
     * @throws Plano.DimensionIncorrectaException
     */
  
     public Circulo (double radio, double x, double y) throws FueraDelPlanoException, DimensionIncorrectaException{
     super(x,y);
     this.Id= "Circulo-" + this.nroOrden;
     this.setRadio(radio);
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
     * @throws Plano.DimensionIncorrectaException
     */
    public void setRadio(double radio)throws DimensionIncorrectaException {
       if(radio>0){
        this.radio = radio;
        }
       else {
           throw new DimensionIncorrectaException("Ingrese un valor mayor a 0");
       }
    }  
    
        protected void CalcularExtremos()throws FueraDelPlanoException {
        Posicion2D vsup;
        Posicion2D vd;
        Posicion2D vi;
        Posicion2D vinf;
        vsup = new Posicion2D (this.posicion.getX(),this.posicion.getY()+this.radio);
        vd = new Posicion2D(this.posicion.getX()+this.radio,this.posicion.getY());
        vi = new Posicion2D (this.posicion.getX()-this.radio,this.posicion.getY());
        vinf = new Posicion2D (this.posicion.getX(),this.posicion.getY()-this.radio);
    }
    
}
