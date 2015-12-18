import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Franchyza {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private int sumFranchyza;
	@OneToMany(cascade = { CascadeType.MERGE, CascadeType.REMOVE }, fetch = FetchType.LAZY,mappedBy="franchyza")
	private List<Tariff> tariff;
	public Franchyza() {
	
	}
	
	public Franchyza(int sumFranchyza) {
		super();
		this.sumFranchyza = sumFranchyza;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSumFranchyza() {
		return sumFranchyza;
	}
	public void setSumFranchyza(int sumFranchyza) {
		this.sumFranchyza = sumFranchyza;
	}
	public List<Tariff> getTariff() {
		return tariff;
	}
	public void setTariff(List<Tariff> tariff) {
		this.tariff = tariff;
	}
	@Override
	public String toString() {
		return "Franchyza [id=" + id + ", sumFranchyza=" + sumFranchyza + ", tariff=" + tariff + "]";
	}
	
}
