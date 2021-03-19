package Controller;

import DAO.DAOConversa;
import DAO.Response;
import Model.Conversa;

public class ControllerConversa {

    private DAOConversa dao = new DAOConversa();

    public void create(Conversa obj){ dao.create(obj); }

    public void readAll(Response.Result<Conversa> result){
        dao.readAll(result);
    }

    public void readId(String id, Response.Result<Conversa> result){
        dao.readId(id, result);
    }

    public void delete(String id){
        dao.delete(id);
    }


}
