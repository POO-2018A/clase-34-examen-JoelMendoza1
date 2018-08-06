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
public class TIsoceles implements Figura{
   double a ;
   double b ;
   double angulo; 

    public TIsoceles(double a, double b) {
        this.a = a;
        this.b = b;
        
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

    public double getAngulo() {
        return angulo;
    }

    public void setAngulo(double angulo) {
        this.angulo = angulo;
    }

    @Override
    public double Perimetro() {
       return (2*a)+b;
    }

    @Override
    public double Area() {
       return (b*(Math.sqrt(Math.pow(a, 2)-(Math.pow(b, 2)/4))))/2;    
    }

    @Override
    public double Altura() {
       return Math.sqrt(Math.pow(a, 2)-(Math.pow(b,2)/4));
    }
}
