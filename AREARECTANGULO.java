
package com.mycompany.arearectangulo;


public class AREARECTANGULO {
public static double calcularArea(double ancho, double alto) {
return ancho * alto;
}
    public static void main(String[] args) {
        double area = calcularArea(10.5, 5.5);
        System.out.println("Área del rectángulo: " + area);

    }
}
