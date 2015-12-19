package ua.lviv.lgs.dao.implementation;


import java.util.List;

import javax.persistence.EntityManager;

import ua.lviv.lgs.dao.ZoneDao;
import ua.lviv.lgs.entity.Zone;

public class ZoneDaoImpl implements ZoneDao {
	private EntityManager em;

	public ZoneDaoImpl(EntityManager em) {
		super();
		this.em = em;
	}

	public void saveFranchise(Zone zone) {
		em.getTransaction().begin();
		em.persist(zone);

		em.getTransaction().commit();

	}

	public void removeFranchise(Zone zone) {
		em.getTransaction().begin();
		em.remove(zone);

		em.getTransaction().commit();

	}

	public List<Zone> findAllZone() {
		return em.createNativeQuery("select from Zone").getResultList();
	}

}
