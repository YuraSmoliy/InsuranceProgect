package ua.lviv.lgs.service;

import java.util.List;

import ua.lviv.lgs.entity.Franchise;

public interface FranchiseService {
	void saveFranchise(String franchise);

	void removeFranchise(String franchise);

	void updateFranchise(Franchise franchise);

	Franchise findFranchiseById(int id);

	List<Franchise> findAllFranchise();
}
