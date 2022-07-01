import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class AppMain {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setName("Abdul");
        e1.setId(104);
Branch b = new Branch();
b.setBranchName("Bellandhur");
b.setBranchId(1);
        e1.setB(b);

        Configuration con = new Configuration().configure().addAnnotatedClass(Employee.class).addAnnotatedClass(Branch.class);

        SessionFactory sf = con.buildSessionFactory();
        Session s = sf.openSession();
        Transaction tx = s.beginTransaction();
        s.save(e1);
        tx.commit();
        s.close();
    }
}
