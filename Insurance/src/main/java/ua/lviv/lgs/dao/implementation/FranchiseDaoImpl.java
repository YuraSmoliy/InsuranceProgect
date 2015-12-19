package ua.lviv.lgs.dao.implementation;


import java.util.List;

import javax.persistence.EntityManager;

import ua.lviv.lgs.dao.FranchiseDao;
import ua.lviv.lgs.entity.Franchise;


public class FranchiseDaoImpl implements FranchiseDao {
	private EntityManager em;

	public FranchiseDaoImpl(EntityManager em) {
		super();
		this.em = em;
	}

	public void saveFranchise(Franchise franchise) {
		em.getTransaction().begin();
		em.persist(franchise);

		em.getTransaction().commit();

	}

	public void removeFranchise(Franchise franchise) {
		em.getTransaction().begin();
		em.remove(franchise);

		em.getTransaction().commit();

	}

	public List<Franchise> findAllFranchise() {
		return em.createNativeQuery("select from Franchise").getResultList();
	}

}
