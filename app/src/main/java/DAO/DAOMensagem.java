package DAO;

import android.os.Message;
import android.util.Log;

import androidx.annotation.NonNull;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import Model.Mensagem;

public class DAOMensagem extends DAO<Mensagem> {

    public DAOMensagem() {
        tableName = Tables.Mensagem;
        classType = Mensagem.class;
    }

    public void readId(String id, Response.Result<Mensagem> response){
        super.readId(id, response,
                hashMap -> {
                    Mensagem obj = new Mensagem();
                    obj.setId(String.valueOf(hashMap.get("id")));
                    obj.setMensagem(String.valueOf(hashMap.get("mensagem")));
                    obj.setIdConversa(String.valueOf(hashMap.get("idConversa")));
                    obj.setIdUsuario(String.valueOf(hashMap.get("idUsuario")));
                    return obj;
                }
        );
    }

    public void readIdConversa(String idConversa, Response.Result<Mensagem> response){
        readIdConversa(idConversa, response,
                hashMap -> {
                    Mensagem obj = new Mensagem();
                    obj.setId(String.valueOf(hashMap.get("id")));
                    obj.setMensagem(String.valueOf(hashMap.get("mensagem")));
                    obj.setIdConversa(String.valueOf(hashMap.get("idConversa")));
                    obj.setIdUsuario(String.valueOf(hashMap.get("idUsuario")));
                    return obj;
                }
        );
    }

    private void readIdConversa(String idConversa, Response.Result<Mensagem> response, Response.MapToObjectList<Mensagem> mapToObject){
        Connection.configureTable(tableName).addValueEventListener(
                new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        List<Mensagem> objList = new ArrayList<Mensagem>();
                        for (DataSnapshot noteSnapshot: dataSnapshot.getChildren()) {
                            Mensagem m = (Mensagem) noteSnapshot.getValue(classType);
                            if(m.getIdConversa().equals(idConversa))
                                objList.add(m);
                        }
                        response.result(objList);
                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {
                        Log.e(tableName+" error data: ", databaseError.getMessage());
                    }
                });
    }

}
