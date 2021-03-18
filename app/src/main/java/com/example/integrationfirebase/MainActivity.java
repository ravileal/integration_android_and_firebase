package com.example.integrationfirebase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import Controller.ControllerJournal;
import Controller.ControllerTag;
import DAO.DAOTag;
import DAO.DAOJournal;
import Model.Journal;
import Model.Tag;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        crudJournal();
    }

    private void crudTag(){
        ControllerTag ctrlTag = new ControllerTag();

        for(Tag tag: SampleData.getSampleTags())
            ctrlTag.crete(tag);

        ctrlTag.readAll(list -> {
            for ( Tag t : list ) {
                Log.d("firebase Tag", t.getId() );
                Log.d("firebase Tag", t.getTagName() );
                Log.d("firebase Tag", t.getJournalCount() );
            }
        });

        ctrlTag.readId("-MW2AGXX6vfeNGhkRhGC" ,list -> {
            Tag t = list.get(0);

            Log.d("firebase Tag", t.getId() );
            Log.d("firebase Tag", t.getTagName() );
            Log.d("firebase Tag", t.getJournalCount() );
        });

        Tag tag = new Tag();
        tag.setId("-MW2J0p279GsnA-_pAg9");
        tag.setTagName("This is a test");
        tag.setJournalCount("10");
        ctrlTag.update(tag);

        ctrlTag.delete("");
    }

    private void crudJournal(){
        ControllerJournal ctrl = new ControllerJournal();

        for(Journal journal: SampleData.getSampleJournal())
            ctrl.crete(journal);

        // Read for all itens of list
        ctrl.readAll( list -> {
            for ( Journal j : list ) {
                Log.d("firebase Jornaul", j.getId() );
                Log.d("firebase Jornaul", j.getTitle() );
                Log.d("firebase Jornaul", j.getContent() );
            }
        });

        // Read for id
        ctrl.readId("-MW2AGXX6vfeNGhkRhGC", list -> {
            Journal j = list.get(0);

            Log.d("firebase Jornaul", j.getTitle() );
            Log.d("firebase Jornaul", j.getContent() );
        });

        // Delete for id
        ctrl.delete("-MW2Gp3_k5W-8sdWLg4G");

        // Update for id
        Journal j = new Journal();
        j.setId("-MW2AGXX6vfeNGhkRhGC");
        j.setTitle("Journal Quixeramobim");
        j.setContent("Content of seca and quintura");
        ctrl.update(j);
    }
}