package kodlama.io.devs.entities.concretes;

import kodlama.io.devs.entities.abstracts.Entity;

public class ProgrammingLanguage implements Entity {
	private int id;
	private int categoryId;
	private String languageName;
	
	public ProgrammingLanguage() {}

	public ProgrammingLanguage(int id, int categoryId, String languageName) {
		this.id = id;
		this.categoryId = categoryId;
		this.languageName = languageName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getLanguageName() {
		return languageName;
	}

	public void setLanguageName(String languageName) {
		this.languageName = languageName;
	}
	
	
}
