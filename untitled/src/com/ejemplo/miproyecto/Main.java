package com.ejemplo.miproyecto;

import java.util.ArrayList;
import java.util.*;

import com.ejemplo.miproyecto.EjemploClase;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //enteros
        byte byteNumber = 100;
        short ShortNumber = 30000;
        int intNumber = 2000000;
        long longNumber = 123456789L;

        //con punto flotante
        float flatNumber = 3.14F;
        double doubleNumber = 2.12345;

        //caracteres
        char chatValue = 'A';

        // boleano
        boolean isTrue = true;
        boolean isFalse = false;

        // arreglos
        int[] intArray = {1,2,3,4,5};
        String[] stringArray = {"hola", "mundo"};

        String saludo = new String("hola mundo");

        // interface

        caja<String> stringCaja = new caja<>("hola esta es una clase generica");
        caja<Integer> integercaja = new caja<>(41);

    }
}

interface dibujo {
    void dibujar();
}

class circulo implements dibujo{
    public void dibujar(){
        System.out.print("Dibujar circulo");
    }
}
//enumeracion
enum dias{
    lunes,martes,miercoles, jueves, viernes,savado ,domingo
}

//generico
class  caja<T>{
    private T contenido;

    public caja(T contenido){
        this.contenido = contenido;
    }

    public T getContenido(){
        return contenido;
    }
}

class  caja2<T>{
    private T contenido;

    public caja2(T contenido){
        this.contenido = contenido;
    }

    public T getContenido(){
        return contenido;
    }
}
