<div  align="center">
    <img width="400"
        alt="Spring Logo"
        src="https://fiverr-res.cloudinary.com/images/t_main1,q_auto,f_auto,q_auto,f_auto/gigs/276374559/original/ce487077a1a2eafcdf50c6cb942e98b5add18def/develop-java-spring-boot-rest-apis-application.png"
      />
    <h1> API REST com Spring Boot </h1>
</div>

## Objetivo

Este curso tem como objetivo capacitar os alunos no desenvolvimento de APIs REST profissionais utilizando o ecossistema Spring Boot. Ao final do curso, os participantes serão capazes de:

- **Compreender os fundamentos** de APIs REST e os princípios de arquitetura RESTful
- **Desenvolver aplicações** robustas e escaláveis com Spring Boot
- **Implementar operações CRUD** completas utilizando Spring Data JPA
- **Integrar bancos de dados** relacionais (PostgreSQL, MySQL) em aplicações Spring
- **Aplicar boas práticas** de desenvolvimento, incluindo tratamento de exceções, validações e padronização de respostas
- **Implementar segurança** em APIs utilizando Spring Security e autenticação JWT
- **Documentar APIs** de forma profissional utilizando Swagger/OpenAPI
- **Testar aplicações** com JUnit e Mockito para garantir qualidade e confiabilidade
- **Gerenciar relacionamentos** entre entidades (One-to-One, One-to-Many, Many-to-Many)
- **Aplicar padrões de projeto** como DTO, Service Layer e Repository Pattern

O curso aborda desde conceitos fundamentais até técnicas avançadas, preparando os alunos para o mercado de trabalho no desenvolvimento de aplicações backend modernas.

## Metodologia

O curso adota uma abordagem **progressiva e prática**, partindo do básico ao avançado de maneira cuidadosa e completa. A metodologia inclui:

### Estrutura de Aprendizado

- **Aulas Objetivas**: Cada tópico é apresentado de forma clara e direta, focando nos conceitos essenciais e sua aplicação prática
- **Progressão Gradual**: O conteúdo evolui naturalmente, desde fundamentos até técnicas avançadas, garantindo solidez no aprendizado
- **Aprendizado Incremental**: Conceitos são construídos de forma progressiva, com cada novo tópico baseando-se nos anteriores

### Organização do Repositório

O processo de aquisição dos conhecimentos deve ser realizado a partir do estudo de cada branch existente neste repositório:

- **Branches Temáticas**: Cada branch representa um conjunto específico de conceitos e práticas
- **Código Evolutivo**: O código é desenvolvido e refatorado progressivamente, demonstrando a evolução das melhores práticas
- **Exemplos Práticos**: Todos os conceitos são acompanhados de implementações funcionais e exemplos reais

### Formato das Aulas

- **Teoria + Prática**: Combinação equilibrada de explicações conceituais e implementação hands-on
- **Exercícios de Fixação**: Atividades práticas para consolidar o aprendizado de cada tópico
- **Trabalhos Práticos**: Projetos mais abrangentes que integram múltiplos conceitos
- **Código Comentado**: Implementações detalhadamente documentadas para facilitar a compreensão

### Acompanhamento

- Cada conteúdo pode ser estudado de forma independente através de sua respectiva branch
- Os alunos devem seguir a ordem sugerida na agenda para melhor aproveitamento
- Recomenda-se prática constante e experimentação com o código fornecido

## Agenda

O curso está organizado em 20 conteúdos progressivos, divididos em dois bimestres, cobrindo desde os fundamentos até conceitos intermediários de desenvolvimento de APIs REST com Spring Boot.

### 1º Bimestre - Fundamentos e Operações Básicas

<a href="https://github.com/placidoneto/spring-boot-lecture/tree/conteudo01-introducao-spring-boot">**Conteúdo 1: Introdução ao Spring Boot e Configuração do Ambiente**</a>

- Instalação do Java JDK e Maven/Gradle
- Criação de projeto Spring Boot com Spring Initializr
- Estrutura de um projeto Spring Boot
- Primeira aplicação "Hello World"

**Conteúdo 2: Fundamentos de APIs REST**
- Conceitos de arquitetura REST
- Protocolo HTTP e métodos (GET, POST, PUT, DELETE, PATCH)
- Status Codes e boas práticas
- Ferramentas de teste: Postman e Thunder Client

