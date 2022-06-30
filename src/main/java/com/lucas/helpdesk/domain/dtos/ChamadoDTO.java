package com.lucas.helpdesk.domain.dtos;

import java.io.Serializable;
import java.time.LocalDate;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.lucas.helpdesk.domain.Chamado;

public class ChamadoDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate dataAbertura = LocalDate.now();
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate dataFechamento;
	@NotNull(message = "O Campo PRIORIDADE é requirido")
	private Integer prioridadeId;
	@NotNull(message = "O Campo STATUS é requirido")
	private Integer statusId;
	@NotNull(message = "O Campo TITULO é requirido")
	private String titulo;
	@NotNull(message = "O Campo OBSERVAÇÕES é requirido")
	private String observacoes;
	@NotNull(message = "O Campo TECNICO é requirido")
	private Integer tecnicoId;
	@NotNull(message = "O Campo CLIENTE é requirido")
	private Integer clienteId;
	private String nomeTecnico;
	private String nomeCliente;
	
	
	public ChamadoDTO() {
		super();
	}


	public ChamadoDTO(Chamado obj) {
		super();
		this.id = obj.getId();
		this.dataAbertura = obj.getDataAbertura();
		this.dataFechamento = obj.getDataFechamento();
		this.prioridadeId = obj.getPrioridade().getCodigo();
		this.statusId = obj.getStatus().getCodigo();
		this.titulo = obj.getTitulo();
		this.observacoes = obj.getObservacoes();
		this.tecnicoId = obj.getTecnico().getId();
		this.clienteId = obj.getCliente().getId();
		this.nomeTecnico = obj.getTecnico().getNome();
		this.nomeCliente = obj.getCliente().getNome();
		
		
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public LocalDate getDataAbertura() {
		return dataAbertura;
	}


	public void setDataAbertura(LocalDate dataAbertura) {
		this.dataAbertura = dataAbertura;
	}


	public LocalDate getDataFechamento() {
		return dataFechamento;
	}


	public void setDataFechamento(LocalDate dataFechamento) {
		this.dataFechamento = dataFechamento;
	}


	public Integer getPrioridadeId() {
		return prioridadeId;
	}


	public void setPrioridadeId(Integer prioridadeId) {
		this.prioridadeId = prioridadeId;
	}


	public Integer getStatusId() {
		return statusId;
	}


	public void setStatusId(Integer statusId) {
		this.statusId = statusId;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getObservacoes() {
		return observacoes;
	}


	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}


	public Integer getTecnicoId() {
		return tecnicoId;
	}


	public void setTecnicoId(Integer tecnicoId) {
		this.tecnicoId = tecnicoId;
	}


	public Integer getClienteId() {
		return clienteId;
	}


	public void setClienteId(Integer clienteId) {
		this.clienteId = clienteId;
	}


	public String getNomeTecnico() {
		return nomeTecnico;
	}


	public void setNomeTecnico(String nomeTecnico) {
		this.nomeTecnico = nomeTecnico;
	}


	public String getNomeCliente() {
		return nomeCliente;
	}


	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	
}
