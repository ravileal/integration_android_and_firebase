package com.example.integrationfirebase;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import Model.Mensagem;

public class MensagemAdapter extends RecyclerView.Adapter<MensagemAdapter.ExampleViewHolder>{

    private ArrayList<Mensagem> list;

    public MensagemAdapter(ArrayList<Mensagem> list) {
        this.list = list;
    }

    public static class ExampleViewHolder extends RecyclerView.ViewHolder {

        private TextView text;

        public ExampleViewHolder(@NonNull View itemView) {
            super(itemView);
            text = itemView.findViewById(R.id.TextViewTitulo);
        }
    }

    @Override
    public ExampleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_mensagem, parent, false);
        return new ExampleViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ExampleViewHolder holder, int position) {
        holder.text.setText(list.get(position).getMensagem());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

}