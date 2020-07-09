package com.lhamfor.practicas;

public class Main {
    public static void main (String[] args) {
        //variables y constantes
        nuevoTema("variables y constante");
        final short enteroCorto = 120; //maximovalor de 32767;
        int enteroNormal = 300696;
        long enteroLargo;
        float decimalCorto = 24.45f; //calificacion de examenes
        double decimalLargo = 23.43534534; //calculos matematicos muy complejos;
        char caracter = 'a';
        boolean esValido = true;

        //modo de impresion
        nuevoTema("Impresiones");
        enteroNormal = 14 % 3;
        enteroLargo = 500;
        System.out.println(enteroCorto);
        System.out.println(enteroNormal);
        System.out.println(enteroLargo);
        System.out.println(decimalCorto);
        System.out.println(decimalLargo);
        System.out.println(caracter);
        System.out.println(esValido);

        //Array o areglos
        String[] nombres = new String[]{"Alexis", "Lea", "Maycol", "Haysen"};

        /*System.out.println();
        System.out.println("Arreglos de nombres:");*/
        nuevoTema("Arreglos nombres");
        System.out.println(nombres[0]);
        System.out.println(nombres[1]);
        System.out.println(nombres[2]);
        System.out.println(nombres[3]);

        int[] numeros = new int[]{1, 2, 3, 4, 5};

        /*System.out.println();
        System.out.println("Arreglos Numericos:");*/
        nuevoTema("Arreglos Numericos");
        System.out.println(numeros[0]);
        System.out.println(numeros[1]);
        System.out.println(numeros[2]);
        System.out.println(numeros[3]);
        System.out.println(numeros[4]);

        float[] decimales = new float[]{12.3f, 11.3f, 18.3f, 32.3f, 64.3f};

        /*System.out.println();
        System.out.println("Arreglos decimales:");*/
        nuevoTema("Arreglos decimales");
        System.out.println(decimales[0]);
        System.out.println(decimales[1]);
        System.out.println(decimales[2]);
        System.out.println(decimales[3]);
        System.out.println(decimales[4]);

        //estructuras if

        /*System.out.println();
        System.out.println("Ciclos y condiciones:");*/
        nuevoTema("Ciclos y condiciones");
        enteroLargo = 2506L;
        if (enteroLargo > 500){
            System.out.println("Es mayor");
        }else if (enteroLargo == 500){
            System.out.println("Es igual");
        } else{
            System.out.println("Es menor");
        }

        //operador ternario
        /*System.out.println();
        System.out.println("operador ternario:");*/
        nuevoTema("operador ternario");
        System.out.println(enteroLargo > 1000? "Es mayor" : "No es mayor");

        //ciclo for
        /*System.out.println();
        System.out.println("Ciclo for:");*/
        nuevoTema("Ciclo For");
        for (int i = 0; i<3; i++){
            System.out.println("posicion:" + i);
        }
        /*System.out.println();
        System.out.println("for each nombres:");*/
        nuevoTema("For each Nombres");
        for (String nombre : nombres){
            System.out.println(nombre);
        }
        /*System.out.println();
        System.out.println("for each enteros:");*/
        nuevoTema("For each Numeros");
        for (int numero : numeros){
            System.out.println(numero);
        }
        /*System.out.println();
        System.out.println("for each decimales:");*/
        nuevoTema("For each decimales");
        for (float decimal : decimales){
            System.out.println(decimal);
        }

        //switch
       /* System.out.println();
        System.out.println("Switch:");*/
       nuevoTema("Switch");
        int index = (int)(Math.random() * 5);
        String nombrerAleatorio =  index < 4? nombres[index] : "Anonimo";
        System.out.println("el valor de index: " + index);
        switch (nombrerAleatorio) {
            case "Alexis":
                System.out.println("soy yo!");
                break;
            case "Lea":
            case "Maycol":
            case "Haysen":
                System.out.println("Es " + nombrerAleatorio);
                break;
            default:
                System.out.println("Esta persona no existe en el listado");
        }
    }
    //Metodos
    public static void nuevoTema(String title){
        System.out.println("\n===============>" + title + ":");
    }
}
