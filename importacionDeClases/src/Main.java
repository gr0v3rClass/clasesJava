import java.util.Arrays;
import java.util.List;

import java.util.Scanner;
import java.util.Random;
import java.io.*;
import java.time.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        //List<Integer> numero = Arrays.asList(1,2,3,4);
        //numero.forEach(num->System.out.println(num));

        /*Scanner scaner = new Scanner(System.in);
        int numero;
        do System.out.print("Ingrese un numero positivo");
        while ((numero = scaner.nextInt())<=0);
        System.out.println("has ingresado un numero positivo"+numero);

        scaner.close();*/

        Random random = new Random();

        int numeroAleatorio = random.nextInt(100);

        System.out.println(numeroAleatorio);
    }
}