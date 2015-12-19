package ua.lviv.lgs.dao;

import java.util.List;

import ua.lviv.lgs.entity.AdditionalConditions;

public interface InsuranceAmount {
	void saveInsuranceAmount(InsuranceAmount insuranceAmount);

	void removeInsuranceAmount(InsuranceAmount insuranceAmount);

	List<InsuranceAmount> findAllInsuranceAmount();
}
