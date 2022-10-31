package kodlama.io.devs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.devs.business.abstracts.ProgrammingLanguageService;
import kodlama.io.devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.devs.entities.concretes.ProgrammingLanguage;

@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService {

	ProgrammingLanguageRepository programmingLanguageRepository;

	
	public ProgrammingLanguageManager(ProgrammingLanguageRepository programmingLanguageRepository) {
		this.programmingLanguageRepository = programmingLanguageRepository;
	}

	@Override
	public boolean add(ProgrammingLanguage programmingLanguage) {
		if (programmingLanguage.getLanguageName() == null) {
			return false;
		} else {
			// List<ProgrammingLanguage> programmingLanguages = programmingLanguageRepository.getAllPgogrammLanguages();
			// alt satır refactor denemesi :D
			for (ProgrammingLanguage _programmingLanguage : programmingLanguageRepository.getAllPRogrammingLanguages()) {
				if (_programmingLanguage.getLanguageName().equals(programmingLanguage.getLanguageName())) {
					return false;
				}
			}
		}
		return programmingLanguageRepository.add(programmingLanguage);
	}

	@Override
	public boolean update(int id, ProgrammingLanguage programmingLanguage) {
		// business rulls
		return programmingLanguageRepository.update(id, programmingLanguage);
	}

	@Override
	public boolean delete(int id) {
		// business rulls
		return programmingLanguageRepository.delete(id);
	}

	@Override
	public ProgrammingLanguage getProgrammingLanguageById(int id) {
		// business rulls
		return programmingLanguageRepository.getProgrammingLanguageById(id);
	}

	@Override
	public List<ProgrammingLanguage> getAllPRogrammingLanguages() {
		// business rulls
		return programmingLanguageRepository.getAllPRogrammingLanguages();
	}
}
