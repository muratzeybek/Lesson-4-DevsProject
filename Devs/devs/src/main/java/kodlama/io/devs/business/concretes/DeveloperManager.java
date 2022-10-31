package kodlama.io.devs.business.concretes;

import java.util.List;

import kodlama.io.devs.business.abstracts.DeveloperService;
import kodlama.io.devs.dataAccess.abstracts.DeveloperRepository;
import kodlama.io.devs.entities.concretes.Developer;

public class DeveloperManager implements DeveloperService {

	private DeveloperRepository developerRepository;
	
	public DeveloperManager(DeveloperRepository developerRepository) {
		this.developerRepository = developerRepository;
	}

	@Override
	public boolean add(Developer developer) {
		// business rulls
		return developerRepository.add(developer);
	}

	@Override
	public boolean update(int id, Developer developer) {
		// business rulls
		return developerRepository.update(id, developer);
	}

	@Override
	public boolean delete(int id) {
		// business rulls
		return developerRepository.delete(id);
	}

	@Override
	public Developer getDeveloperById(int id) {
		// business rulls
		return developerRepository.getDeveloperById(id);
	}

	@Override
	public List<Developer> getAllDevelopers() {
		// business rulls
		return developerRepository.getAllDevelopers();
	}

}
