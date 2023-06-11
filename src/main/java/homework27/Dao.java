package homework27;
import java.util.List;

import java.sql.SQLException;

public interface Dao<T> {
    T get(int id) throws SQLException;
    List<T> getAll() throws SQLException;
    void save(T t) throws SQLException;
    void update(T t, String[] params);
    void delete(T t) throws SQLException;
}