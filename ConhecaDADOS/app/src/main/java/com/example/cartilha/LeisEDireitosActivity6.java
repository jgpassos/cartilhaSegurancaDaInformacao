package com.example.cartilha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Locale;

public class LeisEDireitosActivity6 extends AppCompatActivity {

    TextToSpeech t1, t2, t3, t4, t5;
    TextView textView1;
    TextView textView2;
    TextView textView3;
    TextView textView4;
    TextView textView5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leis_edireitos6);

        Button buttonProxPagina11 = (Button) findViewById(R.id.buttonProxPagina11);
        Button btnLer = findViewById(R.id.btnLer);

        textView1 = findViewById(R.id.txt1);
        textView2 = findViewById(R.id.txt2);
        textView3 = findViewById(R.id.txt3);
        textView4 = findViewById(R.id.txt4);
        textView5 = findViewById(R.id.txt5);

        buttonProxPagina11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), LeisEDireitosActivity7.class);
                startActivity(intent);
            }
        });

        Button home = findViewById(R.id.btn_home);
        Button anterior = findViewById(R.id.btn_anterior);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        anterior.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), LeisEDireitosActivity5.class);
                startActivity(intent);
            }
        });

        t1 = new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {
                if(i != TextToSpeech.ERROR) {
                    t1.setLanguage(Locale.getDefault());
                }
            }
        });

        t2 = new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {
                if(i != TextToSpeech.ERROR) {
                    t2.setLanguage(Locale.getDefault());
                }
            }
        });

        t3 = new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {
                if(i != TextToSpeech.ERROR) {
                    t3.setLanguage(Locale.getDefault());
                }
            }
        });

        t4 = new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {
                if(i != TextToSpeech.ERROR) {
                    t4.setLanguage(Locale.getDefault());
                }
            }
        });

        t5 = new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {
                if(i != TextToSpeech.ERROR) {
                    t5.setLanguage(Locale.getDefault());
                }
            }
        });

        btnLer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = textView1.getText().toString();
                String text2 = textView2.getText().toString();
                String text3 = textView3.getText().toString();
                String text4 = textView4.getText().toString();
                String text5 = textView5.getText().toString();

                t1.speak(text, TextToSpeech.QUEUE_ADD, null);
                t2.speak(text2, TextToSpeech.QUEUE_ADD, null);
                t3.speak(text3, TextToSpeech.QUEUE_ADD, null);
                t4.speak(text4, TextToSpeech.QUEUE_ADD, null);
                t5.speak(text5, TextToSpeech.QUEUE_ADD, null);
            }
        });
    }
}