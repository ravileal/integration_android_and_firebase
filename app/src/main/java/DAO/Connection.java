package DAO;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Connection {

    private static DatabaseReference mDatabase = null;

    public Connection() {
        configureReference();
    }

    private static void configureReference(){
        mDatabase =  FirebaseDatabase.getInstance().getReference();
    }

    public static DatabaseReference configureTable(String nameTable){
        if(mDatabase == null) configureReference();
        return mDatabase.child(nameTable);
    }

}
