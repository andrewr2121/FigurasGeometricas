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
public abstract class Figura2D extends FiguraGeometrica implements Movil{
    
     public Posicion2D posicion;
     protected static int nroOrden=0;
     public String Id;
     /**
      * 
      * @param x Valor de x en la posicion de la Figura 2D
      * @param y  Valor de y en la posicoin de la Figura 2D
     * @throws Plano.FueraDelPlanoExeption
      */
    public Figura2D (double x, double y) throws FueraDelPlanoException{
    
        posicion = new Posicion2D (x, y);
        nroOrden++;
           
    }
    
    /**
     * Mueve la figura para arriba de la posicion actual.
     * @param dist distancia a mover la figura con respecto a la posicion actual.
     * @throws Plano.FueraDelPlanoExeption
     */   
    public void MoverArriba (double dist) throws FueraDelPlanoException{
        try {
        this.posicion.setY(this.posicion.getY() + dist);
        VerificarSiEstaDentroDelPlano();
        }catch(FueraDelPlanoException ex){
            System.out.println("No se puede mover la figura fuera del plano");
             this.posicion.setY(this.posicion.getY()-dist);
        }
    }
     /**
     * Mueve la figura para abajo de la posicion actual.
     * @param dist distancia a mover la figura con respecto a la posicion actual.
     * @throws Plano.FueraDelPlanoExeption
     */ 
    public void MoverAbajo (double dist) throws FueraDelPlanoException{
        try{
            this.posicion.setY(this.posicion.getY() - dist);
            VerificarSiEstaDentroDelPlano();
        }catch(FueraDelPlanoException ex){
            System.out.println("No se puede mover la figura fuera del plano");
            this.posicion.setY(this.posicion.getY()+ dist);            
        }
    }
     /**
     * Mueve la figura para la derecha de la posicion actual.
     * @param dist distancia a mover la figura con respecto a la posicion actual.
     * @throws Plano.FueraDelPlanoExeption
     */ 
    public void MoverDerecha (double dist) throws FueraDelPlanoException {
        try{
            this.posicion.setX(this.posicion.getX() + dist);
            VerificarSiEstaDentroDelPlano();
        }catch(FueraDelPlanoException ex){
            System.out.println("No se puede mover la figura fuera del plano");        
            this.posicion.setX(this.posicion.getX() - dist);
        }
    }
     /**
     * Mueve la figura para la izquierda de la posicion actual.
     * @param dist distancia a mover la figura con respecto a la posicion actual.
     * @throws Plano.FueraDelPlanoExeption
     */ 
    public void MoverIzquierda (double dist) throws FueraDelPlanoException{
            try{
                this.posicion.setX(this.posicion.getX() - dist);
                VerificarSiEstaDentroDelPlano();
            }catch(FueraDelPlanoException ex){
                System.out.println("No se puede mover la figura fuera del plano");        
                this.posicion.setX(this.posicion.getX() + dist);
            }
            
    }
    /**
     * 
     * @param distX Distancia a mover el valor x de la posicion de la figura.
     * @param distY Distancia a mover el valor y de la posicion de la figura
     * @throws Plano.FueraDelPlanoExeption
     */
    public void Mover (double distX, double distY)throws FueraDelPlanoException{
            double x = this.posicion.getX();
            double y = this.posicion.getY();
            try{
                this.posicion.setY(this.posicion.getY() + distY);
                this.posicion.setX(this.posicion.getX() + distX);            
                VerificarSiEstaDentroDelPlano();
            }catch(FueraDelPlanoException ex){
                System.out.println("No se puede mover la figura fuera del plano");        
                this.posicion.setY(y);
                this.posicion.setX(x); 
            }
            
    }
    /**
     * Mueve la Figura 2D a una nueva posicion.
     * @param pos Nueva posicion del objeto.
     */
    public void Mover (Posicion2D pos)throws FueraDelPlanoException{
        double x = this.posicion.getX();
        double y = this.posicion.getY();        
        try{
        this.posicion.setY(pos.getY());
        this.posicion.setX(pos.getX());
        VerificarSiEstaDentroDelPlano();
        }catch(FueraDelPlanoException ex){
            System.out.println("No se puede mover la figura fuera del plano");        
            this.posicion.setY(y);
            this.posicion.setX(x);        
        }
    }

    public void VerificarSiEstaDentroDelPlano()throws FueraDelPlanoException {
        try{
            CalcularExtremos();
        }
        catch(FueraDelPlanoException ex){
            System.out.println("La figura se va a mover fuera del plano");
        }
    }
            
    protected abstract void CalcularExtremos () throws FueraDelPlanoException;
    /**
     * Calcula el Perimetro de la Figura 2D
     * @return un valor double.
     */
    public abstract double Perimetro ();
    
    /**
     * Devuelve la distancia del centro al perimetro del objeto de acuerdo 
     * al angulo que se da del centro del objeto y una posicion dada.
     * @param a posicion para formar el angulo del cual se saca la distancia al perimetro
     * @return  Valor double.
     */
    public abstract double DistanciaPerimetro(Posicion2D a);
        
}
