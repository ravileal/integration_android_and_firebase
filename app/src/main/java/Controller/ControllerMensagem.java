package Controller;

import DAO.DAOMensagem;
import DAO.Response;
import Model.Conversa;
import Model.Mensagem;

public class ControllerMensagem {

    private DAOMensagem dao = new DAOMensagem();

    public void create(Mensagem mensagem){
        dao.create(mensagem);
    }

    public void readAll(Response.Result<Mensagem> result){
        dao.readAll(result);
    }

    public void readId(String id, Response.Result<Mensagem> result){
        dao.readId(id, result);
    }

    public void readIdConversa(String idConversa, Response.Result<Mensagem> result){
        dao.readIdConversa(idConversa, result);
    }

    public void delete(String id){
        dao.delete(id);
    }


}
