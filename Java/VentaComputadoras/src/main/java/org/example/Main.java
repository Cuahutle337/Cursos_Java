package org.example;

import com.udemy.curso.model.Raton;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        //creamo objetos
        Raton raton = new Raton("Bluetooth","Lenovo");
        System.out.println(raton);
    }
}