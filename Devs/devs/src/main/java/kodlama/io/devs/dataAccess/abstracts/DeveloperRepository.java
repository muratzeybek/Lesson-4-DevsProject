package kodlama.io.devs.dataAccess.abstracts;

import java.util.List;

import kodlama.io.devs.entities.concretes.Developer;

public interface DeveloperRepository {
	boolean add(Developer developer);
	boolean update(int id, Developer developer);
	boolean delete(int id);
	Developer getDeveloperById(int id);
	List<Developer> getAllDevelopers();
}
