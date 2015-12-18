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

import org.hibernate.annotations.GeneratorType;

@Entity
public class ÑircsInsurance {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String circsInsurance;
	@OneToMany(cascade = { CascadeType.MERGE, CascadeType.REMOVE }, fetch = FetchType.LAZY,mappedBy="circsInsurance")
	private List<Tariff> tariff;
	public ÑircsInsurance() {
	}

	public ÑircsInsurance(String circs) {
		super();
		this.circsInsurance = circs;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCircs() {
		return circsInsurance;
	}

	public void setCircs(String circs) {
		this.circsInsurance = circs;
	}

	public List<Tariff> getTariff() {
		return tariff;
	}

	public void setTariff(List<Tariff> tariff) {
		this.tariff = tariff;
	}

	@Override
	public String toString() {
		return "Ñircs [id=" + id + ", circs=" + circsInsurance + ", tariff=" + tariff + "]";
	}

}
