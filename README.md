# Sistema de Gerenciamento de Tarefas com Java Spring

Este é um projeto de exemplo que implementa um CRUD (Create, Read, Update, Delete) para gerenciamento de tarefas utilizando o framework Spring em Java. O sistema permite que os usuários realizem operações básicas de criação, leitura, atualização e exclusão de tarefas, proporcionando uma aplicação simples e funcional para o gerenciamento de suas atividades.

## Tecnologias Utilizadas

- Java
- Spring Framework
- Spring Boot
- Spring Data JPA
- Thymeleaf (para a camada de visualização)
- MySQL (ou outro banco de dados de sua escolha)

## Pré-requisitos

- JDK 8 ou superior
- Maven
- Um servidor MySQL em execução (ou outro banco de dados configurado no `application.properties`)

## Como Executar o Projeto

1. Clone este repositório: `git clone https://github.com/seu-usuario/seu-projeto.git`
2. Navegue até o diretório do projeto: `cd seu-projeto`
3. Execute o projeto usando o Maven: `mvn spring-boot:run`
4. Acesse a aplicação em [http://localhost:8080](http://localhost:8080)

Certifique-se de configurar corretamente as informações do banco de dados no arquivo `application.properties`.

## Endpoints da API

- **GET /tasks**: Retorna todas as tarefas cadastradas.
- **GET /tasks/{id}**: Retorna os detalhes de uma tarefa específica.
- **POST /tasks**: Cria uma nova tarefa.
- **PUT /tasks/{id}**: Atualiza os dados de uma tarefa existente.
- **DELETE /tasks/{id}**: Exclui uma tarefa.

## Contribuições

Contribuições são bem-vindas! Se você encontrar algum problema ou tiver sugestões para melhorar o projeto, sinta-se à vontade para abrir uma issue ou enviar um pull request.

## Licença

Este projeto está licenciado sob a [Licença MIT](LICENSE).
