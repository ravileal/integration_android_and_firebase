package Controller;

import DAO.DAOTag;
import DAO.Response;
import Model.Tag;

public class ControllerTag {

    DAOTag dao = new DAOTag();

    public void crete(Tag tag){
        dao.create(tag);
    }

    public void readAll(Response.Result<Tag> result){
        dao.readAll(result);
    }

    public void readId(String id, Response.Result<Tag> result){
        dao.readId(id, result);
    }

    public void delete(String id){
        dao.delete(id);
    }

    public void update(Tag tag){
        dao.update(tag);
    }

}
