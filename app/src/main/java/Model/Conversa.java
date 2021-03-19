package Model;

import java.util.ArrayList;

public class Conversa extends Model{

    private String title;
    private ArrayList<String> idUsuario;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<String> getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(ArrayList<String> idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Override
    public String toString() {
        return "Conversa{" +
                "title='" + title + '\'' +
                ", idUsuario=" + idUsuario +
                ", id='" + id + '\'' +
                '}';
    }
}
