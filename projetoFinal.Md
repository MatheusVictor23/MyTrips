# Projeto de Cadastro e Gerenciamento de Locais

## Requisitos Funcionais

### 1. Cadastro e Gerenciamento de Locais
Este projeto conta com classes que gerenciam o cadastro de locais, permitindo a organização e armazenamento de informações detalhadas sobre cada local:

- **Local.java**: Classe principal que contém três atributos, representados por outras classes:
  - **LocalNome**: Recebe uma `String` que representa o nome do local visitado.
  - **LocalEndereco**: Composto por outras classes para representar a localização completa do local, incluindo `Pais`, `Estado`, `Cidade` e `ZonaCidade`.
  - **LocalAvaliacao**: Classe responsável pelos dados de avaliação do local.

### 2. Avaliação de Locais
As avaliações dos locais são gerenciadas por classes específicas:
- **LocalAvaliacao**: Parte da classe `Local`, contém um comentário sobre o local e a avaliação em estrelas (de 1 a 5) do local visitado.

### 3. Organização Geográfica
A estrutura de localização do local é detalhada, permitindo segmentação geográfica e listagem de locais por região:

- **Pais**: Atributo que representa o país do local visitado. Possui o método `listar()`, que lista todos os locais visitados pelo usuário neste país.
- **Estado**: Representa o estado do local visitado e possui o método `listar()`, para listar os locais no estado.
- **Cidade**: Atributo para a cidade do local visitado, com o método `listar()`, para listar locais dentro da cidade.
- **ZonaCidade**: Representa a zona da cidade onde o local está situado e possui o método `listar()`, para listar os locais na zona.

---

## Requisitos Técnicos

### 1. Classes e Objetos
Este projeto é implementado em Java, uma linguagem orientada a objetos, onde o uso de classes e objetos é fundamental.

### 2. Encapsulamento e Modificadores de Acesso
Para garantir a segurança, todos os atributos das classes são privados (`private`), promovendo o encapsulamento.

### 3. Sobrecarga e Reescrita de Métodos
A sobrecarga é implementada, especialmente na classe `Usuario`, onde múltiplos construtores são definidos. A classe permite instanciar um objeto `Usuario` sem passar o atributo `Admin`, embora ele seja usado para estabelecer uma relação bidirecional entre `Usuario` e `Admin`.

### 4. Interfaces e Classes Abstratas
- **Classe Abstrata**: `Pessoa` é uma classe abstrata sem implementações, servindo como base para herança.
- **Interface**: As classes que exigem listagem implementam o método `listar()` definido na interface `EntidadeListar`.

### 5. Polimorfismo
O método `listar()` é implementado com polimorfismo dinâmico, permitindo reescrita do método nas classes que o implementam.

### 6. Herança
O relacionamento de herança é aplicado entre `Pessoa` e `Usuario`, com `Usuario` herdando atributos e métodos da classe `Pessoa`.

### 7. Associação Simples, Agregação e Composição
As relações entre as classes são construídas com técnicas de:

- Associação Simples, onde os objetos interagem sem dependência.
- Agregação: zona da cidade que agrega vários locais
- Composição: um país que é composto de vários estados.

---