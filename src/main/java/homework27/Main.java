package homework27;

import org.hibernate.Session;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException {
        System.out.println("Hello");
        StudentDao sd = new StudentDao();
        Student st = new Student();
        st.setName("Test");
        st.setEmail("Test@ukr.net");
        sd.save(st);
        //sd.getAll();
        //Session session = HibernateUtil.getSessionFactory().openSession();
        //System.out.println(session);
        //session.beginTransaction();
        //session.save(st);
        //session.getTransaction().commit();
        //session.close();
        System.out.println("saved");

    }
}
