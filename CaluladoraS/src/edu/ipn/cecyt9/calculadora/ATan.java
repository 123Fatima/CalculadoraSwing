/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ipn.cecyt9.calculadora;

/**
 *
 * @author intel
 */
public class ATan implements calcular {
    public double operacion(double num1){
        return Math.atan(num1);
    }

    @Override
    public double operacion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }    
}
