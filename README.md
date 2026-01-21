---

# User Management API

API REST desenvolvida com **Java e Spring Boot** para gerenciamento de usuários, seguindo boas práticas de **arquitetura em camadas**, **uso de DTOs** e **documentação com Swagger/OpenAPI**.

O projeto foi desenvolvido com foco em **backend Java** e serve como base para evolução futura, como autenticação, autorização e regras de negócio mais complexas.

---

## 📌 Funcionalidades

### 🔧 Operações Principais

* **Criar Usuário**: Cadastro de usuários via requisição HTTP
* **Listar Usuários**: Retorna todos os usuários cadastrados
* **Validação de Dados**: Validações de entrada com Jakarta Validation
* **Persistência**: Armazenamento de dados usando Spring Data JPA

### 🔍 Consultas Disponíveis

* **Listagem Geral**: Retorna usuários cadastrados no sistema
* **Status da API**: Endpoint simples para verificar se a API está ativa

---

## 📁 Estrutura do Projeto

```text
/user-management-api
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── Silent/
│   │   │           └── demo/
│   │   │               ├── controller/
│   │   │               │   └── UserController.java
│   │   │               │
│   │   │               ├── service/
│   │   │               │   └── UserService.java
│   │   │               │
│   │   │               ├── repository/
│   │   │               │   └── UserRepository.java
│   │   │               │
│   │   │               ├── dto/
│   │   │               │   ├── DtoRequest.java
│   │   │               │   └── DtoResponse.java
│   │   │               │
│   │   │               ├── model/
│   │   │               │   └── User.java
│   │   │               │
│   │   │               └── configuration/
│   │   │                   └── OpenApiConfiguration.java
│   │   │
│   │   └── resources/
│   │       └── application.properties
│   │
│   └── test/
│
└── pom.xml
```

---

## 🧩 Regras de Negócio

1. A API utiliza **DTOs** para entrada e saída de dados
2. Entidades JPA **não são expostas diretamente** ao cliente
3. O ID do usuário é gerado automaticamente pelo sistema
4. Campos de entrada passam por validação antes da persistência
5. Dados sensíveis (ex: senha) **não são retornados nas respostas**

---

## 📚 Padrões e Conceitos Utilizados

* DTO (Data Transfer Object)
* Arquitetura em camadas
* Injeção de dependência por construtor
* Spring Data JPA
* Hibernate ORM
* OpenAPI / Swagger
* Jakarta Validation

---

## ▶️ Como Executar

1. Clone o repositório
2. Abra o projeto em uma IDE compatível com Java
3. Execute a aplicação Spring Boot
4. Acesse a documentação da API em:

```
http://localhost:8080/swagger-ui.html
```

---

## 📖 Documentação da API

A API é documentada automaticamente com **Swagger (OpenAPI)**, permitindo:

* Visualizar todos os endpoints
* Ver exemplos de requisição e resposta
* Testar a API diretamente pelo navegador

---

## 💡 Observações Técnicas

* Arquitetura organizada para facilitar manutenção e evolução
* Uso de Streams para mapeamento Entity → DTO
* Código escrito com foco em legibilidade e boas práticas
* Projeto preparado para expansão com Spring Security

---


