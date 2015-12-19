import java.util.List;

interface PersonDao {
	boolean savePerson(Person person);

	boolean removePerson(Person person);

	List<Person> findAllPerson();
}
