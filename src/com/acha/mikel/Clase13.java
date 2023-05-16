package com.acha.mikel;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;

public class Clase13 {

    public static void main(String[] args) {

        String alumno1 = "Ken Mikel";
        String alumno2 = "Lynn Aysel";
        String alumno3 = "Liceli ELizabeth";
        String alumno4 = "John Hebert";
        String alumno5 = "Alder Stein";
        String alumno6 = "Blanca Lila";


        Collection<String> listaAlumnos = new HashSet<>();

        listaAlumnos.add(alumno1);
        listaAlumnos.add(alumno2);
        listaAlumnos.add(alumno3);
        listaAlumnos.add(alumno4);
        listaAlumnos.add(alumno5);
        listaAlumnos.add(alumno6);

        //listaAlumnos.forEach(alumno -> {
        //    System.out.println(alumno);
        //});


        //VERIFICAR SI EXISTE UN ALUMNO
        //contains: Devuelve un boolean
        boolean valida = listaAlumnos.contains("John hebert"); //false
        //System.out.println(valida);


        String max = listaAlumnos.stream().max(Comparator.comparingInt(String::length)).get();
        //System.out.println(max.length()); //Imprime el numero de caracteres del String máximo

        listaAlumnos.removeIf(alumno -> "John Heberto".equalsIgnoreCase(alumno));

        listaAlumnos.forEach(alumno -> {
        System.out.println(alumno);
        });

        //buscar por el nombre Gustavo Polar, como ese nombre no existe vamos a devolver como resultado No existe:
        System.out.println(listaAlumnos.stream().filter(alumno -> alumno.equalsIgnoreCase("Gustavo Polar")).findFirst().orElse("No Existe"));



    }

}
