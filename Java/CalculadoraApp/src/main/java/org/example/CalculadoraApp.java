package org.example;

import java.util.Scanner;

public class CalculadoraApp {

    public static void main(String args[]){

        System.out.println("****Aplicacion Calculadora****");
        System.out.print("Proporcione valor operando1 ");
        Scanner consola = new Scanner(System.in);
        var operando1 = Integer.parseInt(consola.nextLine());
        System.out.print("Proporcione valor operando2 ");
        var operando2 = Integer.parseInt(consola.nextLine());
        var resultado = operando1 + operando2;

        System.out.println("Resultado: " + resultado);

    }
}
