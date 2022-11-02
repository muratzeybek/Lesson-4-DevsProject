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
		// ***** UPDATE OPERASYONUNU KONTROL ET TEKRAR *****
		db.programmingLanguages.forEach(p -> System.out.println(p.getLanguageName()));

		for (ProgrammingLanguage _programmingLanguage : db.programmingLanguages) {
			if (_programmingLanguage.getId() == id) {
				int index = db.programmingLanguages.indexOf(_programmingLanguage);
				db.programmingLanguages.set(index, programmingLanguage);
			}
		}
		db.programmingLanguages.forEach(p -> System.out.println(p.getId() + " - " + p.getLanguageName()));
		return true;
	}

	@Override
	public boolean delete(int id) {
		for (ProgrammingLanguage _programmingLanguage : db.programmingLanguages) {
			if (_programmingLanguage.getId() == id) {
				int index = db.programmingLanguages.indexOf(_programmingLanguage);
				db.programmingLanguages.remove(index);
				db.programmingLanguages.forEach(i -> System.out.println(i.getLanguageName()));
				return true;
			}
			result = false;
		}
		if (result == true) {
			return true;
		} else {
			System.out.println("Inmemory de bu ID ile kayıtlı dil yok...");
			return false;
		}
	}

	@Override
	public ProgrammingLanguage getProgrammingLanguageById(int id) {
		for (ProgrammingLanguage programmingLanguage : db.programmingLanguages) {
			if (programmingLanguage.getId() == id) {
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
