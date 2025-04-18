# 🛠️ API de Gerenciamento de Produtos

Este é um projeto de API RESTful para cadastro de produtos, desenvolvido como parte do meu aprendizado com Java e Spring Boot. A aplicação permite criar, buscar, atualizar e deletar produtos utilizando boas práticas como separação em camadas e uso de anotações Spring.

## 🔧 Tecnologias Utilizadas

- Java
- Spring Boot  
- Spring Web  
- Spring Data JPA  
- Banco H2  
- Maven  

## ✅ Funcionalidades

- Criar novo produto (`POST /produtos`)
- Buscar produto por ID (`GET /produtos/{id}`)
- Atualizar produto (`PUT /produtos/{id}`)
- Deletar produto (`DELETE /produtos/{id}`)
- Buscar produtos por nome (`GET /produtos?nome=...`)

## 🗂️ Estrutura do Projeto

- `controller`: camada responsável pelas requisições REST
- `model`: classe de domínio (Produto)
- `repository`: interface com o banco de dados (Spring Data JPA)
- `resources`: configurações como `application.yml` e script `data.sql`

## 🚀 Como Rodar

1. Clone o repositório:
```bash
git clone https://github.com/seu-usuario/seu-projeto.git
```
2. Abra no IntelliJ ou VS Code  
3. Rode a aplicação (`ProdutosApiApplication`)  
4. Acesse `http://localhost:8080/produtos`

## 💡 Aprendizados

- Uso de `@RestController`, `@RequestMapping`, `@PathVariable`, `@RequestParam`, `@RequestBody`
- Integração com banco H2 usando Spring Data JPA
- CRUD completo em API REST
- Boas práticas de organização em camadas

## 🧪 Testes

- Testes manuais via Postman  
- Impressão de logs no console para ver os dados recebidos

## 📌 Melhorias Futuras

- Adicionar Swagger para documentação  
- Adicionar testes unitários e de integração  
- Validação de campos com Bean Validation (`@NotNull`, etc.)  
- Adicionar autenticação com Spring Security  

## 👨‍💻 Autor

Matheus orzanqui – Estudante de Java com foco em Backend.  
Conecte-se comigo no LinkedIn
www.linkedin.com/in/matheus-orzanqui
