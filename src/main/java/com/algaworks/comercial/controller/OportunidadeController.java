package com.algaworks.comercial.controller;


import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.comercial.model.Oportunidade;

@RestController
@RequestMapping("/oportunidades")
public class OportunidadeController {

	@GetMapping
	public List<Oportunidade> Listar() {
		Oportunidade op = new Oportunidade();
		op.setId(1);
		op.setNomeProspecto("Thalyson");
		op.setDescricao("sociedade em um negócio de aluguel de carros");
		op.setValor(new BigDecimal(40000));
		return Arrays.asList(op);
	}
}
