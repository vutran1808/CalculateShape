/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import common.ScannerFactory;
import model.Circle;
import model.Rectangle;
import model.Triangle;

/**
 *
 * @author ASUS
 */
public class Calculate {

    ScannerFactory sc;

    public Calculate() {
        sc = new ScannerFactory();
    }

    public void getAll() {
        double aRec = sc.getDouble("Please input side width of Rectangle: ");
        double bRec = sc.getDouble("Please input length of Rectangle: ");
        double radius = sc.getDouble("Please input radius of Circle: ");
        double a = sc.getDouble("Please input side A of triangle: ");
        double b = sc.getDouble("Please input side B of triangle: ");
        double c = sc.getDouble("Please input side C of triangle: ");
        Rectangle rec = new Rectangle(aRec, bRec);
        Circle cir = new Circle(radius);
        Triangle tri = new Triangle(a, b, c);
        System.out.println("-----Rectangle-----");
        System.out.println(rec.printResult());
        System.out.println("-----Circle-----");
        System.out.println(cir.printResult());
        System.out.println("-----Triangle-----");
        System.out.println(tri.printResult());
    }

}
