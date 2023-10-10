package com.example.piedrapapeltijera;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;
import com.example.piedrapapeltijera.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageButton btnPiedra, btnPapel, btnTijeras;
    TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPiedra = findViewById(R.id.btnPiedra);
        btnPapel = findViewById(R.id.btnPapel);
        btnTijeras = findViewById(R.id.btnTijeras);
        txtResultado = findViewById(R.id.tvResultado);

        btnPiedra.setOnClickListener(this);
        btnPapel.setOnClickListener(this);
        btnTijeras.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnPiedra:
                jugar("Piedra");
                break;
            case R.id.btnPapel:
                jugar("Papel");
                break;
            case R.id.btnTijeras:
                jugar("Tijeras");
                break;
        }
    }

    private void jugar(String eleccionJugador) {
        String[] opciones = {"Piedra", "Papel", "Tijeras"};
        Random rand = new Random();
        int eleccionComputadora = rand.nextInt(3); // 0 para Piedra, 1 para Papel, 2 para Tijeras

        String eleccionComputadoraTexto = opciones[eleccionComputadora];

        String resultado = determinarResultado(eleccionJugador, eleccionComputadoraTexto);

        // Mostrar el resultado en el TextView
        txtResultado.setText(resultado);
    }

    private String determinarResultado(String eleccionJugador, String eleccionComputadora) {
        if (eleccionJugador.equals(eleccionComputadora)) {
            return "Empate, la máquina tambien sacó "+eleccionComputadora;
        } else if ((eleccionJugador.equals("Piedra") && eleccionComputadora.equals("Tijeras")) ||
                (eleccionJugador.equals("Papel") && eleccionComputadora.equals("Piedra")) ||
                (eleccionJugador.equals("Tijeras") && eleccionComputadora.equals("Papel"))) {
            return "Ganaste, la máquina sacó "+ eleccionComputadora;
        } else {
            return "Perdiste, la máquina sacó "+ eleccionComputadora;
        }
    }
}
