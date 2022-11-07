/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.ejerciciosjava;

/**
 *
 * @author jlunaque
 */
public class Triangle extends Shapes {
    
    protected double side1, side2;
    
    public Triangle(double side1, double side2){
        this.side1 = side1;
        this.side2 = side2;
    }
    
    @Override
    public double Perimetro(){
        return side1 + side2+ base;
    }
    
    @Override
    public double Area(){
        return base*height/2;
    }
    
}
