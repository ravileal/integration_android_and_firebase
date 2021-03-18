package Controller;

import DAO.DAOJournal;
import DAO.DAOTag;
import DAO.Response;
import Model.Journal;
import Model.Tag;

public class ControllerJournal {

    DAOJournal dao = new DAOJournal();

    public void crete(Journal journal){
        dao.create(journal);
    }

    public void readAll(Response.Result<Journal> result){
        dao.readAll(result);
    }

    public void readId(String id, Response.Result<Journal> result){
        dao.readId(id, result);
    }

    public void delete(String id){
        dao.delete(id);
    }

    public void update(Journal journal){
        dao.update(journal);
    }
}
