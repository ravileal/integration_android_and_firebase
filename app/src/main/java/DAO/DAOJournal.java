package DAO;

import java.util.HashMap;

import model.Journal;

public class DAOJournal extends DAO<Journal> {

    public DAOJournal() {
        tableName = Tables.Journal;
        classType = Journal.class;
    }

    public void readId(String id, Response.Result<Journal> response){
        super.readId(id, response,
            new Response.MapToObjectList<Journal>() {
                @Override
                public Journal result(HashMap hashMap) {
                    Journal j = new Journal();
                    j.setId(String.valueOf(hashMap.get("id")));
                    j.setTitle(String.valueOf(hashMap.get("title")));
                    j.setContent(String.valueOf(hashMap.get("content")));
                    return j;
                }
            }
        );
    }

}
