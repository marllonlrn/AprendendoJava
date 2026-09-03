# Aprendendo Java

Repositório que documenta minha evolução prática com Java, desde os fundamentos da linguagem até a construção de aplicações e APIs REST.

## Sobre mim

Sou **Marllon Lorran**, desenvolvedor em formação. Neste espaço registro exercícios, anotações e pequenos projetos criados durante meus estudos, com foco em escrever código limpo, entender os fundamentos e evoluir de forma consistente.

Minha meta atual é aplicar Java no desenvolvimento de **APIs REST**.

## Objetivos de aprendizado

- Consolidar a lógica de programação e a sintaxe do Java;
- Dominar orientação a objetos;
- Trabalhar com coleções, exceções, arquivos e testes;
- Aprender persistência de dados com SQL e JPA;
- Criar APIs REST com Spring Boot;
- Desenvolver projetos organizados e prontos para portfólio.

## Conteúdo atual

### Aula 1 — Primeiro programa

Apresenta a estrutura básica de uma aplicação Java, o método `main`, variáveis do tipo `String` e a exibição de mensagens no console.

### Aula 2 — Variáveis e estruturas condicionais

Calcula a média de duas notas e utiliza `if` e `else` para informar se o aluno foi aprovado ou reprovado.

### Aula 3 — Entrada de dados

Utiliza a classe `Scanner` para receber duas notas pelo terminal, calcular a média e exibir o resultado. Em sistemas configurados em português, notas decimais devem ser digitadas com vírgula, como `7,5`.

### Aula 5 — Introdução à orientação a objetos

Demonstra os conceitos iniciais de POO com a classe `Pessoa`: objeto, atributos privados, construtor, métodos e alteração de estado.

## Estrutura do projeto

```text
src/
├── Aula1.java
├── Aula2.java
├── Aula3.java
└── Aula5.java
```

## Como executar

Pré-requisito: tenha o [JDK](https://www.oracle.com/java/technologies/downloads/) instalado e disponível no terminal.

Na raiz do projeto, compile todas as aulas:

```powershell
javac -encoding UTF-8 -d out src/*.java
```

Depois, execute a aula desejada. Por exemplo:

```powershell
java -cp out Aula3
```

## Progresso

- [x] Estrutura básica de um programa Java
- [x] Método `main` e saída no console
- [x] Variáveis e concatenação de textos
- [x] Tipos de dados e operadores
- [x] Estruturas condicionais
- [x] Entrada de dados com `Scanner`
- [x] Introdução a métodos e orientação a objetos
- [ ] Estruturas de repetição
- [ ] Coleções, exceções e testes
- [ ] APIs REST com Spring Boot

## Tecnologias

- Java
- JDK

---

Este repositório será atualizado conforme eu avançar nos estudos.
