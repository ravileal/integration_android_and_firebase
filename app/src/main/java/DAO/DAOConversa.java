package DAO;

import android.util.Log;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

import Model.Conversa;
import Model.Mensagem;

public class DAOConversa extends DAO<Conversa> {

    public DAOConversa() {
        tableName = Tables.Conversa;
        classType = Conversa.class;
    }


    public void readId(String id, Response.Result<Conversa> response){
        super.readId(id, response,
            hashMap -> {
                Conversa obj = new Conversa();
                obj.setId(String.valueOf(hashMap.get("id")));
                obj.setTitle(String.valueOf(hashMap.get("title")));

                ArrayList<String> list = new ArrayList<>();

                list.add(String.valueOf(hashMap.get("idConversa")));
                obj.setIdUsuario(list);
                return obj;
            }
        );
    }

}
