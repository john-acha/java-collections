package com.acha.mikel;

import java.util.ArrayList;

public class Clase1 {
    public static void main(String[] args) {

        String variable1 = "Ejemplo1";
        String variable2 = "Ejemplo2";
        String variable3 = "Ejemplo3";
        String variable4 = "Ejemplo4";

        //CREANDO UNA LISTA VACIA DE STRING
        ArrayList<String> lista = new ArrayList<>();

        //LLAMANDO AL METODO ADD
        lista.add(variable1);
        lista.add(variable2);
        lista.add(variable3);
        lista.add(variable4);

        //IMPRIME LA LISTA DEL ARREGLO
        System.out.println(lista);

        //REMOVER LA VARIABLE DE LA POSICION 2: Ejemplo3
        //lista.remove(2);
        //System.out.println(lista);

        //MODIFICAR LA POSICION 2
        //lista.set(2, "Ejemplo alterado");
        System.out.println(lista.size());
    }
}
