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
public class TEquilatero implements Figura{
  double a;  

    public TEquilatero(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }
   

    @Override
    public double Perimetro() {
       return 3*a;
       
    }

    @Override
    public double Area() {
       return ((Math.sqrt(3*a))/2)*(Math.pow(a, 2));
    }

    @Override
    public double Altura() {
      return (Math.sqrt(3*a))/2;
    }
}
