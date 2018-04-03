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
       
    
    public Rectangulo(double ancho, double alto)throws FueraDelPlanoExeption{
    super(0,0);
    this.ancho = ancho;
    this.alto = alto;
    }
    
   
    public Rectangulo(double ancho, double alto, double x, double y) throws FueraDelPlanoExeption {
    super(x,y);
    this.ancho = ancho;
    this.alto = alto;
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
   
   
   public Posicion2D VerticeSupIzq (Rectangulo a)throws FueraDelPlanoExeption{    
     Posicion2D vizsq;    
     vizsq = new Posicion2D (a.LimiteIzquierdo(a),a.LimiteSuperior(a));
     return vizsq;  
    }
   
     public Posicion2D VerticeInfIzq (Rectangulo a)throws FueraDelPlanoExeption{    
     Posicion2D vizsq;    
     vizsq = new Posicion2D (a.LimiteIzquierdo(a),a.LimiteInferior(a));
     return vizsq;  
    }
     
     public Posicion2D VerticeSupDer (Rectangulo a)throws FueraDelPlanoExeption{    
     Posicion2D vizsq;    
     vizsq = new Posicion2D (a.LimiteDerecho(a),a.LimiteDerecho(a));
     return vizsq;  
    }
     
     public Posicion2D VerticeInfDer (Rectangulo a)throws FueraDelPlanoExeption{    
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
     */
    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    /**
     * @return the alto
     */
    public double getAlto() {
        return alto;
    }

    /**
     * @param alto the alto to set
     */
    public void setAlto(double alto) {
        this.alto = alto;
    }
    
}
