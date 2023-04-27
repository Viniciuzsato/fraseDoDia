package com.example.frasesdodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarNovaFrase(View view) {

        String frases[] = {
                "Tudo o que um sonho precisa para ser realizado é alguém que acredite que ele possa ser realizado.",
                "Imagine uma nova história para sua vida e acredite nela.",
                "Não existe um caminho para a felicidade. A felicidade é o caminho.",
                "Acredite em si e chegará um dia em que os outros não terão outra escolha senão acreditar com você."
        };

        int numero = new Random().nextInt(4);

        TextView texto = findViewById(R.id.textFrase);
        texto.setText(frases[numero]);

    }
}