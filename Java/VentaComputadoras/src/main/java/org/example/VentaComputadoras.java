package org.example;

import com.udemy.curso.model.Computadora;
import com.udemy.curso.model.Monitor;
import com.udemy.curso.model.Raton;
import com.udemy.curso.model.Teclado;
import com.udemy.curso.service.Orden;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class VentaComputadoras {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        //creamo objetos
        Raton raton = new Raton("Bluetooth","Lenovo");
       // System.out.println(raton);
        Teclado teclado = new Teclado("Bluetooth","Lenovo");
        //System.out.println(teclado);
        Monitor  monitor = new Monitor("Lenovo", 15.8);
        //System.out.println(monitor);
        Computadora computadora = new Computadora("Computadora Lenovo",monitor,teclado,raton);
        //System.out.println(computadora);
        //Creamos una orden
        Orden orden = new Orden();
        orden.agregarComputadore(computadora);
        orden.mostrarOrden();;

    }
}