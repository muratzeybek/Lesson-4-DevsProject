package kodlama.io.devs.dataAccess.abstracts;

import java.util.List;

import kodlama.io.devs.entities.concretes.Category;

public interface CategoryRepository {
	boolean add(Category category);
	boolean update(int id, Category category);
	boolean delete(int id);
	Category getCategoryById(int id);
	List<Category> getAllCategories();
}
