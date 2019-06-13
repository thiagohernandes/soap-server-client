package com.soap.wsdl.repository;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import com.everis.xml.pessoas.Pessoa;

@Component
public class PessoaRepository {
	private static final Map<String, Pessoa> pessoas = new HashMap<>();

	@PostConstruct
	public void initData() {
		
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setCodigo(1);
		pessoa1.setNome("Beltrano");
		pessoas.put(pessoa1.getNome(), pessoa1);
		
		Pessoa pessoa2 = new Pessoa();
		pessoa2.setCodigo(122);
		pessoa2.setNome("Ciclano");
		pessoas.put(pessoa2.getNome(), pessoa2);
		
		Pessoa pessoa3 = new Pessoa();
		pessoa3.setCodigo(440);
		pessoa3.setNome("Filisbino");
		pessoas.put(pessoa3.getNome(), pessoa3);
		
		
	}

	public Pessoa findEstudante(String name) {
		return pessoas.get(name);
	}
}