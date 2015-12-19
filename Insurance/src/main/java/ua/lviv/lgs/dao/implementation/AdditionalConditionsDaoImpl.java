package ua.lviv.lgs.dao.implementation;

import java.util.List;

import javax.persistence.EntityManager;

import ua.lviv.lgs.dao.AdditionalConditionsDao;
import ua.lviv.lgs.entity.AdditionalConditions;

public class AdditionalConditionsDaoImpl implements AdditionalConditionsDao {
	private EntityManager em;

	public AdditionalConditionsDaoImpl(EntityManager em) {
		this.em = em;
	}
	public void saveAdditionalConditions(
			AdditionalConditions additionalConditions) {
		em.getTransaction().begin();
		em.persist(additionalConditions);
		em.getTransaction().commit();

	}

	public void removeAdditionalConditions(
			AdditionalConditions additionalConditions) {
		em.getTransaction().begin();
		em.remove(additionalConditions);
		em.getTransaction().commit();

	}

	public List<AdditionalConditions> findAllAdditionalConditions() {
		// TODO Auto-generated method stub
		return em.createNativeQuery("select from AdditionalConditions").getResultList();
	}

}
