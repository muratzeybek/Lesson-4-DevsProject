package kodlama.io.devs.dataAccess.concretes.inMemory;

import java.util.List;

import kodlama.io.devs.dataAccess.abstracts.DeveloperRepository;
import kodlama.io.devs.entities.concretes.Developer;
import kodlama.io.devs.inMemoryDB.InMemoryDb;

public class InMemoryDeveloperRepository implements DeveloperRepository {

	private boolean result;

	@Override
	public boolean add(Developer developer) {
		result = new InMemoryDb().developers.add(developer);
		if (result == true) {
			return true;
		}
		return false;
	}

	@Override
	public boolean update(int id, Developer developer) {
		Developer d = new InMemoryDb().developers.get(id);
		d = new InMemoryDb().developers.set(id, developer);
		if (d == developer) {
			return true;
		}
		return false;
	}

	@Override
	public boolean delete(int id) {
		Developer d = new InMemoryDb().developers.get(id);
		result = new InMemoryDb().developers.remove(d);
		if (result == true) {
			return true;
		}
		return false;
	}

	@Override
	public Developer getDeveloperById(int id) {
		return new InMemoryDb().developers.get(id);
	}

	@Override
	public List<Developer> getAllDevelopers() {
		return new InMemoryDb().developers;
	}

}
