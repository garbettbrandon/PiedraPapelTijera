package com.example.piedrapapeltijera;

public class Player {

    int puntuación, jugada;

    public int getJugada() {return jugada;}

    public void setJugada(int jugada) {this.jugada = jugada;}

    public Player(int puntuación) {this.puntuación = puntuación;}

    public void setPuntuación(int puntuación) {
        this.puntuación = puntuación;
    }

    public int getPuntuación() {
        return puntuación;
    }

    public int gana(){
        return puntuación++;
    }

    public int pierde(){
        return puntuación--;
    }
}
