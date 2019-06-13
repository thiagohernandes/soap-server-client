package com.soap.wsdl.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.everis.xml.pessoas.PessoaRequest;
import com.everis.xml.pessoas.PessoaResponse;
import com.soap.wsdl.repository.PessoaRepository;

@Endpoint
public class PessoaEndpoint {
	private static final String NAMESPACE_URI = "http://www.everis.com/xml/pessoas";

	private PessoaRepository PessoaRepository;

	@Autowired
	public PessoaEndpoint(PessoaRepository PessoaRepository) {
		this.PessoaRepository = PessoaRepository;
	}

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "PessoaRequest")
	@ResponsePayload
	public PessoaResponse getStudent(@RequestPayload PessoaRequest request) {
		PessoaResponse response = new PessoaResponse();
		response.setPessoa(PessoaRepository.findEstudante(request.getNome()));

		return response;
	}
}