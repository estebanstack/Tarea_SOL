package com.SOLID;

 public class Coche {
    private String marca;
    private int year;
    private boolean aireAcondicionado;
    private int puertas;
    String tipo = "Coche";

    public Coche(){};

    public Coche(String marca, int year, boolean aireAcondicionado, int puertas) {
        this.marca = marca;
        this.year = year;
        this.aireAcondicionado = aireAcondicionado;
        this.puertas = puertas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isAireAcondicionado() {
        return aireAcondicionado;
    }

    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }
    public String getTipo(){
        return tipo;
    }
}
