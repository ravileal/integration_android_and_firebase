package com.example.integrationfirebase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;


import DAO.DAO;
import DAO.DAOTag;
import DAO.DAOJournal;
import model.Journal;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DAO daoTag = new DAOTag();
        //daoTag.create(getSampleTags());
//        daoTag.read((Response<Tag>) objList -> {
//            for (Tag t: objList)
//                Log.d("Tab response data: ", t.toString());
//        });

        DAOJournal daoJournal = new DAOJournal();
        //daoJournal.create(getSampleJournal());
        daoJournal.readAll( list -> {
            for ( Journal j : list ) {
                Log.d("firebase aaaaaaa", j.getId() );
                Log.d("firebase aaaaaaa", j.getTitle() );
                Log.d("firebase aaaaaaa", j.getContent() );
            }
        });
        daoJournal.readId("-MW2AGXX6vfeNGhkRhGC", list -> {
            Journal j = list.get(0);

            Log.d("firebase aaaaaaa", j.getTitle() );
            Log.d("firebase aaaaaaa", j.getContent() );
        });

    }


}