package com.lhamfor.practicas;
//implementacion de herencia de  Casa;
public class Apartamento extends Casa {
    private  short numerointerno;

    public Apartamento(String calle, char seccion, short numero, int precio, long fechaConstruccion,
                       float impuesto, double metrosCubicos, boolean hipoteca, short numerointerno) {
        super(calle, seccion, numero, precio, fechaConstruccion, impuesto, metrosCubicos, hipoteca);
        this.numerointerno = numerointerno;
    }

    public short getNumerointerno() {
        return numerointerno;
    }

    public void setNumerointerno(short numerointerno) {
        this.numerointerno = numerointerno;
    }
}
