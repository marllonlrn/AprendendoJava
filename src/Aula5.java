public class Aula5 {
  public static void main(String[] args) {
    // Um objeto e uma instancia criada a partir de uma classe.
    Pessoa aluno = new Pessoa("Marllon", 20);

    aluno.apresentar();
    aluno.fazerAniversario();
    aluno.apresentar();
  }
}

// A classe funciona como um molde para criar objetos.
class Pessoa {
  // Atributos guardam as caracteristicas do objeto.
  private String nome;
  private int idade;

  // O construtor define os valores iniciais do objeto.
  public Pessoa(String nome, int idade) {
    this.nome = nome;
    this.idade = idade;
  }

  // Metodos representam comportamentos do objeto.
  public void apresentar() {
    System.out.println("Ola! Meu nome e " + nome + " e tenho " + idade + " anos.");
  }

  public void fazerAniversario() {
    idade++;
    System.out.println(nome + " fez aniversario!");
  }
}