**Conteúdo 3: Controllers e Mapeamento de Requisições**
- Anotações @RestController e @RequestMapping
- Métodos HTTP com @GetMapping, @PostMapping, @PutMapping, @DeleteMapping
- Parâmetros de requisição: @PathVariable, @RequestParam, @RequestBody
- Retorno de dados em JSON

**Conteúdo 4: Configuração de Banco de Dados**
- Integração com PostgreSQL e MySQL
- Configuração do application.properties
- Dependências Spring Data JPA e drivers JDBC
- Criação automática de tabelas com Hibernate

**Conteúdo 5: JPA e Entidades**
- Mapeamento objeto-relacional (ORM)
- Anotações @Entity, @Table, @Id, @GeneratedValue
- Tipos de dados e @Column
- Estratégias de geração de ID

**Conteúdo 6: Spring Data JPA e Repositories**
- Interface JpaRepository
- Métodos padrão do CRUD
- Query Methods e convenções de nomenclatura
- Métodos personalizados com @Query

**Conteúdo 7: Implementação CRUD Completo**
- Criação de recursos (POST)
- Listagem de recursos (GET all)
- Busca por ID (GET by id)
- Atualização de recursos (PUT)
- Remoção de recursos (DELETE)

**Conteúdo 8: Service Layer e Arquitetura em Camadas**
- Padrão de arquitetura em camadas
- Separação de responsabilidades
- Anotação @Service
- Injeção de dependências com @Autowired

**Conteúdo 9: DTOs (Data Transfer Objects)**
- Conceito e importância dos DTOs
- Criação de classes DTO
- Conversão entre Entity e DTO
- Biblioteca ModelMapper

**Conteúdo 10: Validação de Dados**
- Bean Validation API
- Anotações de validação: @NotNull, @NotEmpty, @Size, @Email, @Min, @Max
- @Valid e @Validated
- Mensagens de validação personalizadas

### 2º Bimestre - Conceitos Intermediários e Avançados

**Conteúdo 11: Tratamento de Exceções**
- Exception Handler com @ExceptionHandler
- @ControllerAdvice para tratamento global
- Criação de exceções customizadas
- Padronização de respostas de erro

**Conteúdo 12: Relacionamentos entre Entidades (Parte 1)**
- Relacionamento One-to-One (@OneToOne)
- Relacionamento One-to-Many (@OneToMany)
- Cascading e FetchType (LAZY vs EAGER)
- Tratamento de JSON infinito com @JsonIgnore

**Conteúdo 13: Relacionamentos entre Entidades (Parte 2)**
- Relacionamento Many-to-Many (@ManyToMany)
- Tabelas de junção customizadas
- Relacionamentos bidirecionais
- Mapeamento avançado com @JoinColumn e @JoinTable

**Conteúdo 14: Paginação e Ordenação**
- Interface Pageable
- Parâmetros page, size e sort
- Retorno de dados paginados com Page<T>
- Customização de consultas paginadas

**Conteúdo 15: Filtros e Buscas Avançadas**
- Query Parameters para filtros
- Specification API do Spring Data JPA
- Criteria API para consultas dinâmicas
- Buscas com múltiplos critérios

**Conteúdo 16: Documentação com Swagger/OpenAPI**
- Integração do SpringDoc OpenAPI
- Anotações para documentação
- Customização da interface Swagger UI
- Documentação de schemas e responses

**Conteúdo 17: Spring Security - Fundamentos**
- Conceitos de autenticação e autorização
- Configuração básica do Spring Security
- Autenticação em memória
- Proteção de endpoints

**Conteúdo 18: Autenticação JWT (JSON Web Token)**
- Conceitos de JWT
- Geração e validação de tokens
- Implementação de login e registro
- Configuração de filtros de autenticação

**Conteúdo 19: Autorização e Controle de Acesso**
- Roles e Authorities
- Anotações @PreAuthorize e @Secured
- Controle de acesso baseado em perfis
- Restrição de endpoints por permissão

**Conteúdo 20: Testes Unitários e de Integração**
- JUnit 5 e Mockito
- Testes de Controllers com MockMvc
- Testes de Services e Repositories
- @SpringBootTest e @WebMvcTest
- Cobertura de testes


