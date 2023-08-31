package com.accenture.consumo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.accenture.consumo.interfaces.CepService;
import com.accenture.consumo.model.Endereco;
import com.accenture.consumo.repository.CepRepository;

@RestController
public class CepRestController {

    @Autowired
    private CepService cepService;

    @Autowired
    private CepRepository cepRepository;


	@GetMapping("/{cep}")
	public ResponseEntity<Endereco> getCep(@PathVariable String cep) {
		
		Endereco endereco = cepService.buscaEnderecoPorCep(cep);
		
		
    	cepRepository.save(endereco);
         
		return endereco != null ? 
		ResponseEntity.ok().body(endereco) : 
		ResponseEntity.notFound().build(); 
	}

}

