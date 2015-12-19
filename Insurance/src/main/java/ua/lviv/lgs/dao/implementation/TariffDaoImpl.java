package ua.lviv.lgs.dao.implementation;

import java.util.List;

import javax.persistence.EntityManager;

import ua.lviv.lgs.dao.TariffDao;
import ua.lviv.lgs.entity.Tariff;

public class TariffDaoImpl implements TariffDao {
	private EntityManager em;

	public TariffDaoImpl(EntityManager em) {
		this.em = em;
	}
	public void saveTariff(Tariff tariff) {
		em.getTransaction().begin();
		em.persist(tariff);
		em.getTransaction().commit();

	}

	public void removeTariff(Tariff tariff) {
		em.getTransaction().begin();
		em.persist(tariff);
		em.getTransaction().commit();

	}

	public List<Tariff> findAllTariff() {
		// TODO Auto-generated method stub
		return em.createNativeQuery("select from Tariff").getResultList();
	}


}
