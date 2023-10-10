package com.example.piedrapapeltijera;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView resultado, resultadoYo, resultadoM;
    ImageButton piedra, papel, tijera;
    Button reset;
    Player jugador;
    IAMaquina maquina;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        jugador = new Player(0);
        maquina = new IAMaquina(0);

        resultado=findViewById(R.id.resultado);
        resultadoYo=findViewById(R.id.marcadorYo);
        resultadoM=findViewById(R.id.marcadorM);
        piedra=findViewById(R.id.botonPiedra);
        papel=findViewById(R.id.botonPapel);
        tijera=findViewById(R.id.botonTijera);
        reset=findViewById(R.id.botonReset);

        Manejador manejador= new Manejador (resultado, resultadoYo, resultadoM, jugador, maquina);

        piedra.setOnClickListener(manejador);
        papel.setOnClickListener(manejador);
        tijera.setOnClickListener(manejador);
    }
}