# 🍃 Workshop Spring Boot & JPA

[![Java](https://img.shields.io/badge/Java-17%2B-orange)](https://www.oracle.com/java/)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-brightgreen)](https://spring.io/projects/spring-boot)
[![License](https://img.shields.io/badge/License-MIT-blue.svg)](https://opensource.org/licenses/MIT)

Este projeto é uma **API REST** completa desenvolvida durante um workshop focado em **Spring Boot** e **Java Persistence API (JPA)** com Hibernate. O objetivo principal é demonstrar o mapeamento de um modelo de domínio complexo e a implementação de uma arquitetura em camadas.

---

## 🚀 Tecnologias e Ferramentas

* **Linguagem:** Java 17
* **Framework:** Spring Boot 3
* **Persistência:** Spring Data JPA / Hibernate
* **Banco de Dados:** * H2 Database (Desenvolvimento/Testes)
    * PostgreSQL (Produção)
* **Gerenciamento de Dependências:** Maven

---

## 📋 Sobre a Aplicação

A aplicação gerencia um sistema de pedidos simples, mas com associações ricas entre entidades, cobrindo os seguintes recursos:

* **Usuários:** Cadastro de clientes (Nome, Email, Telefone, Senha).
* **Pedidos:** Registro de compras associadas a um cliente.
* **Produtos & Categorias:** Catálogo de itens com relação muitos-para-muitos.
* **Itens de Pedido:** Detalhamento de cada item comprado (quantidade e preço no momento da venda).
* **Pagamento:** Registro de pagamento associado ao pedido (relação um-para-um).

### 🏗️ Arquitetura do Projeto

O projeto segue o padrão de **Camadas da Engenharia de Software**:

1.  **Resource (Controller):** Controla os endpoints REST.
2.  **Service:** Contém a lógica de negócio e regras da aplicação.
3.  **Repository:** Interface de comunicação com o banco de dados.
4.  **Domain (Entities):** Modelagem das tabelas e relacionamentos.

---

## 🛣️ Endpoints Principais

| Método | Endpoint | Descrição |
| :--- | :--- | :--- |
| `GET` | `/users` | Lista todos os usuários |
| `GET` | `/users/{id}` | Busca um usuário por ID |
| `GET` | `/orders` | Lista todos os pedidos |
| `GET` | `/products` | Lista todos os produtos |
| `GET` | `/categories` | Lista todas as categorias |

---

## 🔧 Como Rodar o Projeto

1.  **Clone o repositório:**
    ```bash
    git clone [https://github.com/anaClarissi/workshop-springboot-jpa.git](https://github.com/anaClarissi/workshop-springboot-jpa.git)
    ```

2.  **Importe o projeto:**
    Abra sua IDE (IntelliJ ou Eclipse) e importe como um projeto **Maven**.

3.  **Execute a aplicação:**
    Rode a classe principal `WorkshopSpringbootJpaApplication.java`.

4.  **Acesse o Console H2:**
    Com a aplicação rodando, acesse `http://localhost:8080/h2-console` para ver o banco de dados em memória.
    * **JDBC URL:** `jdbc:h2:mem:testdb`
    * **User:** `sa`

---

## 🛡️ Tratamento de Exceções

A API possui um manipulador de erros customizado para retornar respostas HTTP adequadas:
* **404 Not Found:** Quando um recurso não é encontrado por ID.
* **400 Bad Request:** Para erros de violação de integridade de dados (ex: deletar um usuário que possui pedidos).

---

## 👤 Autora

Desenvolvido por **Ana Clarissi** [GitHub](https://github.com/anaClarissi) | [LinkedIn](https://www.linkedin.com/in/anaclarissi)

---
> *Este projeto foi desenvolvido com fins didáticos para estudo de Spring Boot.*