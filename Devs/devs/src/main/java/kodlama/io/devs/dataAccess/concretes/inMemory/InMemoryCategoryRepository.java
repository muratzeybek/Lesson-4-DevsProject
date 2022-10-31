package kodlama.io.devs.dataAccess.concretes.inMemory;

import java.util.List;

import kodlama.io.devs.dataAccess.abstracts.CategoryRepository;
import kodlama.io.devs.entities.concretes.Category;
import kodlama.io.devs.entities.concretes.Developer;
import kodlama.io.devs.inMemoryDB.InMemoryDb;

public class InMemoryCategoryRepository implements CategoryRepository {

	private boolean result;

	@Override
	public boolean add(Category category) {
		result = new InMemoryDb().categories.add(category);
		if (result == true) {
			return true;
		}
		return false;
	}

	@Override
	public boolean update(int id, Category category) {
		Category c = new InMemoryDb().categories.get(id);
		c = new InMemoryDb().categories.set(id, category);
		if (c == category) {
			return true;
		}
		return false;
	}

	@Override
	public boolean delete(int id) {
		Category c = new InMemoryDb().categories.get(id);
		result = new InMemoryDb().categories.remove(c);
		if (result == true) {
			return true;
		}
		return false;
	}

	@Override
	public Category getCategoryById(int id) {
		return new InMemoryDb().categories.get(id);
	}

	@Override
	public List<Category> getAllCategories() {
		return new InMemoryDb().categories;
	}

}
