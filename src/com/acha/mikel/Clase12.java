package com.acha.mikel;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Clase12 {

    public static void main(String[] args) {

        String alumno1 = "Ken Mikel";
        String alumno2 = "Lynn Aysel";
        String alumno3 = "Liceli ELizabeth";
        String alumno4 = "John Hebert";
        String alumno5 = "Alder Stein";
        String alumno6 = "Blanca Lila";

        //INTERFACE Collection
        //TOD0: https://docs.oracle.com/javase/tutorial/collections/interfaces/index.html
        //HashSet: No repite valores
        Collection<String> listaAlumnos = new HashSet<>();

        listaAlumnos.add(alumno1);
        listaAlumnos.add(alumno2);
        listaAlumnos.add(alumno3);
        listaAlumnos.add(alumno4);
        listaAlumnos.add(alumno5);
        listaAlumnos.add(alumno6);

        listaAlumnos.forEach(alumno -> {
            System.out.println(alumno);
        });

    }

}
