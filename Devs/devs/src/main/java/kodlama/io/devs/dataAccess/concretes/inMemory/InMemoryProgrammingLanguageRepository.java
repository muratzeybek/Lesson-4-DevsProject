package kodlama.io.devs.dataAccess.concretes.inMemory;

import java.util.List;

import org.hibernate.validator.internal.properties.DefaultGetterPropertySelectionStrategy;
import org.springframework.stereotype.Repository;

import kodlama.io.devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.devs.entities.concretes.ProgrammingLanguage;
import kodlama.io.devs.inMemoryDB.InMemoryDb;

@Repository
public class InMemoryProgrammingLanguageRepository implements ProgrammingLanguageRepository {

	private boolean result;
	private InMemoryDb db = new InMemoryDb();
	
	@Override
	public boolean add(ProgrammingLanguage programmingLanguage) {
		result = db.programmingLanguages.add(programmingLanguage);
		if (result == true) {
			return true;
		}
		return false;
	}

	@Override
	public boolean update(int id, ProgrammingLanguage programmingLanguage) {
		
		ProgrammingLanguage language = getProgrammingLanguageById(id);
		db.programmingLanguages.indexOf(language);
		
		ProgrammingLanguage pl = new InMemoryDb().programmingLanguages.get(id);
		pl = new InMemoryDb().programmingLanguages.set(id, programmingLanguage);
		if (pl == programmingLanguage) {
			return true;
		}
		return false;
	}

	@Override
	public boolean delete(int id) {
		// liste indexini aldım ama düzelteceğim. 
		for (ProgrammingLanguage programmingLanguage : db.programmingLanguages) {
			int indeks = db.programmingLanguages.indexOf(programmingLanguage);
			if (programmingLanguage.getId()==id) {
				System.out.println(indeks);
				db.programmingLanguages.remove(indeks);
			}
		}
		if (result == true) {
			return true;
		}
		return false;
	}

	@Override
	public ProgrammingLanguage getProgrammingLanguageById(int id) {
		for (ProgrammingLanguage programmingLanguage : db.programmingLanguages) {
			if (programmingLanguage.getId()==id) {
				return programmingLanguage;
			}
		}
		return null;
	}

	@Override
	public List<ProgrammingLanguage> getAllPRogrammingLanguages() {
		return db.programmingLanguages;
	}
}
