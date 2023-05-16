package com.acha.mikel.model;

import java.util.*;

public class Curso {

    private String nombre;
    private int tiempo;
    private List<Aula> aulaList = new ArrayList<>();
    private Collection<Alumno> alumnos = new HashSet<>();
    //private Collection<Alumno> alumnos = new LinkedHashSet<>();//Se implemento Clase16
    private Map<String, Alumno> alumnoMap = new HashMap<>(); //Se implemento Clase18
    //private Map<String, Alumno> alumnoMap = new LinkedHashMap<>(); //Se implemento Clase19

    //CONSTRUCTOR
    public Curso(String nombre, int tiempo) {
        this.nombre = nombre;
        this.tiempo = tiempo;
    }

    public Curso(String nombre, int tiempo,List<Aula> aulaList) {
        this.nombre = nombre;
        this.tiempo = tiempo;
        this.aulaList = aulaList;
    }


    //Getters and Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public List<Aula> getAulaList() {
        return Collections.unmodifiableList(aulaList);
        //return aulaList;
    }

    public void setAulaList(List<Aula> aulaList) {
        this.aulaList = aulaList;
    }

    //Implementacion de metodo para agregar aula
    public void addAula(Aula aula){
        this.aulaList.add(aula);

    }

    //Esto se implemento en la Clase15
    public void addAlumno(Alumno alumno){
        this.alumnos.add(alumno);
        this.alumnoMap.put(alumno.getCodigo(), alumno);//Se implemento Clase 18
    }

    public boolean verificaAlumno(Alumno alumno){
        return this.alumnos.contains(alumno);
    }

    public Collection<Alumno> getAlumnos() {
        return alumnos;
    }
    //Termina aqui!

    //Metodo Getter de alumnoMap: Clase 18
    public Map<String, Alumno> getAlumnoMap() {
        return alumnoMap;
    }

    @Override
    public String toString(){
        return this.nombre;
    }



}
