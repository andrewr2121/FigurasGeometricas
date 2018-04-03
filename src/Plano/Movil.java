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
public interface Movil {
    
    
    public void MoverArriba (double dist) throws FueraDelPlanoExeption;
    
    public void MoverAbajo (double dist) throws FueraDelPlanoExeption;
    
    public void MoverDerecha (double dist) throws FueraDelPlanoExeption;
    
    public void MoverIzquierda (double dist) throws FueraDelPlanoExeption;
    
    public void Mover (double distX, double distY) throws FueraDelPlanoExeption;
    
    public void Mover (Posicion2D pos) throws FueraDelPlanoExeption;
}
