package com.aluracursos.screenmatch.principal;

import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;
import com.aluracursos.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalConListas {
    public static void main(String[] args) {
        Pelicula miPelicula= new Pelicula("encanto",2021);
        miPelicula.evalua(9);
        Pelicula otraPelicula= new Pelicula("avatar",1998);
        otraPelicula.evalua(6);
        var peliculaDeBruno=new Pelicula("el señor de los anillos",2001);
        peliculaDeBruno.evalua(10);
        Serie casaDragon =new Serie("casa del dragon",2022);


        ArrayList<Titulo> lista = new ArrayList<>();

        lista.add(miPelicula);
        lista.add(otraPelicula);
        lista.add(peliculaDeBruno);
        lista.add(casaDragon);

        for(Titulo item: lista){
            System.out.println(item.getNombre());
            if (item instanceof Pelicula pelicula && pelicula.getClasificacion()>2)
            //abajo estamos haciedo casting para que acepte o forse a java aceptar a pelicula como item ,yauqe titulo no lo es en get clasificacion
           // Pelicula pelicula= (Pelicula) item;
            System.out.println(pelicula. getClasificacion());

            ArrayList<String> listaDeArtistas = new ArrayList<>();
            listaDeArtistas.add("penelope cruz");
            listaDeArtistas.add("antonio banderas");
            listaDeArtistas.add("ricardo darin");
            // bajo me imprime la lista desordenada
            System.out.println(listaDeArtistas);
            // abajo el paquete collections y el metodo  sort permite ordenar las elementos de las listas

            Collections.sort(listaDeArtistas);
            System.out.println("lista de artista ordenadas:"+ listaDeArtistas);


            Collections.sort(lista);
            System.out.println("lista de titulos ordenadas:"+lista);

            lista.sort(Comparator.comparing(Titulo::getFechaDeLanzamiento));
            System.out.println("lista ordenada por fecha:"+ lista);

        }



    }
}
