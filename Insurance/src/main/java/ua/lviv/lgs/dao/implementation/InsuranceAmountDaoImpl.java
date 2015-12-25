package ua.lviv.lgs.dao.implementation;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ua.lviv.lgs.dao.InsuranceAmount;

@Repository
public class InsuranceAmountDaoImpl implements InsuranceAmount {
	@PersistenceContext(unitName = "Primary")
	private EntityManager em;

	@Transactional
	public void saveInsuranceAmount(InsuranceAmount insuranceAmount) {
		em.persist(insuranceAmount);
	}

	@Transactional
	public void removeInsuranceAmount(InsuranceAmount insuranceAmount) {
		em.remove(insuranceAmount);
	}

	@Transactional
	public List<InsuranceAmount> findAllInsuranceAmount() {

		return em.createQuery("from InsuranceAmount", InsuranceAmount.class).getResultList();
	}

	@Transactional
	public void updateInsuranceAmount(InsuranceAmount insuranceAmount) {
		em.merge(insuranceAmount);

	}

	@Transactional
	public InsuranceAmount findInsuranceAmountById(int id) {
		return em.createQuery("from InsuranceAmount where id like :id", InsuranceAmount.class).setParameter("id", id)
				.getSingleResult();
	}

}
