package org.academiadecodigo.bootcamp.persistence.dao.jpa;

import org.academiadecodigo.bootcamp.persistence.model.actions.Actions;
import org.academiadecodigo.bootcamp.persistence.dao.ActionDao;
import org.springframework.stereotype.Repository;

@Repository
public class ActionDaoJPA extends GenericDao<Actions> implements ActionDao {

    public ActionDaoJPA() {
        super(Actions.class);
    }

}
