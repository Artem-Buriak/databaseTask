package homework27;

import org.hibernate.Session;
import org.hibernate.Transaction;

import java.sql.SQLException;
import java.util.List;

public class StudentDao implements Dao <Student>{

    @Override
    public Student get(int id) throws SQLException {
        Session session = HibernateUtil.getSessionFactory().openSession();;
        Student student = session.get(Student.class, id);
        session.close();
        return student;
    }

    @Override
    public List<Student> getAll() throws SQLException {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Student> students = session.createQuery("FROM Student", Student.class).list();
        session.close();
        return students;
    }

    @Override
    public void save(Student student) throws SQLException {
        Session session = HibernateUtil.getSessionFactory().openSession();
        System.out.println(session);
        Transaction transaction = session.beginTransaction();
        session.persist(student);
        transaction.commit();
        session.close();
    }

    @Override
    public void update(Student student, String[] params) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.update(student);
        transaction.commit();
        session.close();
    }

    @Override
    public void delete(Student student) throws SQLException {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(student);
        transaction.commit();
        session.close();
    }
}
