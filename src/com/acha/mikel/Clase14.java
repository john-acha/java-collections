package com.acha.mikel;

import com.acha.mikel.model.Alumno;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class Clase14 {

    public static void main(String[] args) {

        Alumno alumno1 = new Alumno("Ken Mikel", "001");
        Alumno alumno2 = new Alumno("Lynn Aysel", "002");
        Alumno alumno3 = new Alumno("Liceli ELizabeth", "003");
        Alumno alumno4 = new Alumno("John Hebert", "004");
        Alumno alumno5 = new Alumno("Alder Stein", "005");
        Alumno alumno6 = new Alumno("Blanca Lila", "006");
        Alumno alumno7 = new Alumno("Jose Armando", "007");

        Collection<Alumno> listaAlumnos = new HashSet<>();
        //Collection<Alumno> listaAlumnos = new ArrayList<>();

        listaAlumnos.add(alumno1);
        listaAlumnos.add(alumno2);
        listaAlumnos.add(alumno3);
        listaAlumnos.add(alumno4);
        listaAlumnos.add(alumno5);
        listaAlumnos.add(alumno6);
        listaAlumnos.add(alumno7);

        //System.out.println(listaAlumnos.contains(alumno1)); //true

        Alumno alumnoNuevo = new Alumno("Christian Vicente", "001");

        System.out.println(alumno1.equals(alumnoNuevo)); //false
        System.out.println(listaAlumnos.contains(alumnoNuevo));//false



    }

}
