package com.aluracursos.screenmatch.modelos;

import com.aluracursos.screenmatch.calculos.Clasificacion;

public class Pelicula extends Titulo implements Clasificacion {
    private String director;


    //esto es un constructor para el atributo nombre de la clase pelicula


    public Pelicula(String nombre, int fechaDeLanzamiento) {
        super(nombre, fechaDeLanzamiento);
    }


    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getClasificacion() {
        return (int) (calculaMedia() / 2);

    }

    @Override
    public String toString() {
        return "pelicula:" + this.getNombre() + "(" + getFechaDeLanzamiento() + ")";
    };
};




