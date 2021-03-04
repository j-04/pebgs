package ru.pebgs.serivce;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.pebgs.model.Mark;

import java.util.Optional;

@Service
public class MainService {
    @Autowired
    private SessionFactory sessionFactory;

    public Optional<Mark> getMarkById(final Long id) {
        Session entityManager = (Session) sessionFactory.createEntityManager();
        return entityManager.byId(Mark.class).loadOptional(id);
    }
}
