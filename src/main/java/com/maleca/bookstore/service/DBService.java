package com.maleca.bookstore.service;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maleca.bookstore.domain.Categoria;
import com.maleca.bookstore.domain.Livro;
import com.maleca.bookstore.repositories.CategoriaRepository;
import com.maleca.bookstore.repositories.LivroRepository;

@Service
public class DBService {
	
	@Autowired
	CategoriaRepository categoriaRepository;
	
	@Autowired
	LivroRepository livroRepository;
	
	
	public void instanciaBaseDeDados() {
		Categoria cat1 = new Categoria(null, "Informatica", "Livro de TI");
		
		Livro l1 = new Livro (null,"Clean code", "Robert Martin", "Lorem ipsum", cat1);
		
		cat1.getLivros().addAll(Arrays.asList(l1));
		
		this.categoriaRepository.saveAll(Arrays.asList(cat1));
		
		this.livroRepository.saveAll(Arrays.asList(l1));
	}

}
