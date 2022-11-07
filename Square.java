/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.ejerciciosjava;

/**
 *
 * @author jlunaque
 */
public class Square extends Shapes {
    
    @Override
    public double Perimetro(){
        return 4*base;
    }
    
    @Override
    public double Area(){
        return base*base;
    }
}
