package com.example.integrationfirebase;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import Model.Conversa;
import Model.Mensagem;

public class ConversaAdapter extends RecyclerView.Adapter<ConversaAdapter.ExampleViewHolder>{

    private ArrayList<Conversa> list;
    private ConfigureLitenerAdapter configureLitenerAdapter;

    public ConversaAdapter(ArrayList<Conversa> list, ConfigureLitenerAdapter configureLitenerAdapter) {
        this.list = list;
        this.configureLitenerAdapter = configureLitenerAdapter;
    }

    public static class ExampleViewHolder extends RecyclerView.ViewHolder {

        private TextView textTitulo;
        private TextView textIdConversa;
        private View itemView;

        public ExampleViewHolder(@NonNull View itemView, ConfigureLitenerAdapter configureLitenerAdapter) {
            super(itemView);
            this.itemView = itemView;
            textTitulo = itemView.findViewById(R.id.TextViewTitulo);
            textIdConversa = itemView.findViewById(R.id.textViewIdConversa);
        }
    }

    @Override
    public ExampleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_item_conversa, parent, false);
        return new ExampleViewHolder(v, configureLitenerAdapter);
    }

    @Override
    public void onBindViewHolder(@NonNull ExampleViewHolder holder, int position) {
        holder.textTitulo.setText(list.get(position).getTitle());
        holder.textIdConversa.setText(list.get(position).getId());
        holder.itemView.setOnClickListener(v -> {
            configureLitenerAdapter.onClickListener(list.get(position).getId());
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

}