package com.lhamfor.practicas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class POO {
    public static void main (String[] args){
        Casa  micasa = new Casa("Independencia", 'd', (short) 34, 2000000,
                1104537600000L,3.5f, 320.3242344234324324,
                false);
        System.out.println(micasa);

        Casa haysenCasa = new Casa("jr.luna", (short)0, 3500000, true);
        Casa maycolCasa = new Casa("Roma", (short)411, 1200000, false);

        System.out.println(haysenCasa);

        //clase listado
        Main.nuevoTema("Listas"); // importa la posicion
        List<Casa> casaList = new ArrayList<>();
        casaList.add(micasa);
        casaList.add(haysenCasa);
        casaList.add(maycolCasa);

        casaList.remove(1); //eliminamos de la lista
        casaList.set(1, micasa); //actualizamos los datos

        for (Casa currentCasa : casaList){
            System.out.println(currentCasa);
        }
        // clase diccionarios
        Main.nuevoTema("Diccionarios"); // no importa la posicion es irevante para los diccionarios
        Map<String, Casa>casaMap = new HashMap<>();
        casaMap.put("alexis", micasa);
        casaMap.put("haysen", haysenCasa);
        casaMap.put("maycol", maycolCasa);

        System.out.println(casaMap.size());
        casaMap.remove("alexis");  //eliminamos del diccionario
        System.out.println(casaMap.size());

        casaMap.put("haysen", maycolCasa);  //actualizamos los datos
        System.out.println(casaMap.get("haysen"));

        //Herencia
        Main.nuevoTema("Herencia");
        Apartamento apartamentoplaya = new Apartamento("Malecon", 'B', (short)202,
                3002032, 1009896479844L, 14.8f, 500,
                true, (short) 5);
        System.out.println(apartamentoplaya);

        //Polimorfismo
        Main.nuevoTema("Polimorfismo");
        venderpropiedad(micasa);
        venderpropiedad(apartamentoplaya);
        Casa apartamentoCiudad = new Apartamento("Ayaviry", 'P', (short)342,
                6000308, 1684346848657L, 32.1f, 1000,
                false, (short) 17);
        venderpropiedad(apartamentoCiudad);
        Casa casaNueva = new Casa();
        casaNueva.setCalle("arequipa");
        casaNueva.setHipoteca(true);
        casaNueva.setImpuesto(2.4f);
        System.out.println(casaNueva);
        venderpropiedad(casaNueva);

        Main.nuevoTema("Equals y hasCode");
        Casa miSegundaCasa = new Casa("Independencia", 'd', (short) 34, 2000000,
                1104537600000L,3.5f, 320.3242344234324324,
                false);
        System.out.println(micasa.equals(miSegundaCasa));
        Casa miTerceracasa = new Casa();
        System.out.println(casaMap.containsValue(maycolCasa));

    }

    private static void venderpropiedad(Casa casa) {
        if (casa.isHipoteca()){
            System.out.println("Imposible vender");
        }else {
            System.out.println("En venta.");
        }
    }
}
