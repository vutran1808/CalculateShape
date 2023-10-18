/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ASUS
 */
public class Circle extends Shape{
    
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    
    @Override
    public String printResult() {
        return "Radius: " + r + 
                "\nArea: " + getArea() + 
                "\nPerimeter: " + getPerimeter();
    }

    @Override
    double getPerimeter() {
        return Math.PI*r*2;
    }

    @Override
    double getArea() {
        return Math.PI*r*r;
    }
    
}
