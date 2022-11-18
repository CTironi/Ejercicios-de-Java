package com.sofka;

import java.util.Scanner;

public class Ejercicio_3 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String nombre, nombrepadre, nombremadre;

        System.out.println("Ingrese un nombre y apellido");
        nombre = entrada.nextLine();

        System.out.println("Ingrese un nombre y apellido del padre");
        nombrepadre = entrada.nextLine();

        System.out.println("Ingrese un nombre y apellido de la madre");
        nombremadre = entrada.nextLine();

        System.out.println("Yo "+nombre+ ", soy hijo de " +nombremadre+ " y " +nombrepadre);
    }
}
