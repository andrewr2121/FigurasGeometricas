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
public class DimensionIncorrectaException extends Exception {

    /**
     * Creates a new instance of <code>DimencionIncorrectaException</code>
     * without detail message.
     */
    public DimensionIncorrectaException() {
    }

    /**
     * Constructs an instance of <code>DimencionIncorrectaException</code> with
     * the specified detail message.
     *
     * @param msg the detail message.
     */
    public DimensionIncorrectaException(String msg) {
        super(msg);
    }
}
