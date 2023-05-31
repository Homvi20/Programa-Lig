
package com.mycompany.liga.futbol;


public class Equipo {
    private String Nombrej;
    private int Edad;
    private String Equipo;
    private int Valorjugador;
    private int Victoria;
    private int Derrota;
    private double ValorE; 
    
    public Equipo(String Nombrej, int Edad, String Equipo, int Valorjugador){
        this.Nombrej = Nombrej;
        this.Edad = Edad;
        this.Equipo = Equipo;
        this.Valorjugador = Valorjugador;
        
    }


    public String getNombrej() {
        return Nombrej;
    }

    public void setNombrej(String Nombre) {
        this.Nombrej = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getEquipo() {
        return Equipo;
    }

    public void setEquipo(String Equipo) {
        this.Equipo = Equipo;
    }

    public int getValorjugador() {
        return Valorjugador;
    }

    public void setValorjugador(int Valorjugador) {
        this.Valorjugador = Valorjugador;
    }

    public int getVictoria() {
        return Victoria;
    }

    public void setVictoria(int Victoria) {
        this.Victoria = Victoria;
    }

    public int getDerrota() {
        return Derrota;
    }

    public void setDerrota(int Derrota) {
        this.Derrota = Derrota;
    }

    public double getValorE() {
        return ValorE;
    }

    public void setValorE(double ValorE) {
        this.ValorE = ValorE;
    }
    
    
}
