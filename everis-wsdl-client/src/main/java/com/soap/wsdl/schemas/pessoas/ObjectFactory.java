//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.11 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2019.06.13 às 05:20:07 PM BRT 
//


package com.soap.wsdl.schemas.pessoas;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.soap.wsdl.schemas.pessoas package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.soap.wsdl.schemas.pessoas
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PessoaRequest }
     * 
     */
    public PessoaRequest createPessoaRequest() {
        return new PessoaRequest();
    }

    /**
     * Create an instance of {@link PessoaResponse }
     * 
     */
    public PessoaResponse createPessoaResponse() {
        return new PessoaResponse();
    }

    /**
     * Create an instance of {@link Pessoa }
     * 
     */
    public Pessoa createPessoa() {
        return new Pessoa();
    }

}
