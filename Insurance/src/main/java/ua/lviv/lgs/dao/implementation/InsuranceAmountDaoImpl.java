package ua.lviv.lgs.dao.implementation;

import java.util.List;

import javax.persistence.EntityManager;

import ua.lviv.lgs.dao.InsuranceAmount;

public class InsuranceAmountDaoImpl implements InsuranceAmount {
	private EntityManager em;

	public InsuranceAmountDaoImpl(EntityManager em) {
		this.em = em;
	}
	public void saveInsuranceAmount(InsuranceAmount insuranceAmount) {
		em.getTransaction().begin();
		em.persist(insuranceAmount);
		em.getTransaction().commit();

	}

	public void removeInsuranceAmount(InsuranceAmount insuranceAmount) {
		em.getTransaction().begin();
		em.remove(insuranceAmount);
		em.getTransaction().commit();

	}

	public List<InsuranceAmount> findAllInsuranceAmount() {
		// TODO Auto-generated method stub
		 return em.createNativeQuery("select from InsuranceAmount").getResultList();
	}

}
