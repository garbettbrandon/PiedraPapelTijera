package com.example.piedrapapeltijera;

public class IAMaquina {

    int puntuación, jugada;

    public int getJugada() {return jugada;}

    public void setJugada(int jugada) {this.jugada = jugada;}

    public IAMaquina(int puntuación) {this.puntuación = puntuación;}

    public int getPuntuación() {
        return puntuación;
    }

    public void setPuntuación(int puntuación) {
        this.puntuación = puntuación;
    }

    public int gana(){
        return puntuación++;
    }

    public int pierde(){
        return puntuación--;
    }

    protected int randomMaquina (){return (int) (Math.random()*3)+1;}
}