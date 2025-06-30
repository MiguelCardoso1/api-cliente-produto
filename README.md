# 📚 Clientes e Produtos API - Spring Boot

## 📌 Introdução

Este projeto consiste no desenvolvimento de uma **API RESTful em Java**, utilizando o framework **Spring Boot**, com foco no gerenciamento de **Clientes** e seus respectivos **Produtos**. Foram implementadas as operações básicas de **CRUD (Create, Read, Update, Delete)** para a entidade Cliente, incluindo o relacionamento entre Cliente e Produto (**um Cliente pode ter vários Produtos**).

A aplicação utiliza um **banco de dados H2 em memória**, o que facilita os testes e elimina a necessidade de configuração de um banco externo.

---

## 🚀 Tecnologias utilizadas

- Java
- Spring Boot
- Spring Data JPA
- Banco de Dados H2
- Maven
- Postman
- IntelliJ IDEA / VS Code
- Git

---

## 📡 Endpoints da API

| Método | URL | Descrição |
|------|-----|------|
| GET | `/clientes` | Listar todos os clientes |
| POST | `/clientes` | Cadastrar um novo cliente com produtos |
| GET | `/clientes/{id}` | Consultar um cliente específico por ID |
| PUT | `/clientes/{id}` | Atualizar um cliente e seus produtos |
| DELETE | `/clientes/{id}` | Deletar um cliente e seus produtos |

---

## 🗃️ Estrutura de Dados

### Cliente
- **id** (Long)
- **nome** (String)
- **produtos** (List\<Produto\>)

### Produto
- **id** (Long)
- **nome** (String)
- **preco** (Double)
- **cliente** (Cliente)

---

## 🛠️ Banco de Dados

- **Banco:** H2 (em memória)
- **Acesso ao H2 Console:**  
URL: `http://localhost:8080/h2-console`  
User: `sa`  
Password: *(em branco)*

---

## ✅ Status do projeto

Aplicação finalizada e funcionando.  
Possui endpoints funcionais para todas as operações CRUD básicas.

---
