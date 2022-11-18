package com.sofka;

import java.util.Scanner;

public class Ejercicio_1 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String nombre, apellido;

        System.out.println("Ingrese un nombre");
        nombre = entrada.next();

        System.out.println("Ingrese un apellido");
        apellido = entrada.next();

        System.out.println("El nombre completo es: "+ nombre+" "+apellido);
    }
}
