package com.acha.mikel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Clase3 {

    public static void main(String[] args) {

        String curso1 = "Geometria";
        String curso2 = "Fisica";
        String curso3 = "Quimica";
        String curso4 = "Historia";

        ArrayList<String> cursos = new ArrayList<>();

        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);
        cursos.add(curso4);

        //System.out.println(cursos);
        /*
        //PRIMERA FORMA DE ORDENAR
        //ORDENAR DE FORMA ASCENDENTE
        Collections.sort(cursos);
        System.out.println(cursos);

        //ORDENAR DE FORMA DESCENDENTE
        Collections.sort(cursos,Collections.reverseOrder());
        System.out.println(cursos);
        */

        /*
        //SEGUNDA FORMA DE ORDENAR
        //ASCENDETE
        cursos.sort(Comparator.naturalOrder());
        System.out.println(cursos);
        //DESCENDENTE
        cursos.sort(Comparator.reverseOrder());
        System.out.println(cursos);
        */

        //TERCERA FORMA
        //DEVUELVE UNA LISTA NUEVA
        //cursos.stream().sorted().collect(Collectors.toList());
        //System.out.println(cursos);

        //INTERFACE List
        //ASCENDENTE
        //List<String> cursosList = cursos.stream().sorted().collect(Collectors.toList());
        //System.out.println(cursosList);

        //DESCENDENTE
        List<String> cursosList = cursos.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(cursosList);

    }

}
