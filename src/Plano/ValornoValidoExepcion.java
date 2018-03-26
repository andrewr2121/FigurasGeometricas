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
public class ValornoValidoExepcion extends Exception {

    /**
     * Creates a new instance of <code>ValornoValidoExepcion</code> without
     * detail message.
     */
    public ValornoValidoExepcion() {
    }

    /**
     * Constructs an instance of <code>ValornoValidoExepcion</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public ValornoValidoExepcion(String msg) {
        super(msg);
    }
}
