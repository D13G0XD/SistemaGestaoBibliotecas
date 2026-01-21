# 📚 Sistema de Gestão de Biblioteca

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)

Este é um projeto de **Gestão de Biblioteca** desenvolvido em Java para demonstrar conceitos fundamentais de Programação Orientada a Objetos (POO), organização de camadas e manipulação de coleções de dados.

## 🎯 Objetivo do Projeto
O sistema permite o gerenciamento completo de um acervo de livros, permitindo cadastrar, buscar, listar e remover títulos de forma organizada através de um menu interativo no console.

## ✨ Funcionalidades
* **Cadastro de Livros:** Adiciona novos títulos ao sistema validando o ISBN.
* **Consulta por ISBN:** Busca rápida de livros específicos através de seu identificador único.
* **Listagem Geral:** Visualização de todos os livros presentes no acervo.
* **Remoção:** Exclusão de livros do sistema via ISBN.
* **Gestão de Usuários (Em progresso):** Estrutura preparada para gerenciamento de membros da biblioteca.

## 🛠️ Tecnologias Utilizadas
* **Linguagem:** Java (JDK 17 ou superior)
* **Arquitetura:** Padrão de camadas (Entities, Services e Interfaces)
* **Estrutura de Dados:** `HashMap` para garantir performance de busca $O(1)$ por ISBN.

## 🏛️ Estrutura do Projeto
O projeto foi desenvolvido seguindo boas práticas de separação de responsabilidades:



* `entities`: Classes que representam os objetos do mundo real (Livro, Usuário).
* `services`: Interfaces que definem os contratos e regras de negócio.
* `services.impl`: Implementações concretas das regras de negócio.
* `Main`: Classe de entrada que gerencia o loop de interação com o usuário.

## 🚀 Como Executar
1. Certifique-se de ter o **JDK 17+** instalado.
2. Clone o repositório:
   ```bash
   git clone [https://github.com/D13G0XD/SistemaGestaoBibliotecas.git](https://github.com/D13G0XD/SistemaGestaoBibliotecas.git)
