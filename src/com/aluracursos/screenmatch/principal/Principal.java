package com.aluracursos.screenmatch.principal;

import com.aluracursos.screenmatch.calculos.CalculadoraDeTiempo;
import com.aluracursos.screenmatch.calculos.FiltroRecomendacion;
import com.aluracursos.screenmatch.modelos.Episodio;
import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula= new Pelicula("encanto",2021);


        miPelicula.setDuracionEnMinutos(121);
        miPelicula.setIncluidoEnElPlan(true);

        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(10);
        miPelicula.evalua(10);

        System.out.println("la suma de las evaluaciones es :"+miPelicula. getTotalDeLasEvaluaciones());
        System.out.println("el total de las evaluaciones es:"+miPelicula.getTotalDeLasEvaluaciones());
        System.out.println("la media es :"+ miPelicula.calculaMedia());

        Serie casaDragon =new Serie("casa del dragon",2022);

        casaDragon.setTemporada(1);
        casaDragon.setMinutosPorEpisodio(56);
        casaDragon.setEpisodiosPorTemporada(10);
        casaDragon.muestraFichaTecnica();
        System.out.println(casaDragon.getDuracionEnMinutos());

        Pelicula otraPelicula= new Pelicula("avatar",1998);

        otraPelicula.setDuracionEnMinutos(180);

        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(miPelicula);
        calculadora.incluye(casaDragon);
        calculadora.incluye(otraPelicula);
        System.out.println("tiempo necesario para ver tus titulos favoritos en vacaciones:"+calculadora.getTiempoTotal());


        FiltroRecomendacion filtroRecomendacion = new FiltroRecomendacion();
        filtroRecomendacion.filtrar(miPelicula);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setNombre("la casa targayem");
        episodio.setSerie(casaDragon);
        episodio.setTotalVisualizaciones(50);

        filtroRecomendacion.filtrar(episodio);

        var peliculaDeBruno=new Pelicula("el señor de los anillos",2001);
        peliculaDeBruno.setDuracionEnMinutos(180);

        ArrayList<Pelicula> listaDePeliculas = new ArrayList<>();
        listaDePeliculas.add(peliculaDeBruno);
        listaDePeliculas.add(miPelicula);
        listaDePeliculas.add(otraPelicula);

        System.out.println("el tamaño de la pelicual es :"+listaDePeliculas.size());
        System.out.println("la primera pelicula es "+listaDePeliculas.get(0).getNombre());
        System.out.println(listaDePeliculas);

        System.out.println("toString de la pelicula :"+listaDePeliculas.get(0).toString());

        Object objeto = peliculaDeBruno;



    }
}









