package ua.lviv.lgs.dao;

import java.util.List;

import ua.lviv.lgs.entity.AdditionalConditions;

public interface AdditionalConditionsDao {
	void saveAdditionalConditions(AdditionalConditions additionalConditions);

	void removeAdditionalConditions(AdditionalConditions additionalConditions);

	List<AdditionalConditions> findAllAdditionalConditions();
}
