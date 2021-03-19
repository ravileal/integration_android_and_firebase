package com.example.integrationfirebase;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;

import java.util.ArrayList;

import Controller.ControllerMensagem;
import Model.Mensagem;

public class MensagensActivity extends AppCompatActivity {

    private String idUserLogado = "djkljlkfjsdlksjdfsdf";
    private String idConversa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mensagens);

        idConversa = getIntent().getStringExtra("conversa");
        Log.d("aaaaaaaaa", "configureAdapter: "+ idConversa);

        configureEnviarMensagem();
        carregarMensagens();
    }

    private void configureEnviarMensagem(){
        Button button = findViewById(R.id.buttonEnviar);
        button.setOnClickListener(v -> {
            TextInputEditText inputMensagem = findViewById(R.id.textInputEditTextMensagem);
            Mensagem mensagem = new Mensagem(inputMensagem.getText().toString(), idConversa, idUserLogado);
            new ControllerMensagem().create(mensagem);
            inputMensagem.setText("");
        });
    }

    private void carregarMensagens(){
        RecyclerView mRecyclerView = findViewById(R.id.recycleMensagens);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        new ControllerMensagem().readIdConversa(idConversa, list -> {
            mRecyclerView.setAdapter(new MensagemAdapter((ArrayList<Mensagem>) list));
        });
    }

}