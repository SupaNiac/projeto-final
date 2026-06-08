# Projeto Final Integrado - Sistema Acadêmico Corporativo

Este repositório contém a implementação prática desenvolvida com base nos diagramas de engenharia fornecidos para a avaliação final do curso. O sistema simula módulos de uma plataforma integrada corporativa e de e-commerce.

## 🚀 Tecnologias Utilizadas
- **Linguagem:** Java 17
- **Framework:** Spring Boot 3.x
- **Persistência:** Spring Data JPA
- **Banco de Dados:** H2 Database (Rodando em memória para execução rápida)

---

## 🗺️ Mapeamento dos Diagramas

### 1. Casos de Uso (Online Book Store)
Fluxo de interações de gerenciamento de usuários simulados na arquitetura da aplicação:

```mermaid
graph TD
    Client((Cliente)) --> Login([Login])
    Client --> Create([Create Account])
    Client --> View([View Account Details])
    Client --> Close([Close Account])
    
    View -.->|«extend»| History([View History])
    View -.->|«extend»| Orders([View Open Orders])
    
    Admin((Administrator)) --> Delete([Delete User])
    Delete -.->|«include»| Close
