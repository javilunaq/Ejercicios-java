/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.ejerciciosjava;

/**
 *
 * @author jlunaque
 */
public class Division extends Operator{
    
    @Override
    public double operate(){
        try {
            return num1/num2;
        } catch (ArithmeticException e){
            throw new ArithmeticException(e.getMessage());
        }
    }
    
}
