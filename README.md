# 🛠️ API REST com Spring Boot
##Integrantes
-Matheus Augusto RM: 551466
-Rodrigo Viana RM: 551057
-Caique Chagas RM: 551943

Este projeto é uma API REST desenvolvida com **Spring Boot**, utilizada para demonstrar conceitos de **CRUD (Create, Read, Update, Delete)**, persistência de dados com **Spring Data JPA** e carregamento inicial de dados via **DataLoader**

## 📌 **Tecnologias Utilizadas**
- Java 17+
- Spring Boot
- Spring Data JPA
- Banco de dados H2 (em memória)
- Maven
- Postman (para testes de API)

Criar aplicação Java Spring Boot
Spring Initialzr é utilizado para criar projetos com Sprint Boot


![spring_initializar_setup](https://github.com/user-attachments/assets/146bdeae-8983-47e6-9e37-29245e48baa0)

<img width="480" alt="spring_initializar_web_spring" src="https://github.com/user-attachments/assets/648b242a-0f9d-4426-baef-e08565ca501b" />

---

## 🚀 **Como Rodar o Projeto Localmente**
### **1️⃣ Clonar o Repositório**

git clone https://github.com/seu-usuario/nome-do-repositorio.git
cd nome-do-repositorio

2️⃣ Configurar o Ambiente
Garanta que você tem o Java 17+ e o Maven instalados.
Se precisar instalar o Maven, siga a documentação oficial.

🔄 Persistência dos Dados
Agora o banco de dados H2 foi configurado para ser persistente entre reinicializações. Isso significa que os produtos cadastrados não serão apagados ao reiniciar a aplicação.

📌 Configuração do Banco de Dados no application.properties
# Configuração do H2 (banco persistente)
spring.datasource.url=jdbc:h2:file:./data/produtos
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect

# Hibernate mantém os dados entre reinícios
spring.jpa.hibernate.ddl-auto=update

# Console do H2 habilitado
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console
spring.h2.console.settings.web-allow-others=true


3️⃣ Rodar o Projeto
Para iniciar o servidor, execute:

mvn spring-boot:run
A aplicação será iniciada em http://localhost:8080 🚀

🛠️ Endpoints da API
Aqui estão os principais endpoints da API e como testá-los no Postman ou cURL.

🔹 1. Listar Todos os Produtos
📌 GET /produtos

curl -X GET http://localhost:8080/produtos
🔹 2. Buscar Produto por ID
📌 GET /produtos/{id}
curl -X GET http://localhost:8080/produtos/1

🔹 3. Criar um Novo Produto
📌 POST /produtos
📌 Body (JSON):
{
  "nome": "Teclado Gamer",
  "preco": 250.0
}
curl -X POST http://localhost:8080/produtos -H "Content-Type: application/json" -d '{"nome": "Teclado Gamer", "preco": 250.0}'

🔹 4. Atualizar um Produto
📌 PUT /produtos/{id} 📌 Body (JSON):

{
  "nome": "Teclado Mecânico RGB",
  "preco": 300.0
}

curl -X PUT http://localhost:8080/produtos/1 -H "Content-Type: application/json" -d '{"nome": "Teclado Mecânico RGB", "preco": 300.0}'

🔹 5. Excluir um Produto
📌 DELETE /produtos/{id}

curl -X DELETE http://localhost:8080/produtos/1

🗄️ Acessar o Banco de Dados H2
O projeto usa H2 Database para armazenar os dados temporariamente.
Para acessar o banco:

Inicie a aplicação (mvn spring-boot:run).

Abra no navegador:

http://localhost:8080/h2-console

Configuração de Acesso:

JDBC URL: jdbc:h2:mem:testdb
Usuário: sa
Senha: (deixe em branco)
Execute a consulta para ver os produtos:

SELECT * FROM PRODUTOS;



👨‍🏫 Sobre o Projeto

Este projeto faz parte das aulas de SOA e Web Services da FIAP, com o objetivo de ensinar os alunos a: 

✅ Criar e consumir APIs REST com Spring Boot
✅ Utilizar Spring Data JPA para persistência de dados
✅ Configurar um banco de dados H2 persistente
✅ Carregar dados iniciais com um DataLoader


 
