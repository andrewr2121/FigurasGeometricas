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
public class Rectangulo extends Figura2D {
    
    private final int LADOS =4;
    private double ancho;
    private double alto;
       
    /**
     *
     * @param ancho
     * @param alto
     * @throws DimensionIncorrectaException
     * @throws FueraDelPlanoException
     */
    public Rectangulo(double ancho, double alto) throws DimensionIncorrectaException, FueraDelPlanoException {
    super(0,0);
    this.Id= "Rectangulo-" + this.nroOrden; 
    this.setAncho(ancho);
    this.setAlto(alto);
    }
    
    /**
     *
     * @param ancho
     * @param alto
     * @param x
     * @param y
     * @throws FueraDelPlanoException
     * @throws DimensionIncorrectaException
     */
    public Rectangulo(double ancho, double alto, double x, double y) throws FueraDelPlanoException,DimensionIncorrectaException {
    super(x,y);
    this.setAncho(ancho);
    this.setAlto(alto);
    this.Id= "Rectangulo-" + this.nroOrden;
    }
    
    @Override
    public double Perimetro(){
    double perimetro;
    perimetro =((this.getAncho()*2) + (this.getAlto() * 2));
    return perimetro;   
    }
    
   public double Superficie(){
    double superficie;
    superficie = (this.getAlto() * this.getAncho());
    return superficie;
    }
   
   public double DistanciaVertice(Rectangulo a){
   double distancia;
   distancia = Math.hypot(alto/2, ancho/2);
   return distancia;
   }
   
   
   public Posicion2D VerticeSupIzq (Rectangulo a)throws FueraDelPlanoException{    
     Posicion2D vizsq;    
     vizsq = new Posicion2D (a.LimiteIzquierdo(a),a.LimiteSuperior(a));
     return vizsq;  
    }
   
     public Posicion2D VerticeInfIzq (Rectangulo a)throws FueraDelPlanoException{    
     Posicion2D vizsq;    
     vizsq = new Posicion2D (a.LimiteIzquierdo(a),a.LimiteInferior(a));
     return vizsq;  
    }
     
     public Posicion2D VerticeSupDer (Rectangulo a)throws FueraDelPlanoException{    
     Posicion2D vizsq;    
     vizsq = new Posicion2D (a.LimiteDerecho(a),a.LimiteDerecho(a));
     return vizsq;  
    }
     
     public Posicion2D VerticeInfDer (Rectangulo a)throws FueraDelPlanoException{    
     Posicion2D vizsq;    
     vizsq = new Posicion2D (a.LimiteDerecho(a),a.LimiteInferior(a));
     return vizsq;  
    }
   
   
   
    public double LimiteInferior (Rectangulo a){
    double limiteinferior;
    limiteinferior = (a.posicion.getY()- (a.getAlto()/2));
    return limiteinferior;
    }
    
    public double LimiteSuperior (Rectangulo a){
    double limitesuperior;
    limitesuperior = (a.posicion.getY()+ (a.getAlto()/2));
    return limitesuperior;
    }
    
    public double LimiteIzquierdo (Rectangulo a){
    double limiteinferior;
    limiteinferior = (a.posicion.getX()- (a.getAncho()/2));
    return limiteinferior;
    }
    
    public double LimiteDerecho (Rectangulo a){
    double limitederecho;
    limitederecho = (a.posicion.getX()+ (a.getAncho()/2));
    return limitederecho;
    }
    
    
    public double DistanciaPerimetro(Posicion2D b ){
      double distanciaborde;
      double proporcionlados;
      double proporciondistancia;
      proporcionlados = (alto/ancho);
      proporciondistancia = (this.posicion.DiferenciaY(b)/this.posicion.DiferenciaX(b));
      double hipotenusa = this.posicion.Distancia(b);
      double senoangulo =(this.posicion.DiferenciaY(b)/hipotenusa);
      double cosenoangulo = (this.posicion.DiferenciaX(b)/hipotenusa);
      if(proporcionlados <=proporciondistancia){
          distanciaborde = ((this.getAlto()/2)/senoangulo);
      }else {
             distanciaborde = ((this.getAncho()/2)/cosenoangulo);
      }
      return distanciaborde;
  }
    
    /**
     * @return the ancho
     */
     public double getAncho() {
        return ancho;
    }

    /**
     * @param ancho the ancho to set
     * @throws Plano.DimensionIncorrectaException
     */
    public void setAncho(double ancho)throws DimensionIncorrectaException {
        if (ancho>0){
            this.ancho = ancho;
        }
        else{
            throw new  DimensionIncorrectaException ("Ingrese un valor de ancho mayor a 0");
        }
    }

    /**
     * @return the alto
     */
    public double getAlto() {
        return alto;
    }

    /**
     * @param alto the alto to set
     * @throws Plano.DimensionIncorrectaException
     */
    public void setAlto(double alto)throws DimensionIncorrectaException {
        if(alto>0){
        this.alto = alto;
        }
        else{
             throw new DimensionIncorrectaException ("Ingrese un valor de alto mayor a 0");
        }
    }

    
    protected void CalcularExtremos()throws FueraDelPlanoException {
        Posicion2D vsi;
        Posicion2D vsd;
        Posicion2D vii;
        Posicion2D vid;
        double a = (ancho/2);
        double b = (alto/2);
        vsi = new Posicion2D (this.posicion.getX()-a,this.posicion.getY()+b);
        vsd = new Posicion2D (this.posicion.getX()+a,this.posicion.getY()+b);
        vii = new Posicion2D (this.posicion.getX()-a,this.posicion.getY()-b);
        vid = new Posicion2D (this.posicion.getX()+a,this.posicion.getY()-b);
    }
    
}
