import java.util.List;

interface PersonDao {
	void savePerson(Person person);

	void removePerson(Person person);

	List<Person> findAllPerson();
}
