package DAO;

import com.google.firebase.database.DatabaseReference;

import Model.Tag;

public class DAOTag extends DAO<Tag>{

    public DAOTag() {
        tableName = Tables.tag;
        classType = Tag.class;
    }

    public void readId(String id, Response.Result<Tag> response){
        super.readId(id, response,
            hashMap -> {
                Tag t = new Tag();
                t.setTagName(String.valueOf(hashMap.get("tagName")));
                t.setJournalCount(String.valueOf(hashMap.get("content")));
                return t;
            }
        );
    }

    public void update(Tag tag){
        DatabaseReference tagReference = super.update(tag.getId());

        tagReference.child("tagName").setValue(tag.getTagName());
        tagReference.child("journalCount").setValue(tag.getJournalCount());
    }

}

