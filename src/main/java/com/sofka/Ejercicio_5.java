package com.sofka;

import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String nombremascota, tipomascota, nombrecompleto;
        Integer edadmascota;

        System.out.println("Ingrese el nombre completo del dueño");
        nombrecompleto = entrada.nextLine();

        System.out.println("Ingrese un nombre de mascota");
        nombremascota = entrada.next();

        System.out.println("Ingrese la edad de la mascota");
        edadmascota = entrada.nextInt();

        System.out.println("Ingrese el tipo de mascota");
        tipomascota = entrada.next();

        System.out.println(nombremascota + " es un(a) " + tipomascota + ", el cual, tiene " + edadmascota + " años y " + nombrecompleto + " es actualmente su dueño(a).");
    }
}
