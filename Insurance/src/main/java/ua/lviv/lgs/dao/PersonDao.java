package ua.lviv.lgs.dao;
import java.util.List;

import ua.lviv.lgs.entity.Person;

public interface PersonDao {
	void savePerson(Person person);

	void removePerson(Person person);

	List<Person> findAllPerson();
}
