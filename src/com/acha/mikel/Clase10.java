package com.acha.mikel;

import com.acha.mikel.model.Curso;

import java.util.*;
import java.util.stream.Collectors;

public class Clase10 {

    public static final List<List<Integer>> listas = new ArrayList<List<Integer>>(){

        {
            add(new LinkedList<>());
            add(new ArrayList<>());
        }

    };

    public static void main(String[] args){

        Curso curso1 = new Curso("Historia", 30);
        Curso curso2 = new Curso("Algebra", 10);
        Curso curso3 = new Curso("Aritmetica", 20);
        Curso curso4 = new Curso("Geometria", 50);
        Curso curso5 = new Curso("Fisica", 60);
        Curso curso6 = new Curso("Quimica", 80);
        //Curso curso7 = new Curso("Quimica", 70);
        Curso curso7 = new Curso("Literatura",70);
        Curso curso8 = new Curso("Fisica", 30);

        ArrayList<Curso> cursos = new ArrayList<>();
        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);
        cursos.add(curso4);
        cursos.add(curso5);
        cursos.add(curso6);
        cursos.add(curso7);
        cursos.add(curso8);


        List<Curso> cursoList = cursos.stream().filter(curso -> !curso.getNombre().equalsIgnoreCase("Ruby")).sorted(Comparator.comparingInt(Curso::getTiempo)).collect(Collectors.toList());

        System.out.println(cursos.stream().filter(curso -> !curso.getNombre().equalsIgnoreCase("Historia")).mapToInt(Curso::getTiempo).sum());
        //Promedio
        System.out.println(cursos.stream().mapToInt(Curso::getTiempo).average().getAsDouble());
        //Numero maximo
        System.out.println(cursos.stream().mapToInt(Curso::getTiempo).max().getAsInt());
        //Numero minimo
        System.out.println(cursos.stream().mapToInt(Curso::getTiempo).min().getAsInt());

        //Map<K,V>
        Map<String, List<Curso>> groupCurso = cursos.stream().collect(Collectors.groupingBy(Curso::getNombre));
        groupCurso.forEach((key , value) -> System.out.println(key + " - " + value.size()));

        //ParallelStream
        System.out.println(cursos.parallelStream().mapToInt(Curso::getTiempo).sum());

        //Imprime la suma de todos los tiempos excepto Geometria
        System.out.println(cursos.parallelStream().filter(curso -> !curso.getNombre().equalsIgnoreCase("Geometria")).mapToInt(Curso::getTiempo).sum());


    }

}
