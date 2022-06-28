package com.lucas.helpdesk.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucas.helpdesk.domain.Tecnico;
import com.lucas.helpdesk.repositories.TecnicoRepository;
import com.lucas.helpdesk.services.excepetions.ObjectnotFoundException;

@Service
public class TecnicoService {
	
	@Autowired
	private TecnicoRepository repository;
	
	public Tecnico findById(Integer id) {
		Optional<Tecnico> obj = repository.findById(id);
		
		return obj.orElseThrow(() -> new ObjectnotFoundException("Obejto não encontrado! Id: " + id));
	}

	public List<Tecnico> findAll() {
		return repository.findAll();
	}
}
