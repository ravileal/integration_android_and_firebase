package com.example.integrationfirebase;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import Model.Journal;
import Model.Tag;

public abstract class SampleData {

    public static List<Journal> getSampleJournal() {

        List<Journal> journalEnrties = new ArrayList<>();

        Journal journalEntry1 = new Journal();
        journalEntry1.setTitle("DisneyLand Trip");
        journalEntry1.setContent("We went to Disneyland today and the kids had lots of fun!");
        journalEntry1.setDateModified(GregorianCalendar.getInstance().getTimeInMillis());

        journalEnrties.add(journalEntry1);

        return journalEnrties;
    }

    public static List<Tag> getSampleTags() {

        List<Tag> listTags = new ArrayList<>();

        Tag tag = new Tag();
        tag.setTagName("teste");

        listTags.add(tag);

        return listTags;
    }
}
