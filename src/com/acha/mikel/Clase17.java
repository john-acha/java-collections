package com.acha.mikel;

import com.acha.mikel.model.Alumno;
import com.acha.mikel.model.Curso;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class Clase17 {

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

        curso1.addAlumno(alumno1);
        curso1.addAlumno(alumno2);
        curso1.addAlumno(alumno3);
        curso1.addAlumno(alumno4);
        curso1.addAlumno(alumno5);
        curso1.addAlumno(alumno6);
        curso1.addAlumno(alumno7);

        //curso1.getAlumnos().forEach(alumno -> System.out.println(alumno));

        Iterator<Alumno> alumnoIterator = curso1.getAlumnos().iterator();

        while(alumnoIterator.hasNext()){
            System.out.println(alumnoIterator.next());
        }; //Va a ir de uno a uno hasta el final;

        //alumnoIterator.next(); //Error! No existe elemento;

        /*
            alumnoIterator.next();
            vamos a cambiarlo por el siguiente código
            para evitar el exception NoSuchElementException:
         */



        try {
            alumnoIterator.next();
        } catch (NoSuchElementException e){
            System.out.println("No Existe");
        }


    }

}
