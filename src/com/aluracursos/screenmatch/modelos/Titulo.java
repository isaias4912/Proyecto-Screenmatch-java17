package com.aluracursos.screenmatch.modelos;

import com.aluracursos.screenmatch.excepcion.ErrorEnConversionDeDuracionException;
import com.google.gson.annotations.SerializedName;

public class Titulo implements Comparable<Titulo> {

    private   String nombre;
    private int fechaDeLanzamiento;
    private int duracionEnMinutos;
    private boolean incluidoEnElPlan;
    private double sumaDeLasEvaluaciones;
    private int totalDeLasEvaluaciones;

    //esto es un constructor de nombre y fecha de lanzamiento
    public Titulo(String nombre, int fechaDeLanzamiento) {
        this.nombre = nombre;
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public Titulo(TituloOmdb miTituloOmdb) {
        this.nombre = miTituloOmdb.title();
        this.fechaDeLanzamiento= Integer.valueOf(miTituloOmdb.year());
        if (miTituloOmdb.runtime().contains("N/A")){
            throw new ErrorEnConversionDeDuracionException("no pude convertir la duracion por que contiene un N/A");
        }
        this.duracionEnMinutos= Integer.valueOf(miTituloOmdb.runtime().substring(0,3).replace(" ",""));

    }

    public int getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    public String getNombre() {
        return nombre;
    }

    public int getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public boolean isIncluidoEnElPlan() {
        return incluidoEnElPlan;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public void setIncluidoEnElPlan(boolean incluidoEnElPlan) {
        this.incluidoEnElPlan = incluidoEnElPlan;
    }

    //esto es un metodo get para obtener  el total de las evaluaciones //
    public  int getTotalDeLasEvaluaciones(){
        return totalDeLasEvaluaciones;
    }
    public double getSumaDeLasEvaluaciones(){
        return  getSumaDeLasEvaluaciones();
    }

    public void muestraFichaTecnica(){

        System.out.println("el nombre de la  pelicula es:"+ nombre);
        System.out.println("su fecha de lanzamiento es:" + fechaDeLanzamiento);
        System.out.println("duracion en minutos es "+ getDuracionEnMinutos());
    }

    public void  evalua(double nota){
        sumaDeLasEvaluaciones= sumaDeLasEvaluaciones+nota;
        //sumaDeLasaEvaluaciones+=notas(otra forma de escribir el codigo resumido )//
        totalDeLasEvaluaciones++;

    }
    public double calculaMedia(){
        return  sumaDeLasEvaluaciones /totalDeLasEvaluaciones;
    }

    @Override
    public int compareTo(Titulo otroTitulo) {
        return this.getNombre().compareTo(otroTitulo.getNombre());
    }

    @Override
    public String toString() {
        return "(nombre='" + nombre +
                ", fechaDeLanzamiento=" + fechaDeLanzamiento +
                ", duracion="+ duracionEnMinutos+")";
    }
}
