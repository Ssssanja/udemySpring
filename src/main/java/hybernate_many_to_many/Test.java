package hybernate_many_to_many;

import hybernate_many_to_many.entity.Child;
import hybernate_many_to_many.entity.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Child.class)
                .addAnnotatedClass(Section.class)
                .buildSessionFactory();

        Session session = null;

        try {
            session = factory.getCurrentSession();
            session.beginTransaction();

            Child child = session.get(Child.class, 5);


            session.delete(child);


            session.getTransaction().commit();
            System.out.println("DONE!");
            //*******************************************************

//            session = factory.getCurrentSession();
//            Section section1 = new Section("Volleyball");
//            Section section2 = new Section("Chess");
//            Section section3 = new Section("Math");
//            Child child1 = new Child("Igor", 10);
//            child1.addSectionToChild(section1);
//            child1.addSectionToChild(section2);
//            child1.addSectionToChild(section3);
//
//            session.beginTransaction();
//            session.save(child1);
//
//
//            session.getTransaction().commit();
//            System.out.println("DONE!");
            //*******************************************************

//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//            Section section = session.get(Section.class, 1);
//            System.out.println(section);
//            System.out.println(section.getChildren());
//
//
//            session.getTransaction().commit();
//            System.out.println("DONE!");
            //*******************************************************

//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//            Child child = session.get(Child.class, 4);
//            System.out.println(child);
//            System.out.println(child.getSections());
//
//
//            session.getTransaction().commit();
//            System.out.println("DONE!");

            //*******************************************************

//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//            Section section = session.get(Section.class, 1);
//            session.delete(section);
//
//
//            session.getTransaction().commit();
//            System.out.println("DONE!");

        }
        finally {
            session.close();
            factory.close();
        }
    }
}
