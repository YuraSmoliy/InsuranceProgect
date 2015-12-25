package ua.lviv.lgs.dao;

import java.util.List;

public interface InsuranceAmount {
	void saveInsuranceAmount(InsuranceAmount insuranceAmount);

	void removeInsuranceAmount(InsuranceAmount insuranceAmount);

	void updateInsuranceAmount(InsuranceAmount insuranceAmount);

	InsuranceAmount findInsuranceAmountById(int id);

	List<InsuranceAmount> findAllInsuranceAmount();
}
