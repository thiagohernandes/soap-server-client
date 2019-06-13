# soap-server-client
SOAP and Client XML
## Server e Client
diretórios: everis-wsdl (server) e everis-wsdl-client (client)
## URL do WSDL
http://localhost:8080/service/pessoasWsdl.wsdl
## IMPORTANTE!
Primeiro: no everis-wsdl -> Maven Clean e Install -> será gerado os arquivos referente a configuração do envelope
Segundo: no everis-wsdl-client -> criar o diretório "wsdl" com o arquivo WSDL "pessoasWsdl.wsdl" e em seguida: Maven Clean e Install com a configuração (plugin) abaixo do Maven:

```
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
```

Após esses passos, os arquivos no client estarão prontos e poderá ser feito o acesso por URL com a configuração abaixo do plugin:

```
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
                    <schemaLanguage>WSDL</schemaLanguage>
                    <generatePackage>com.soap.wsdl.servico</generatePackage>
                    <schemas>
                        <schema>
                            <url>http://localhost:8080/service/pessoasWsdl.wsdl</url>
                        </schema>
                    </schemas>
                </configuration>
            </plugin>
```

