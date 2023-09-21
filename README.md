# project-innovea-test
Teste de Homologação

Projeto de exemplo de "microsserviço" Spring Boot
Este é um exemplo de aplicativo Java/Maven/Spring Boot (versão 2.3.4) que pode ser usado como ponto de partida para a criação de um microsserviço completo com verificação de integridade integrada, métricas e muito mais. Espero que ajude você.

Como correr
Este aplicativo é empacotado como uma guerra que possui o Tomcat 8 incorporado. Nenhuma instalação do Tomcat ou JBoss é necessária. Você o executa usando o comando java -jar.

Clonar este repositório
Certifique-se de estar usando JDK 1.8 e Maven 3.x

### Request

`GET /article/`

    curl --location 'http://localhost:8080/article?q=tesla&from=2023-08-21&sortBy=publishedAt&apiKey=e6398b1e89db48539811b1f9cf9bff3a'
