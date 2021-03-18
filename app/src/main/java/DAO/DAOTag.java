package DAO;

import android.util.Log;

import androidx.annotation.NonNull;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DataSnapshot;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import model.Journal;
import model.Tag;

public class DAOTag extends DAO<Tag>{

    public DAOTag() {
        tableName = Tables.tag;
        classType = Tag.class;
    }

    public void readId(String id, Response.Result response){
        super.readId(id, response,
            new Response.MapToObjectList<Tag>() {
                @Override
                public Tag result(HashMap hashMap) {
                    Tag t = new Tag();
                    t.setTagName(String.valueOf(hashMap.get("tagName")));
                    t.setJournalCount(String.valueOf(hashMap.get("content")));
                    return t;
                }
            }
        );
    }

}
