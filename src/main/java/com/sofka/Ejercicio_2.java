package com.sofka;

import java.util.Scanner;

public class Ejercicio_2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String nombre, apellido;
        Integer edad;
        Double estatura;

        System.out.println("Ingrese un nombre");
        nombre = entrada.next();

        System.out.println("Ingrese un apellido");
        apellido = entrada.next();

        System.out.println("Ingresar edad");
        edad = entrada.nextInt();

        System.out.println("Ingrese estatura");
        estatura = entrada.nextDouble();

        System.out.println("Nombre: "+ nombre+"\nApellido: "+apellido+ "\nEdad: "+edad+ "\nEstatura: "+estatura);
    }
}
