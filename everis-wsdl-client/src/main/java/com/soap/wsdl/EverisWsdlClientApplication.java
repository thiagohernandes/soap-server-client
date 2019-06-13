package com.soap.wsdl;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.soap.wsdl.connector.SOAPConnector;
import com.soap.wsdl.schemas.pessoas.PessoaRequest;
import com.soap.wsdl.schemas.pessoas.PessoaResponse;

/* 
 * // http://localhost:8080/service/pessoasWsdl.wsdl
 * 	<plugin>
                <groupId>org.jvnet.jaxb2.maven2</groupId>
                <artifactId>maven-jaxb2-plugin</artifactId>
                <version>0.13.2</version>
                <executions>
                    <execution>
                        <goals>
                            <goal>generate</goal>
                        </goals>
                    </execution>
                </executions>
                <configuration>
                    <schemaLanguage>WSDL</schemaLanguage>
                    <generatePackage>com.soap.wsdl.servico</generatePackage>
                    <schemas>
                        <schema>
                            <url>http://localhost:8080/service/pessoasWsdl.wsdl</url>
                        </schema>
                    </schemas>
                </configuration>
            </plugin> 
			
			 <plugin>
				<groupId>org.jvnet.jaxb2.maven2</groupId>
				<artifactId>maven-jaxb2-plugin</artifactId>
				<version>0.13.2</version>
				<executions>
					<execution>
						<goals>
							<goal>generate</goal>
						</goals>
					</execution>
				</executions>
				<configuration>
					<generatePackage>com.soap.wsdl.schemas.pessoas</generatePackage>
					<generateDirectory>${project.basedir}/src/main/java</generateDirectory>
					<schemaDirectory>${project.basedir}/src/main/resources/wsdl</schemaDirectory>
					<schemaIncludes>
						<include>*.wsdl</include>
					</schemaIncludes>
				</configuration>
			</plugin>
 * */

@SpringBootApplication
public class EverisWsdlClientApplication {

	@Autowired
	SOAPConnector soapConnector;
	
	public static void main(String[] args) {
		SpringApplication.run(EverisWsdlClientApplication.class, args);
	}
	
	@PostConstruct
	public void init() {
		String name = "Filisbino";
		PessoaRequest request = new PessoaRequest();
		request.setNome(name);
		PessoaResponse response =(PessoaResponse) soapConnector.callWebService("http://localhost:8080/service/pessoas", request);
		System.out.println("=================== Response ====================== ");
		System.out.println("Nome : "+response.getPessoa().getNome());
	}

}
