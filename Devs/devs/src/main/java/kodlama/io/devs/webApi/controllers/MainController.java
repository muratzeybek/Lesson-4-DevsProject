package kodlama.io.devs.webApi.controllers;

import kodlama.io.devs.business.abstracts.ProgrammingLanguageService;
import kodlama.io.devs.business.concretes.ProgrammingLanguageManager;
import kodlama.io.devs.dataAccess.concretes.inMemory.InMemoryProgrammingLanguageRepository;
import kodlama.io.devs.entities.concretes.ProgrammingLanguage;

public class MainController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProgrammingLanguage language = new ProgrammingLanguage(1, 1, "Assembly");
		
		ProgrammingLanguageService languageService = new ProgrammingLanguageManager(new InMemoryProgrammingLanguageRepository());
		// languageService.delete(1);
		
		languageService.update(1, language);
		
	}
}
