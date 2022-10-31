package kodlama.io.devs.inMemoryDB;

import java.util.ArrayList;
import java.util.List;

import kodlama.io.devs.entities.concretes.Category;
import kodlama.io.devs.entities.concretes.Developer;
import kodlama.io.devs.entities.concretes.ProgrammingLanguage;

public class InMemoryDb {
	public List<ProgrammingLanguage> programmingLanguages = new ArrayList<ProgrammingLanguage>();
	{
		programmingLanguages.add(new ProgrammingLanguage(1, 0, "Java"));
		programmingLanguages.add(new ProgrammingLanguage(2, 0, "C#"));
		programmingLanguages.add(new ProgrammingLanguage(3, 0, "Phyton"));
		programmingLanguages.add(new ProgrammingLanguage(4, 0, "Angular"));
		programmingLanguages.add(new ProgrammingLanguage(5, 0, "Arduino"));
	}

	public List<Category> categories = new ArrayList<Category>();
	{
		categories.add(new Category(1, "Backend"));
		categories.add(new Category(2, "Web"));
		categories.add(new Category(3, "Elektronik"));
	}

	public List<Developer> developers = new ArrayList<Developer>();
	{
		developers.add(new Developer(1, "Murat", "ZEYBEK", "zeybekmurat@gmail.com", "0505"));
	}
}
