/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.actividad1ejercicionumero5;
import java.util.Scanner;
public class Actividad1EjercicioNumero5 {

    public static void main(String[] args) {
        double x, area, longitud;
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el radio del circulo");
        x = leer.nextDouble();
        area = Math.PI*Math.pow(x,2);
        longitud = 2*Math.PI*x;
        System.out.println("el radio del circulo es: "+x);
        System.out.println("el area del circulo es: "+area);
        System.out.println("la longitud del circulo es: "+longitud);
    }
}
