package com.acha.mikel;

import java.util.ArrayList;

public class Clase2 {

    public static void main(String[] args) {

        String variable1 = "Clase1";
        String variable2 = "Clase2";
        String variable3 = "Clase3";
        String variable4 = "Clase4";

        ArrayList<String> listaString = new ArrayList<>();

        listaString.add(variable1);
        listaString.add(variable2);
        listaString.add(variable3);
        listaString.add(variable4);

        //IMPRIME LA LISTA DEL ARREGLO
        System.out.println(listaString);


        //PRIMERA FORMA DE LEER UNA LISTA
        /*
        for (int i = 0; i < listaString.size(); i++){
            System.out.println(listaString.get(i));
        }
        */

        //SEGUNDA FORMA DE LEER UNA LISTA
        /*
        for (String clase : listaString
             ) {
            System.out.println(clase);
        }
        */

        //TERCERA FORMA DE LEER UNA LISTA CON LAMBDA
        listaString.forEach(clase -> {
            System.out.println(clase);
        });

    }

}
