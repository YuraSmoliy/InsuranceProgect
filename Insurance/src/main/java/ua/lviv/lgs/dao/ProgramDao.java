package ua.lviv.lgs.dao;


import java.util.List;



import ua.lviv.lgs.entity.Program;

public interface ProgramDao {

	void saveFranchise(Program program);

	void removeFranchise(Program program);

	List<Program> findAllProgram();
	
}
