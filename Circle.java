/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.ejerciciosjava;

/**
 *
 * @author jlunaque
 */
public class Circle extends Shapes {
    
    @Override
    public double Perimetro(){
        return 2*Math.PI*(base/2);
    }
    
    @Override
    public double Area(){
        return Math.PI*Math.pow(base/2, 2);
    }
    
}
