import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Tariff {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@ManyToOne(cascade = { CascadeType.MERGE, CascadeType.REMOVE }, fetch = FetchType.LAZY)
	private Coefficient coefficient;
	@ManyToOne(cascade = { CascadeType.MERGE, CascadeType.REMOVE }, fetch = FetchType.LAZY)
	private Franchyza franchyza;
	@ManyToOne(cascade = { CascadeType.MERGE, CascadeType.REMOVE }, fetch = FetchType.LAZY)
	private Zone zone;
	@ManyToOne(cascade = { CascadeType.MERGE, CascadeType.REMOVE }, fetch = FetchType.LAZY)
	private ÑircsInsurance circsInsurance;
	@ManyToOne(cascade = { CascadeType.MERGE, CascadeType.REMOVE }, fetch = FetchType.LAZY)
	private InsuranceAmount insuranceAmount;
	private int limitDay;
	private Calendar fromDate;
	private Calendar antilDate;
	private int cost;
	@ManyToMany(cascade = { CascadeType.MERGE, CascadeType.REMOVE }, fetch = FetchType.LAZY, mappedBy = "tariff")
	private List<Person> person;

	

	
	public Tariff(int limitDay, Calendar fromDate, Calendar antilDate) {
	
		this.limitDay = limitDay;
		this.fromDate = fromDate;
		this.antilDate = antilDate;
	}



	public Tariff() {

	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public Coefficient getCoefficient() {
		return coefficient;
	}



	public void setCoefficient(Coefficient coefficient) {
		this.coefficient = coefficient;
	}



	public Franchyza getFranchyza() {
		return franchyza;
	}



	public void setFranchyza(Franchyza franchyza) {
		this.franchyza = franchyza;
	}



	public Zone getZone() {
		return zone;
	}



	public void setZone(Zone zone) {
		this.zone = zone;
	}



	public ÑircsInsurance getCircs() {
		return circsInsurance;
	}



	public void setCircs(ÑircsInsurance circs) {
		this.circsInsurance = circs;
	}



	public InsuranceAmount getInsuranceAmount() {
		return insuranceAmount;
	}



	public void setInsuranceAmount(InsuranceAmount insuranceAmount) {
		this.insuranceAmount = insuranceAmount;
	}



	public int getLimitDay() {
		return limitDay;
	}



	public void setLimitDay(int limitDay) {
		this.limitDay = limitDay;
	}



	public int getCost() {
		return cost;
	}



	public void setCost(int cost) {
		this.cost = cost;
	}



	public List<Person> getPerson() {
		return person;
	}



	public void setPerson(List<Person> person) {
		this.person = person;
	}



	@Override
	public String toString() {
		return "Tariff [id=" + id + ", coefficient=" + coefficient + ", franchyza=" + franchyza + ", zone=" + zone
				+ ", circs=" + circsInsurance + ", insuranceAmount=" + insuranceAmount + ", limitDay=" + limitDay
				+ ", cost=" + cost + ", person=" + person + "]";
	}

	
}
