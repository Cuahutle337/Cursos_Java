package org.example;

import java.util.Scanner;

public class CalculadoraApp {

    public static void main(String args[]){

        Scanner consola = new Scanner(System.in);

        System.out.println("****Aplicacion Calculadora****");

        //mostramos el menu
        System.out.println("""
                1. Suma
                2. Resta
                3. Multiplilcacion
                4. Division
                5. Salior
                """);


        var operacion = Integer.parseInt(consola.nextLine());

            if(operacion >= 1 && operacion <= 4){

                System.out.print("Proporcione valor operando1 ");
                var operando1 = Integer.parseInt(consola.nextLine());
                System.out.print("Proporcione valor operando2 ");
                var operando2 = Integer.parseInt(consola.nextLine());
                var resultado = operando1 + operando2;

                switch (operacion){

                    case 1 -> {
                        resultado = operando1 + operando2;
                        System.out.println("Resultado: " + resultado);
                    }

                    case 2->{
                        resultado = operando1 - operando2;
                        System.out.println("Resultado: " + resultado);
                    }
                    case 3->{
                        resultado = operando1 * operando2;
                        System.out.println("Resultado: " + resultado);
                    }
                    case 4-> {
                        resultado = operando1 / operando2;
                        System.out.println("Resultado: " + resultado);
                    }
                    default -> {
                        System.out.println("Opcion Errone: " + operacion);
                    }
                }

            }else if (operacion == 5){

                System.out.println("Hasta Pronto...");

            }else{
                System.out.println("Opcion Erronea...");
            }



    }
}
