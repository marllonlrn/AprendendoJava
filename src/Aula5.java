public class Aula5 {
  /*
   * O metodo main e o ponto de inicio do programa.
   * Quando executamos a classe Aula5, o Java comeca por aqui.
   */
  public static void main(String[] args) {
    /*
     * Pessoa          -> tipo da variavel, definido pela classe Pessoa.
     * aluno           -> variavel que guardara a referencia do objeto.
     * new              -> cria um novo objeto na memoria.
     * Pessoa(...)      -> chama o construtor e fornece os valores iniciais.
     *
     * Portanto, aluno e um OBJETO (ou instancia) criado a partir
     * do molde chamado Pessoa.
     */
    Pessoa aluno = new Pessoa("Marllon", 20);

    // O ponto permite acessar um comportamento (metodo) do objeto aluno.
    aluno.apresentar();

    // Este metodo altera a idade guardada dentro do objeto: 20 passa para 21.
    aluno.fazerAniversario();

    // A segunda apresentacao ja utiliza a nova idade: 21.
    aluno.apresentar();
  }
}

/*
 * CLASSE E OBJETO
 *
 * A classe Pessoa funciona como um molde. Ela define quais dados uma pessoa
 * possui e quais acoes ela pode realizar.
 *
 * Classe: o molde chamado Pessoa.
 * Objeto: uma pessoa concreta criada com "new Pessoa(...)".
 */
class Pessoa {
  /*
   * ATRIBUTOS
   *
   * Os atributos representam o estado do objeto. Cada objeto Pessoa criado
   * tera seu proprio nome e sua propria idade.
   *
   * private protege os atributos contra alteracoes diretas feitas fora
   * desta classe. Assim, a propria classe controla seus dados.
   */
  private String nome;
  private int idade;

  /*
   * CONSTRUTOR
   *
   * O construtor possui o mesmo nome da classe e e chamado automaticamente
   * quando usamos "new Pessoa(...)". Ele prepara o estado inicial do objeto.
   */
  public Pessoa(String nome, int idade) {
    /*
     * "this" significa "este objeto".
     *
     * this.nome -> atributo nome pertencente ao objeto.
     * nome      -> valor recebido pelo parametro do construtor.
     *
     * Se recebemos "Marllon", o valor e guardado em this.nome.
     */
    this.nome = nome;
    this.idade = idade;
  }

  /*
   * METODOS
   *
   * Metodos representam comportamentos do objeto.
   * public permite chamar o metodo fora da classe Pessoa.
   * void indica que o metodo executa uma acao, mas nao devolve um valor.
   */
  public void apresentar() {
    System.out.println("Ola! Meu nome e " + nome + " e tenho " + idade + " anos.");
  }

  public void fazerAniversario() {
    // idade++ e uma forma abreviada de escrever: idade = idade + 1;
    idade++;
    System.out.println(nome + " fez aniversario!");
  }
}
