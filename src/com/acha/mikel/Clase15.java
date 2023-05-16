package com.acha.mikel;

import com.acha.mikel.model.Alumno;
import com.acha.mikel.model.Curso;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;

public class Clase15 {

    public static void main(String[] args) {


        Curso curso1 = new Curso("Historia", 30);

        Alumno alumno1 = new Alumno("Ken Mikel", "001");
        Alumno alumno2 = new Alumno("Lynn Aysel", "002");
        Alumno alumno3 = new Alumno("Liceli ELizabeth", "003");
        Alumno alumno4 = new Alumno("John Hebert", "004");
        Alumno alumno5 = new Alumno("Alder Stein", "005");
        Alumno alumno6 = new Alumno("Blanca Lila", "006");
        Alumno alumno7 = new Alumno("Jose Armando", "007");

        Collection<Alumno> listaAlumnos = new HashSet<>();
        //Collection<Alumno> listaAlumnos = new ArrayList<>();

        curso1.addAlumno(alumno1);
        curso1.addAlumno(alumno2);
        curso1.addAlumno(alumno3);
        curso1.addAlumno(alumno4);
        curso1.addAlumno(alumno5);
        curso1.addAlumno(alumno6);
        curso1.addAlumno(alumno7);




        //System.out.println(listaAlumnos.contains(alumno1)); //true

        Alumno alumnoNuevo = new Alumno("Christian Vicente", "001");

        System.out.println(alumno1.equals(alumnoNuevo)); //false
        System.out.println(curso1.getAlumnos().contains(alumnoNuevo));//false

        /*
        En nuestra Clase15.java imprimir todos los códigos de los alumnos de forma descendente
        para el curso1:
        curso1.getAlumnos().stream().sorted(Comparator.comparing(Alumno::getCodigo).reversed()).forEach(alumno -> System.out.println(alumno.getCodigo()));

         */

        curso1.getAlumnos().stream().sorted(Comparator.comparing(Alumno::getCodigo).reversed()).forEach(alumno -> System.out.println(alumno.getCodigo()));





    }

}
