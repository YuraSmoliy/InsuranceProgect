import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class PersonDaoimpl implements PersonDao {
	EntityManagerFactory factory=Persistence.createEntityManagerFactory("Primary");
	
	public boolean savePerson(Person person) {
		boolean rez=false;
	EntityManager em=factory.createEntityManager();
	em.getTransaction().begin();
	em.persist(person);
	rez=true;
	em.getTransaction().commit();
		return rez;
	}

	public boolean removePerson(Person person) {
		boolean rez=false;
		EntityManager em=factory.createEntityManager();
		em.getTransaction().begin();
		em.remove(person);
		rez=true;
		em.getTransaction().commit();
		return rez;
	}

	public List<Person> findAllPerson() {
		List<Person> rez;
		EntityManager em=factory.createEntityManager();
		em.getTransaction().begin();
		rez=em.createNativeQuery("select from Person").getResultList();
		
		return rez;
	}

}
