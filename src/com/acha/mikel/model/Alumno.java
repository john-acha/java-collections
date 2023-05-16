package com.acha.mikel.model;

public class Alumno {

    private String nombre;
    private String codigo;

    public Alumno(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;

    }

    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    @Override
    public String toString(){
        return this.nombre;
    }


    //SOBREESCRITURA DE METODOS:
    // Deben ser del mismo tipo: this.nombre --- equals = hashcode
    /*
    Porque al usar el método contains usa el hashCode y el equals es usado para comparar valores,
    es una necesidad primordial sobrescribir estos métodos,
    para buscar los resultados esperados en nuestras comparaciones.

    Es bueno hacer esa sobrescritura de métodos,
    para luego tener la capacidad de migrar
    para alguna otra interfaz sin la mayor preocupación
    de obtener resultados no esperados.
     */

    @Override
    public boolean equals(Object obj) {
        Alumno alumno = (Alumno) obj;
        return this.nombre.equals(alumno.getNombre());
    }

    @Override
    public int hashCode() {
        return this.nombre.hashCode();
    }
}
