public class Aula2 {
  public static void main(String[] args) {
    String nomeAluno = "Marllon";
    int idadeAluno = 20;
    double nota1 = 7.5;
    double nota2 = 8.0;
    double media = (nota1 + nota2) / 2;

    System.out.println("Nome do aluno: " + nomeAluno);
    System.out.println("Idade do aluno: " + idadeAluno);
    if (media >= 7.0) {
      System.out.println("Aprovado com média: " + media);
    } else {
      System.out.println("Reprovado com média: " + media);
    }

    /*
     * 
     * float numero1 = 10.5f;
     * 
     * if(numero1 > 0){
     * System.out.println("O número é positivo.");
     * } else if(numero1 < 0){
     * System.out.println("O número é negativo.");
     * } else {
     * System.out.println("O número é zero.");
     * }
     * 
     */

  }
}
