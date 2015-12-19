package ua.lviv.lgs.dao;


import java.util.List;

import ua.lviv.lgs.entity.Zone;



public interface ZoneDao {
	void saveFranchise(Zone zone);

	void removeFranchise(Zone zone);

	List<Zone> findAllZone();
}
