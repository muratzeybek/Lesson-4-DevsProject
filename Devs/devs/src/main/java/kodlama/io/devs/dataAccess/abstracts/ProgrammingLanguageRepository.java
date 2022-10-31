package kodlama.io.devs.dataAccess.abstracts;

import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.devs.entities.concretes.ProgrammingLanguage;

public interface ProgrammingLanguageRepository {
	boolean add(ProgrammingLanguage programmingLanguage);
	boolean update(int id, ProgrammingLanguage programmingLanguage);
	boolean delete(int id);
	ProgrammingLanguage getProgrammingLanguageById(int id);
	List<ProgrammingLanguage> getAllPRogrammingLanguages();
}
