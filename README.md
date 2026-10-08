# ☕ Sistema Acadêmico - Programação Orientada a Objetos em Java

![Java](https://img.shields.io/badge/Language-Java-orange.svg)
![Paradigm](https://img.shields.io/badge/Paradigm-Object--Oriented%20Programming-blue.svg)
![Design](https://img.shields.io/badge/Design-Encapsulation%20%7C%20Inheritance%20%7C%20Polymorphism-purple.svg)
![Status](https://img.shields.io/badge/Status-Conclu%C3%ADdo-brightgreen.svg)

## 📌 Visão Geral
Este projeto é uma aplicação de gerenciamento acadêmico desenvolvida em **Java**, concebida durante a disciplina de **Programação Orientada a Objetos (POO)** do IFSULDEMINAS.

O sistema modela o domínio institucional universitário, gerenciando alunos, docentes, departamentos, cursos e disciplinas. O projeto coloca em prática os quatro pilares essenciais da orientação a objetos: **Encapsulamento**, **Herança**, **Polimorfismo** e **Abstração**, além de validações de regras de negócio educacionais (cálculo de médias, limites de faltas e pré-requisitos).

---

## 🚀 Funcionalidades Principais
- 🎓 **Gestão de Alunos**: Cadastro com dados pessoais, matrícula institucional, histórico acadêmico e controle de notas por disciplina.
- 👨‍🏫 **Gestão de Professores**: Cadastro de docentes vinculados a departamentos acadêmicos e titulações.
- 📚 **Gestão de Disciplinas & Cursos**:
  - Definição de carga horária e código de disciplina.
  - Alocação de professores titulares.
  - Matrícula de alunos e controle de turmas.
- 🧮 **Regras de Negócio e Avaliação**:
  - Cálculo automatizado de médias ponderadas/aritméticas.
  - Apuração do percentual de frequência e assiduidade.
  - Emissão de parecer final (Aprovado, Reprovado por Nota ou Reprovado por Frequência).
- 🖥️ **Interface Interativa por Console**: Menu estruturado para navegação, cadastro e emissão de boletins.

---

## 🛠️ Tecnologias e Conceitos Aplicados
- **Linguagem**: Java (JDK 8+)
- **Princípios de Engenharia de Software**:
  - Separação de pacotes por domínio (`academico`, `alunos`, `funcionarios`, `main`).
  - Encapsulamento estrito (atributos privados com getters/setters e métodos de negócio).
  - Coleções dinâmicas da Java Collections API (`ArrayList`, `List`).

---

## 📂 Estrutura do Repositório
```plaintext
Projeto_POO_1/
└── Trabalho_1/src/ifsuldeminas/
    ├── academico/
    │   └── Disciplina.java              # Entidade Disciplina e controle de notas/frequência
    ├── alunos/
    │   └── Aluno.java                   # Entidade Aluno e histórico individual
    ├── funcionarios/
    │   └── Professor.java               # Entidade Professor e dados funcionais
    └── main/
        └── Main.java                    # Entry point e menu interativo em console
```

---

## ⚙️ Como Executar o Projeto Localmente

### Pré-requisitos
- JDK 8 ou superior instalado.

### Compilação e Execução
1. Clone o repositório:
   ```bash
   git clone https://github.com/LucaS4nt0s/Projeto_POO_1.git
   cd Projeto_POO_1/Trabalho_1/src
   ```
2. Compile os módulos:
   ```bash
   javac ifsuldeminas/academico/*.java ifsuldeminas/alunos/*.java ifsuldeminas/funcionarios/*.java ifsuldeminas/main/*.java
   ```
3. Execute o programa:
   ```bash
   java ifsuldeminas.main.Main
   ```

---

## 👨‍💻 Autor
Desenvolvido por **Luca Samuel dos Santos** ([@LucaS4nt0s](https://github.com/LucaS4nt0s)).
