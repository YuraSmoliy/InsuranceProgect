import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String firstName;
	private String LastName;
	private Date dateOfRegistration;
	private Calendar dateOfBirsthday;

	@ManyToMany(cascade = { CascadeType.MERGE, CascadeType.REMOVE }, fetch = FetchType.LAZY)
	List<Tariff> tariff;

	public Person(String firstName, String lastName, Calendar dateOfBirsthday) {
		
		this.firstName = firstName;
		LastName = lastName;
		this.dateOfRegistration = new Date();
		this.dateOfBirsthday = dateOfBirsthday;
		
	}

	public Date getDateOfRegistration() {
		return dateOfRegistration;
	}

	public void setDateOfRegistration(Date dateOfRegistration) {
		this.dateOfRegistration = dateOfRegistration;
	}

	public Calendar getDateOfBirsthday() {
		return dateOfBirsthday;
	}

	public void setDateOfBirsthday(Calendar dateOfBirsthday) {
		this.dateOfBirsthday = dateOfBirsthday;
	}

	public Person() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public List<Tariff> getTarif() {
		return tariff;
	}

	public void setTarif(List<Tariff> tariff) {
		this.tariff = tariff;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", firstName=" + firstName + ", LastName=" + LastName + ", dateOfRegistration="
				+ dateOfRegistration + ", dateOfBirsthday=" + dateOfBirsthday + ", tariff=" + tariff + "]";
	}

}
