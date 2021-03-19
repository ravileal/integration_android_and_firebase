package com.example.integrationfirebase;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

import Controller.ControllerConversa;
import Controller.ControllerMensagem;
import Model.Conversa;
import Model.Mensagem;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        carregarConversas();
    }


    private void carregarConversas(){
        RecyclerView mRecyclerView = findViewById(R.id.recycleConversa);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        new ControllerConversa().readAll( list -> {
            mRecyclerView.setAdapter(configureAdapter((ArrayList<Conversa>) list));
        });
    }

    private ConversaAdapter configureAdapter(ArrayList<Conversa> list){
        ConversaAdapter conversaAdapter = new ConversaAdapter(list, idConversa -> {
            Intent intent = new Intent(this, MensagensActivity.class);
            intent.putExtra("conversa", idConversa);
            startActivity(intent);
        });
        return conversaAdapter;
    }

}