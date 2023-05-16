package com.acha.mikel;

import com.acha.mikel.model.Curso;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Clase5 {

    public static void main(String[] args) {

        Curso curso1 = new Curso("PHP", 30);
        Curso curso2 = new Curso("Ruby", 10);
        Curso curso3 = new Curso("JavaScript", 20);
        Curso curso4 = new Curso("Java", 50);

        ArrayList<Curso> cursos = new ArrayList<>();

        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);
        cursos.add(curso4);

        System.out.println(cursos);
        //Clase Collections
        //Collections.sort(cursos); //Necesita implementar Comparable
        //System.out.println(cursos);

        //ORDENAMIENTO EN ORDEN INVERSO
        //Collections.sort(cursos, Comparator.reverseOrder());
        //System.out.println(cursos);

        //OTRA FORMA SIN EL CompareTo
        //cursos.sort(Comparator.comparing(Curso::getNombre));
        //System.out.println(cursos);

        //CON LA CLASE Collections sin la IMPLEMENTACION DEL CompareTo
        //Collections.sort(cursos, Comparator.comparing(Curso::getNombre));
        //System.out.println(cursos);

        //CON LA CLASE Collections sin la IMPLEMENTACION DEL CompareTo EN ORDEN INVERSO
        //Collections.sort(cursos, Comparator.comparing(Curso::getNombre).reversed());
        //System.out.println(cursos);

        //USANDO Stream
        //Comparator.comparingInt() : Buscara algun metodo Int para Comparar
        //cursos.stream().sorted(Comparator.comparingInt(Curso::getTiempo));
        //System.out.println(cursos);

        //Agregando el metodo collect y la interface List<Clase> variable
        //List<Curso> cursoList = cursos.stream().sorted(Comparator.comparingInt(Curso::getTiempo)).collect(Collectors.toList());
        //System.out.println(cursoList);

        //USANDO LAMBDA : filter(curso -> !curso.getNombre().equalsIgnoreCase("Ruby")) Crea una nueva Lista sin "Rubby"
        //List<Curso> cursoList = cursos.stream().filter(curso -> !curso.getNombre().equalsIgnoreCase("Ruby")).sorted(Comparator.comparingInt(Curso::getTiempo)).collect(Collectors.toList());
        //System.out.println(cursoList);


        //ordenar nuestra lista por nombre descendentemente de cursos excluyendo PHP
        List<Curso> cursoList = cursos.stream().filter(curso -> !curso.getNombre().equalsIgnoreCase("PHP")).sorted(Comparator.comparing(Curso::getNombre).reversed()).collect(Collectors.toList());
        System.out.println(cursoList);


    }

}
