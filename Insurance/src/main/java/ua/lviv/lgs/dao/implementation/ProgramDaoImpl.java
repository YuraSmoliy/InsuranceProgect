package ua.lviv.lgs.dao.implementation;


import java.util.List;

import javax.persistence.EntityManager;

import ua.lviv.lgs.dao.ProgramDao;
import ua.lviv.lgs.entity.Program;

public class ProgramDaoImpl implements ProgramDao {
	private EntityManager em;

	public ProgramDaoImpl(EntityManager em) {
		super();
		this.em = em;
	}

	public void saveFranchise(Program program) {
		em.getTransaction().begin();
		em.persist(program);

		em.getTransaction().commit();

	}

	public void removeFranchise(Program program) {
		em.getTransaction().begin();
		em.remove(program);

		em.getTransaction().commit();

	}

	public List<Program> findAllProgram() {
		return em.createNativeQuery("select from Program").getResultList();
	}

}
