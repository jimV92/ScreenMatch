package com.aluracursos.screenmatch.calculos;

public class FiltroRecomendaciones {
    public void filtra(Clasificacion clasificacion){
        if (clasificacion.getClasificacion()>=4){
            System.out.println(" Muy bien evaluado en el momento");
    } else if (clasificacion.getClasificacion()>=2){
        System.out.println("popular en el momento");
    }else{
        System.out.println("Colocalo para verlo despues");
    }
}
}
