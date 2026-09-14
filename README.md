# To-Do List — Programação Orientada a Objetos

Sistema de gerenciamento de tarefas desenvolvido em **Java**, com foco na aplicação prática de conceitos de **Programação Orientada a Objetos (POO)**.

## 📌 Sobre o projeto

O projeto consiste em uma aplicação de lista de tarefas (To-Do List), permitindo o gerenciamento de diferentes tipos de tarefas e seus respectivos comportamentos.

A aplicação foi desenvolvida como atividade acadêmica da disciplina de Programação Orientada a Objetos, com o objetivo de aplicar conceitos de orientação a objetos em um sistema prático de gerenciamento de tarefas.

## ⚙️ Funcionalidades

A aplicação permite:

- Cadastro de tarefas;
- Atualização de tarefas;
- Busca de tarefas;
- Remoção de tarefas;
- Controle do status das tarefas;
- Criação de tarefas simples;
- Criação de tarefas com prazo definido;
- Criação de tarefas recorrentes;
- Reagendamento automático de tarefas recorrentes após sua conclusão;
- Exibição das informações de acordo com o tipo de tarefa.

## 🧩 Conceitos de Programação Orientada a Objetos

Durante o desenvolvimento foram aplicados diferentes conceitos de POO:

### Encapsulamento

Utilizado para organizar e controlar o acesso aos atributos e comportamentos das classes.

### Herança

Utilizada para representar diferentes tipos de tarefas a partir de uma estrutura comum.

### Classes abstratas

Utilizadas para definir características e comportamentos compartilhados entre diferentes tipos de tarefas.

### Polimorfismo

Permite que diferentes tipos de tarefas apresentem comportamentos específicos, mesmo seguindo uma estrutura comum.

### Interfaces genéricas

Utilizadas para definir contratos e comportamentos que podem ser implementados pelas classes do sistema.

### Enum

Utilizado para representar os diferentes estados possíveis das tarefas:

- Pendente
- Em andamento
- Concluído

## 🏗️ Estrutura do projeto

```text
projeto-to-do-list-POO/
│
├── model/
│   └── Classes relacionadas às tarefas
│
├── service/
│   └── Classes responsáveis pelas operações do sistema
│
├── Main.java
│
└── README.md
