package com.example.piedrapapeltijera;

import android.view.View;
import android.widget.TextView;

public class Manejador implements View.OnClickListener {
    Player jugador;
    IAMaquina maquina;
    String id;
    TextView resultado, resultadoYo, resultadoM;

    public Manejador(TextView resultado,TextView resultadoYo,TextView resultadoM, Player jugador, IAMaquina maquina) {
        this.resultado=resultado;
        this.jugador=jugador;
        this.maquina=maquina;
        this.resultadoYo=resultadoYo;
        this.resultadoM=resultadoM;
    }

    @Override
    public void onClick(View view) {
        id=view.getResources().getResourceEntryName(view.getId());
        switch (id){
            case "botonPiedra":
                jugador.setJugada(1);
                break;
        }
        maquina.setJugada(maquina.randomMaquina());

        switch (resultado()){

        }
    }

    public int resultado(){
        if (jugador.getJugada()==1 && maquina.getJugada()==3||
                jugador.getJugada()==2 && maquina.getJugada()==1||
                jugador.getJugada()==3 && maquina.getJugada()==2){
            return 1;
        }else if (maquina.getJugada()==1 && jugador.getJugada()==3||
                maquina.getJugada()==2 && jugador.getJugada()==1||
                maquina.getJugada()==3 && jugador.getJugada()==2){
            return 2;
        }else return 3;
    }
}
