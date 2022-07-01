import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.SessionFactoryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.internal.SessionFactoryImpl;

public class AppMain1 {
    public static void main(String[]args){
        Author a = new Author();
        a.setName("james cartner");
        a.setId(101);
        a.setSponser_person(a); // self referencing 
        Sponser s = new Sponser();
        s.setSponser_id(1);
        s.setSponser_name("jamesc");


        Configuration con = new Configuration().configure().addAnnotatedClass(Author.class);


    SessionFactory sf = con.buildSessionFactory();
        Session    session = sf.openSession();
    Transaction tx = session.beginTransaction();
    session.save(a);

        tx.commit();
        session.close();

    }
}
