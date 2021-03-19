package com.example.integrationfirebase;

import java.util.ArrayList;
import java.util.List;

import Model.Conversa;
import Model.Mensagem;

public abstract class SampleData {


    public static List<Mensagem> getSampleMensagem() {

        List<Mensagem> list = new ArrayList<>();

        list.add(new Mensagem("Teste", "-MW9ipcMasOxGnIERqaE", "djkljlkfjsdlksjdfsdf"));

        list.add(new Mensagem("asd", "-MW9ipcMasOxGnIERqaE", "564asd65as4da65sd4a5"));

        list.add(new Mensagem("aaaaaaa", "-MW9ipcMasOxGnIERqaE", "djkljlkfjsdlksjdfsdf"));


        list.add(new Mensagem("Olá, tudo bem?", "-MW9ipcWyU473mXzGzqo", "234sdfsdf435345fsdf"));

        list.add(new Mensagem("Sim, tudo ótimo", "-MW9ipcWyU473mXzGzqo", "234234dsfsdfsdfsdfd"));


        list.add(new Mensagem("Alguém na faculdade", "-MW9ipcWyU473mXzGzqo", "234sddasd3dadasd2das"));

        list.add(new Mensagem("Já estou chegando", "-MW9ipcWyU473mXzGzqo", "da4sd65a4sd65a4sd65a"));

        list.add(new Mensagem("Estou na sala", "-MW9ipcWyU473mXzGzqo", "asd654as6d5a4s6d5a4s"));

        list.add(new Mensagem("Por que ninguém avisou que tinha prova?", "-MW9ipcWyU473mXzGzqo", "65as4d6a5sd4a6s5d4as"));

        return list;
    }

    public static List<Conversa> getSampleConversa() {
        ArrayList<Conversa> listConversa = new ArrayList<>();

        Conversa obj = new Conversa();
        obj.setTitle("João");

        ArrayList<String> list = new ArrayList<>();
        list.add("djkljlkfjsdlksjdfsdf");
        list.add("564asd65as4da65sd4a5");

        obj.setIdUsuario(list);
        listConversa.add(obj);

        obj = new Conversa();
        obj.setTitle("Irineu");

        list = new ArrayList<>();
        list.add("234sdfsdf435345fsdf");
        list.add("234234dsfsdfsdfsdfd");

        obj.setIdUsuario(list);
        listConversa.add(obj);

        obj = new Conversa();
        obj.setTitle("Grupo da faculdade");

        list = new ArrayList<>();
        list.add("234sddasd3dadasd2das");
        list.add("da4sd65a4sd65a4sd65a");
        list.add("asd654as6d5a4s6d5a4s");
        list.add("65as4d6a5sd4a6s5d4as");

        obj.setIdUsuario(list);
        listConversa.add(obj);

        return listConversa;
    }

}
