package com.lhamfor.practicas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class POO1 {
    public static void main (String[] args){
        Carro  micarro = new Carro("porch", 'v', (short) 344534, 40000,
                101215161271L,18.0f, 21312.13123123,
                true);
        System.out.println(micarro);

        Carro haysenCarro = new Carro("ferrary", (short)239165, 700000, false);
        Carro maycolCarro = new Carro("lamborguinni", (short)724916, 580000, false);

        System.out.println(haysenCarro);

        Main.nuevoTema("Listas");
        List<Carro> carroList = new ArrayList<>();
        carroList.add(micarro);
        carroList.add(haysenCarro);
        carroList.add(maycolCarro);

        carroList.remove(1); //eliminamos de la lista
        carroList.set(1, micarro); //actualizamos los datos

        for (Carro currentCarro : carroList){
            System.out.println(currentCarro);
        }

        Main.nuevoTema("Diccionarios"); // no importa la posicion es irevante para los diccionarios
        Map<String, Carro> carroMap = new HashMap<>();
        carroMap.put("alexis", micarro);
        carroMap.put("haysen", haysenCarro);
        carroMap.put("maycol", maycolCarro);

        System.out.println(carroMap.size());
        carroMap.remove("alexis");  //eliminamos del diccionario
        System.out.println(carroMap.size());

        carroMap.put("haysen", maycolCarro);  //actualizamos los datos
        System.out.println(carroMap.get("haysen"));
    }
}

