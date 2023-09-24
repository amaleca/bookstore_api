package com.maleca.bookstore.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maleca.bookstore.domain.Categoria;
import com.maleca.bookstore.exceptions.ObjectNotFoundException;
import com.maleca.bookstore.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repository;
	
	public Categoria findById(Integer id) {
		
		Optional <Categoria> obj = repository.findById(id);
		
		return obj.orElseThrow(() -> new ObjectNotFoundException (
				"Objecto nao encontrado! id: " + id + ", Tipo: "+ Categoria.class.getName()));
		
	}

}
