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
public class FueraDelPlanoExeption extends Exception {

    /**
     * Creates a new instance of <code>NewException</code> without detail
     * message.
     */
    public FueraDelPlanoExeption() {
    }

    /**
     * Constructs an instance of <code>NewException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public FueraDelPlanoExeption(String msg) {
        super(msg);
    }
}
