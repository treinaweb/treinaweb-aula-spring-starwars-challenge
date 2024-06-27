# TreinaWeb Challenge: Star Wars API

Código desenvolvido durante a aula de Spring da [TreinaWeb](https://www.treinaweb.com.br/).

## Descrição

Esse projeto tem como objetivo resolver o desafio proposto pela empresa AmeDigital para a vaga de desenvolvedor backend.

O desafio pode ser encontrado [aqui](https://github.com/AmeDigital/challenge-back-end-hit).

## Preparação do ambiente de desenvolvimento

Para o acompanhamento da aula e execução do projeto, é necessário ter as seguintes ferramentas instaladas:

- [Java 21](https://www.oracle.com/java/technologies/javase/jdk21-archive-downloads.html)
- [Maven](https://maven.apache.org/download.cgi)
- [Visual Studio Code](https://code.visualstudio.com/)

As instruções de instalação podem ser encontradas no seguinte link [Preparação do ambiente de desenvolvimento](.github/SETUP.md).

## Material de Apoio

- [Documentação do Spring](https://spring.io/projects/spring-boot)
- [Documentação do Lombok](https://projectlombok.org/)
- [Documentação do Swagger](https://swagger.io/)
- [Documentação do projeto](./docs/)

## Checklist da aula

1. Criação e execução de um projeto Spring Boot
    - [ ] Criar um projeto Spring Boot com o [Spring Initializr](https://start.spring.io/)
    - [ ] Executar o projeto Spring Boot com o comando `mvn spring-boot:run`
2. Introdução ao Spring Boot
    - [ ] Criar um controller e uma action
    - [ ] Receber parâmetros via URL
    - [ ] Receber dados no corpo da requisição
3. Camada de persistência
    - [ ] Criar a classe `Planet`
    - [ ] Usar o Lombok para gerar os métodos de acesso
    - [ ] Criar a interface `PlanetRepository`
4. Rota de listagem de planetas
    - [ ] Criar o controller `PlanetController`
    - [ ] Criar a action `findAll`
5. Trabalhando com DTOs
    - [ ] Criar o record `PlanetResponse`
    - [ ] Usar o record `PlanetResponse` na action `findAll`
6. Rota de cadastro de planetas
    - [ ] Criar o record `PlanetRequest`
    - [ ] Criar a action `create`
7. Rota de busca de planetas por ID
    - [ ] Criar a action `findById`
    - [ ] Criar a exception `PlanetNotFoundException`
8. Tratamento de exceções
    - [ ] Criar a classe `ApiExceptionHandler`
    - [ ] Tratar a exceção `PlanetNotFoundException`
9. Rota de remoção de planetas
    - [ ] Criar a action `delete`
10. Busca de planetas por nome
    - [ ] Criar o método `findByNameContainingIgnoreCase` no `PlanetRepository`
    - [ ] Atualizar a action `findAll` para receber um parâmetro de busca
11. Integração com a API do Star Wars
    - [ ] Criar a interface `StarWarsApiService` com o OpenFeign
    - [ ] Criar os records `PaginationSwapi` e `PlanetSwapi`
    - [ ] Criar os métodos `searchPlanets` e `getPlanetNumberOfFilms`
    - [ ] Atualizar a action `create` para buscar a quantidade de filmes
