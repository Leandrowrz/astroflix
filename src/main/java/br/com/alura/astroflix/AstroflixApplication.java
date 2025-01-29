package br.com.alura.astroflix;

import br.com.alura.astroflix.principal.Principal;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AstroflixApplication  implements CommandLineRunner {


	public static void main(String[] args) {
		SpringApplication.run(AstroflixApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal();
		principal.exibeMenu();

	}
}
