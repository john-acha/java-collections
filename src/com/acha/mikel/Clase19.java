package com.acha.mikel;

import com.acha.mikel.model.Alumno;
import com.acha.mikel.model.Curso;

import java.util.Optional;

public class Clase19 {

    public static void main(String[] args) {

        Curso curso1 = new Curso("Historia", 30);

        Alumno alumno1 = new Alumno("Ken Mikel", "001");
        Alumno alumno2 = new Alumno("Lynn Aysel", "002");
        Alumno alumno3 = new Alumno("Liceli ELizabeth", "003");
        Alumno alumno4 = new Alumno("John Hebert", "004");
        Alumno alumno5 = new Alumno("Alder Stein", "005");
        Alumno alumno6 = new Alumno("Blanca Lila", "006");
        Alumno alumno7 = new Alumno("Jose Armando", "007");

        curso1.addAlumno(alumno1);
        curso1.addAlumno(alumno2);
        curso1.addAlumno(alumno3);
        curso1.addAlumno(alumno4);
        curso1.addAlumno(alumno5);
        curso1.addAlumno(alumno6);
        curso1.addAlumno(alumno7);

        curso1.addAlumno(alumno1);
        curso1.addAlumno(alumno2);
        curso1.addAlumno(alumno3);
        curso1.addAlumno(alumno4);
        curso1.addAlumno(alumno5);
        curso1.addAlumno(alumno6);
        curso1.addAlumno(alumno7);


        //Agregando tres alumnos
        curso1.getAlumnoMap().put("008", new Alumno("Juan Miguel", "008") );
        curso1.getAlumnoMap().put("009", new Alumno("Maria Jose", "009") );
        curso1.getAlumnoMap().put("010", new Alumno("Luis Pedro", "010") );



        //curso1.getAlumnos().forEach(alumno -> System.out.println(alumno));


        Alumno alumnoMap = curso1.getAlumnoMap().get("003");

        curso1.getAlumnoMap().forEach((codigo, alumno) -> {
            System.out.println(alumno);
        });



        //System.out.println(alumnoMap);


        /*
        ¿Por qué usar un mapa?
        Obtener valores a través de una llave única, hace más rápido la búsqueda de información
        Un mapa trabaja bajo un concepto de (llave, valor),
        al tener una llave única por ejemplo un DNI, termina siendo más rápido la búsqueda de información.
         */


    }

}
