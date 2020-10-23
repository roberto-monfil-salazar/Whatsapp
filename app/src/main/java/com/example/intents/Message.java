package com.example.intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Message extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);
        Intent recibiDatos=getIntent();
        String message=recibiDatos.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView textContenido= findViewById(R.id.textView);
        textContenido.setText(message);
    }
    public void  regresar(View view){
        Intent regresar = new Intent (this,MainActivity.class);
        startActivity(regresar);
    }
}