import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver
{
	public static void main(String[] args)
	{		
		ArrayList<Media> library = new ArrayList<Media>();
		library.add(new Book("Lord of the Rings", "JRR Tolkien"));
    	library.add(new DVD("The Hobbit", 2010));
		library.add(new DVD("The Hobbit", 2012));
		library.add(new Book("Lord of the Rings", "Tolkien"));
		library.add(new DVD("The Lord of the Rings", 2006));
		library.add(new DVD("The Lord of the Rings", 2008));
		library.add(new DVD("The Hobbit", 2014));
		library.add(new DVD("The Hobbit", 2015));
		library.add(new Book("Harry Potter", "Rowling"));
		library.add(new Book("Harry Potter", "JK Rowling"));
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		Collections.sort(library);
		for (Object media : library) {
			session.save(media);
			System.out.println(media);
		}
		
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
	}
}
