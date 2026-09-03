import java.util.Scanner;

public class Aula3 {
    public static void main(String[] args){
        Scanner entradaUsuario = new Scanner(System.in);
        /*
        System.out.print("Digite sua idade: ");
        int idade = entradaUsuario.nextInt();

        if(idade >= 18) {
            System.out.println("Você é maior de idade.");
        } else {
            System.out.println("Você é menor de idade.");
        }

        entradaUsuario.close();
        */

        System.out.print("Digite sua nota: ");
        double nota = entradaUsuario.nextDouble();
        System.out.println("Digite sua segunda nota: ");
        double nota2 = entradaUsuario.nextDouble();
        double media = (nota + nota2) / 2;

        if(media >= 7.0) {
            System.out.println("Aprovado com média: " + media);
        } else {
            System.out.println("Reprovado com média: " + media);
        }
        
        entradaUsuario.close();
    }
}
