package com.nelioalves.cursomc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

import com.nelioalves.cursomc.domain.Categoria;
import com.nelioalves.cursomc.repositories.CategoriaRepository;

@SpringBootApplication
public class CursomcApplication  extends SpringBootServletInitializer implements CommandLineRunner {
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(CursomcApplication.class);
    }
	
	private static Class<CursomcApplication> applicationClass = CursomcApplication.class;
	
	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Categoria c1 = categoriaRepository.findOne(1);
		System.out.println(c1.getNome());
	}	
}
