package kodlama.io.devs.business.concretes;

import java.util.List;

import kodlama.io.devs.business.abstracts.CategoryService;
import kodlama.io.devs.dataAccess.abstracts.CategoryRepository;
import kodlama.io.devs.entities.concretes.Category;

public class CategoryManager implements CategoryService {

	private CategoryRepository categoryRepository;

	public CategoryManager(CategoryRepository categoryRepository) {
		this.categoryRepository = categoryRepository;
	}

	@Override
	public boolean add(Category category) {
		// business rulls
		return categoryRepository.add(category);
	}

	@Override
	public boolean update(int id, Category category) {
		// business rulls
		return categoryRepository.update(id, category);
	}

	@Override
	public boolean delete(int id) {
		// business rulls
		return categoryRepository.delete(id);
	}

	@Override
	public Category getCategoryById(int id) {
		// business rulls
		return categoryRepository.getCategoryById(id);
	}

	@Override
	public List<Category> getAllCategories() {
		// business rulls
		return categoryRepository.getAllCategories();
	}
	
}
