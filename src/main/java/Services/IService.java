package Services;

import Entites.Commande;

import java.sql.SQLException;
import java.util.List;

public interface IService<T> {

    void ajouter(T t) throws SQLException;
    List<T> readAll() throws SQLException;
    T findbyId(int id) throws SQLException;


}
