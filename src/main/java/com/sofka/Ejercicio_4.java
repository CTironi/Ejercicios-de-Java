package com.sofka;

import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String capital, pais;

        System.out.println("Ingrese una capital y el país al cual pertenece");
        capital = entrada.next();
        pais = entrada.next();

        System.out.println("La ciudad " + capital + ", es la capital del país " + pais);
    }
}
