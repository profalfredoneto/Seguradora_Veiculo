## GERENCIAMENTO FINANCEIRO

### TECNOLOGIAS UTILIZADAS
* Java 8
* Spring boot 2.1.5
* Spring Data
* Lombok
* Maven
* Mysql
* H2
* JUnit
* Mockito
* Docker
* Swagger


#### PRÉ REQUISITOS
- Baixar código fonte do repositório Git;
- Ter o Docker instalado na máquina;
- Ter o Maven instalado na máquina


### CONFIGURAÇÃO DO BANCO DE DADOS
#### BUILD DOCKERFILE 
Na raiz do projeto, onde se encontra o arquivo Dockerfile, abra o terminal e execute o seguinte comando: <br>
* docker build -t gerenciamento-financeiro/mysql .

Este comando irá realizar o download da imagem do Mysql e irá configurar o banco de dados da aplicação, 
criando a database 'gerenciamento-financeiro' e suas respectivas tabelas a serem utilizadas no projeto. 

Após ter criado a imagem, rode o comando a baixo para criar o container docker.
* docker run --name bd -p 3306:3306 -d gerenciamento-financeiro/mysql

Caso queira conferir se o container estar rodando, e se o banco de dados foi criado corretamente, basta executar os 
comandos a baixo:
 
* sudo docker exec -it bd /bin/bash
* mysql -u root -p
* show databases;


### EXECUTAR APLICAÇÃO
## 1º OPÇÃO
Na raiz do projeto, onde se encontra o arquivo pom.xml, rode o seguinte comando:
* mvn clean install

O comando deverá baixar as dependencias necessárias para a aplicação. Feito isso, execute também o seguinte comando para 
subir a aplicação:
* mvn spring-boot:run

O maven subirá a aplicação na porta 8080.

## 2º OPÇÃO
Uma outra opção para subir a aplicação, é rodar o seguinte comando dentro da pasta /target
* java -jar gerenciamentoFinanceiro-0.0.1-SNAPSHOT.jar


### EXECUTAR TESTES DE INTEGRAÇÃO / UNITÁRIOS
Na raiz do projeto, onde se encontra o arquivo pom.xml, rode o seguinte comando:
* mvn test

O comando deverá executar os testes unitários, assim como os testes de integração.


### DOCUMENTAÇÃO DAS APIS
Para acessar a documentação a aplicação deverá estar no ar. Todas APIs estão documentadas, e podem ser acessadas na 
seguinte URL:
 * <a href="http://localhost:8080/rest/swagger-ui.html#/">http://localhost:8080/rest/swagger-ui.html#//</a>
