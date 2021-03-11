package hybernate_one_to_one;

import hybernate_one_to_one.entity.Detail;
import hybernate_one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();
        Session session = null;
        try {
//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//            Detail detail = session.get(Detail.class, 3);
//            System.out.println(detail.getEmployee());
//
//            session.getTransaction().commit();
//
//            System.out.println("done");

            session = factory.getCurrentSession();

            session.beginTransaction();
            Detail detail = session.get(Detail.class, 1);
            detail.getEmployee().setEmpDetail(null);
            session.delete(detail);
            session.getTransaction().commit();

            System.out.println("done");
                    }
        finally {
            session.close();
            factory.close();
        }
    }
}
