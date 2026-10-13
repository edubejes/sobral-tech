# Sobral Tech - API REST (Trabalho Prático)

Este é o repositório do meu projeto académico para a disciplina de Desenvolvimento Web Back-End. Desenvolvi uma API REST para uma loja fictícia de equipamentos e periféricos de informática (Sobral Tech), que permite gerir o registo de clientes, produtos e pedidos.

### 🛠️ Tecnologias e Arquitetura
* **Linguagem & Frameworks:** Java 17, Spring Boot e Spring Data JPA.
* **Base de Dados:** Optei pelo H2 Database. Como é um banco relacional que permite execução local e armazenamento em ficheiro, facilitou muito o desenvolvimento e os testes do projeto, cumprindo perfeitamente as exigências do enunciado.
* **Arquitetura:** O projeto foi estruturado no padrão MVC, com pacotes separados para `model` (entidades Cliente, Produto e Pedido), `repository` e `controller`.

### ⚙️ Como executar o projeto localmente
1. Clone este repositório e abra a pasta do projeto na sua IDE de preferência.
2. Aguarde que o Maven descarregue as dependências.
3. Execute a classe principal da aplicação.
4. A API ficará disponível em `http://localhost:8080`.
5. Os dados do banco H2 serão guardados localmente na pasta `data`.

### 📡 Endpoints da API
Implementei os métodos HTTP para todos os recursos principais. Os endpoints disponíveis para `/clientes`, `/produtos` e `/pedidos` são:
* `POST` — Criar um novo registo
* `GET` — Listar todos os registos
* `GET /{id}` — Buscar um registo específico pelo ID
* `PUT /{id}` — Atualizar dados
* `DELETE /{id}` — Excluir um registo (retorna o status `204 No Content`)

### 🧪 Testes no Postman (Exemplos de Uso)
Para testar os endpoints `POST`, é necessário enviar os dados em formato JSON (utilizando o cabeçalho `Content-Type: application/json`). 

Abaixo deixo os exemplos reais que utilizei para testar a aplicação durante o desenvolvimento:

**1. Cadastrar Cliente (POST /clientes)**
```json
{
  "nome": "Eduardo Bejes Sobral RU:4883485"
}
```

**2. Cadastrar Produto (POST /produtos)**
```json
{
  "nome": "Teclado Mecânico Redragon",
  "preco": 250.00,
  "estoque": true
}
```

**3. Registar Pedido (POST /pedidos)**
*Nota: A API valida automaticamente se os IDs do cliente e do produto existem na base de dados antes de confirmar o pedido.*
```json
{
  "clienteId": 1,
  "produtoId": 1,
  "quantidade": 2
}
```

### 🗄️ Acesso à Base de Dados (H2 Console)
Para verificar as tabelas e os dados guardados enquanto a aplicação está a correr:
1. Aceda a: `http://localhost:8080/h2-console`
2. **JDBC URL:** `jdbc:h2:file:./data/baozidb;AUTO_SERVER=TRUE` (ou conforme configurado no application.properties)
3. **User Name:** `sa`
4. **Password:** *(deixar em branco)*
