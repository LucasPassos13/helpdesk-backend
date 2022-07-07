package com.lucas.helpdesk.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.lucas.helpdesk.domain.Chamado;
import com.lucas.helpdesk.domain.Cliente;
import com.lucas.helpdesk.domain.Tecnico;
import com.lucas.helpdesk.domain.enums.Perfil;
import com.lucas.helpdesk.domain.enums.Prioridade;
import com.lucas.helpdesk.domain.enums.Status;
import com.lucas.helpdesk.repositories.ChamadoRepository;
import com.lucas.helpdesk.repositories.ClienteRepository;
import com.lucas.helpdesk.repositories.TecnicoRepository;

@Service
public class DBService {
	
	@Autowired
	private TecnicoRepository tecnicoRepository;
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private ChamadoRepository chamadoRepository;
	@Autowired
	private BCryptPasswordEncoder encoder;
	
	
	public void instaciaDB() {
		Tecnico tec1 = new Tecnico(null, "Naruto Uzumaki", "79929366040", "naruto@mail.com", encoder.encode("1234"));
		tec1.addPerfil(Perfil.ADMIN);
		
		Tecnico tec2 = new Tecnico(null, "Kushina Uzumaki", "79952251050", "kushina@mail.com", encoder.encode("1234"));
		tec1.addPerfil(Perfil.ADMIN);
		
		Tecnico tec3 = new Tecnico(null, "Maito Gai", "18661645034", "gai@mail.com", encoder.encode("1234"));
		tec1.addPerfil(Perfil.ADMIN);
		
		
		Cliente cli1 = new Cliente(null, "Hinata Hyuga", "89898842091", "hinata@mail.com", encoder.encode("1234"));
		Cliente cli2 = new Cliente(null, "Minato Namekazi", "56694189052", "Minato@mail.com", encoder.encode("1234"));
		Cliente cli3 = new Cliente(null, "Kakashi Hatake", "17217118050", "Kakashi@mail.com", encoder.encode("1234"));
		
		Chamado c1 = new Chamado(null, Prioridade.MEDIA , Status.ANDAMENTO, "Chamado 01", "Primeiro chamado.", tec1, cli1);
		Chamado c2 = new Chamado(null, Prioridade.ALTA , Status.ANDAMENTO, "Chamado 02", "Segundo chamado.", tec2, cli2);
		Chamado c3 = new Chamado(null, Prioridade.ALTA , Status.ANDAMENTO, "Chamado 03", "Terceito chamado.", tec3, cli3);
		
		
		tecnicoRepository.saveAll(Arrays.asList(tec1,tec2,tec3));
		clienteRepository.saveAll(Arrays.asList(cli1,cli2,cli3));
		chamadoRepository.saveAll(Arrays.asList(c1,c2,c3));
	}
}
