/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.ejerciciosjava;

/**
 *
 * @author jlunaque
 */
public abstract class Operator {
    
    protected double num1;
    protected double num2;
    
    public Operator(){
        
    }
    
    public Operator(double num1, double num2){
        this.num1 = num1;
        this.num2 = num2;
        
    }
    
    public abstract double operate();

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }
    
    
        
    
    
}
