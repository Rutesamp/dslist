# DSList - Intensivão Java Spring

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)

## 💻 Sobre o projeto
O **DSList** é uma aplicação completa (Back-end) construída durante o Intensivão Java Spring. O sistema consiste em um catálogo de jogos, onde é possível organizar listas de jogos por categorias e posições.

O objetivo principal foi aplicar na prática a **Arquitetura em Camadas** e o padrão **DTO (Data Transfer Object)**.

## 🛠️ Tecnologias Utilizadas
- **Linguagem:** Java 17
- **Framework:** Spring Boot 3
- **Acesso a Dados:** Spring Data JPA
- **Banco de Dados:** H2 (Desenvolvimento) e PostgreSQL (Produção)
- **Gerenciador de Dependências:** Maven

## 📐 Arquitetura do Sistema
O projeto foi estruturado seguindo as melhores práticas de mercado:
1. **Entidades:** Mapeamento objeto-relacional com JPA.
2. **DTOs:** Camada de transferência para segurança e performance.
3. **Repositórios:** Interfaces de acesso ao banco de dados.
4. **Serviços:** Regras de negócio da aplicação.
5. **Controladores:** Endpoints da API REST.

## 🚀 Como executar o projeto
1. Clone o repositório:
   ```bash
   git clone [https://github.com/Rutesamp/dslist.git](https://github.com/Rutesamp/dslist.git)
