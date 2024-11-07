package com.aluracursos.screenmatch.calculos;

public class FiltroRecomendacion {

    public void filtrar (Clasificacion clasificacion ){
        if(clasificacion.getClasificacion()>=4){
            System.out.println("muy bien evaluado en le momento");
        }else if(clasificacion.getClasificacion() >= 2){
            System.out.println("popular en el momento");
        }else{
            System.out.println("colocalo en tu lista para verlo despues ");
        }
    }
}
