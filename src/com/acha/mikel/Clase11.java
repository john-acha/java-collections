package com.acha.mikel;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Clase11 {

    public static void main(String[] args) {

        String alumno1 = "Ken Mikel";
        String alumno2 = "Lynn Aysel";
        String alumno3 = "Liceli ELizabeth";
        String alumno4 = "John Acha";
        String alumno5 = "Alder Stein";
        String alumno6 = "Blanca Lila";

        //INTERFACE SET: no guarda objetos duplicados
        Set<String> listaAlumnos = new HashSet<>();

        listaAlumnos.add(alumno1);
        listaAlumnos.add(alumno2);
        listaAlumnos.add(alumno3);
        listaAlumnos.add(alumno4);
        listaAlumnos.add(alumno5);
        listaAlumnos.add(alumno6);

        for (String alumno: listaAlumnos){

            System.out.println(alumno);

        }


    }

}
