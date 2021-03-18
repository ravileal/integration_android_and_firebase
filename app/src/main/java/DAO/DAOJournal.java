package DAO;

import com.google.firebase.database.DatabaseReference;

import Model.Journal;
import Model.Tag;

public class DAOJournal extends DAO<Journal> {

    public DAOJournal() {
        tableName = Tables.Journal;
        classType = Journal.class;
    }

    public void readId(String id, Response.Result<Journal> response){
        super.readId(id, response,
            hashMap -> {
                Journal j = new Journal();
                j.setId(String.valueOf(hashMap.get("id")));
                j.setTitle(String.valueOf(hashMap.get("title")));
                j.setContent(String.valueOf(hashMap.get("content")));
                return j;
            }
        );
    }

    public void update(Journal journal){
        DatabaseReference tagReference = super.update(journal.getId());

        tagReference.child("title").setValue(journal.getTitle());
        tagReference.child("content").setValue(journal.getContent());
        tagReference.child("tagName").setValue(journal.getTagName());
    }

}
