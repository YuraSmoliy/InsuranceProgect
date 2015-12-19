import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import ua.lviv.lgs.dao.PersonDao;
import ua.lviv.lgs.dao.implementation.PersonDaoImpl;

public class Main {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("Primary");
		EntityManager em=factory.createEntityManager();
		PersonDao dao = new PersonDaoImpl(em);
		
//		em.merge(new Person("Yura", "Smoliy",1990,6));em.merge(new Person("Yura", "Smoliy",1990,6));
//		em.persist(new Tariff(2));
//List<Tariff>t=new ArrayList<Tariff>();t.add(em.getReference(Tariff.class, 1));
//		em.getReference(Person.class,1).setTarif(t);
//		System.out.println(em.find(Tariff.class,1)+" "+em.find(Tariff.class,1).getPerson());
//		List<String>list=em.createQuery("select firstName from Person where firstName like'%a%'").getResultList();
//		System.out.println(list);
//		em.remove(em.find(Person.class,2));
//		Person p=em.find(Person.class,1);p.firstName="aaaa";
//		em.merge(p);
		
		
		em.close();
		factory.close();
		System.exit(0);
		
	}

}
