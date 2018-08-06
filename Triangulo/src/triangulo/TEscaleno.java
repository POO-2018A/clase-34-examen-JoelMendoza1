/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangulo;

/**
 *
 * @author ESFOT
 */
public class TEscaleno implements Figura{
 double a;   
 double b;   
 double c;   

    public TEscaleno(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public double Perimetro() {
        return a+b+c;
    }

    @Override
    public double Area() {
        double s= (a+b+c)/2;
        return Math.sqrt((s*(s-a))*(s-b)*(s-c));
    }

    @Override
    public double Altura() {
        double s= (a+b+c)/2;
        return (2/a)*(Math.sqrt((s*(s-a))*(s-b)*(s-c)));
    }
}
