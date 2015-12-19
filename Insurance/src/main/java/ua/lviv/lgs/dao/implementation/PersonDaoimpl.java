package ua.lviv.lgs.dao.implementation;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import ua.lviv.lgs.dao.PersonDao;
import ua.lviv.lgs.entity.Person;

public class PersonDaoimpl implements PersonDao {
	private EntityManager em;

	public PersonDaoimpl(EntityManager em) {
		this.em = em;
	}

	public void savePerson(Person person) {

		em.getTransaction().begin();
		em.persist(person);

		em.getTransaction().commit();

	}

	public void removePerson(Person person) {

		em.getTransaction().begin();
		em.remove(person);

		em.getTransaction().commit();

	}

	public List<Person> findAllPerson() {

		return em.createNativeQuery("select from Person").getResultList();

	}

}
