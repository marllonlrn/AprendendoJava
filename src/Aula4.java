public class Aula4 {
    public static void main(String[] args) {
        /*
         * O "for" é uma estrutura de repetição.
         * Ele é útil quando sabemos quantas vezes queremos repetir um código.
         *
         * Estrutura:
         *
         * for (inicialização; condição; atualização) {
         *     código que será repetido;
         * }
         *
         * 1. Inicialização: executada apenas uma vez, antes da repetição.
         * 2. Condição: verificada antes de cada repetição.
         * 3. Corpo: executado enquanto a condição for verdadeira.
         * 4. Atualização: executada depois do corpo, ao final de cada repetição.
         *
         * A ordem é:
         * inicialização -> condição -> corpo -> atualização -> condição...
         */

        System.out.println("1) CONTAGEM CRESCENTE");

        // int numero = 1: cria o contador começando em 1.
        // numero <= 10: repete enquanto numero for menor ou igual a 10.
        // numero++: aumenta 1 depois de cada repetição.
        for (int numero = 1; numero <= 10; numero++) {
            System.out.println("Número: " + numero);
        }

        System.out.println("\n2) CONTAGEM DECRESCENTE");

        // numero-- diminui 1 depois de cada repetição.
        for (int numero = 5; numero >= 1; numero--) {
            System.out.println("Número: " + numero);
        }

        System.out.println("\n3) CONTAGEM DE DOIS EM DOIS");

        // numero += 2 equivale a: numero = numero + 2.
        for (int numero = 0; numero <= 10; numero += 2) {
            System.out.println("Número par: " + numero);
        }

        System.out.println("\n4) SOMANDO VALORES");

        int soma = 0;

        // A cada repetição, o valor de numero é acrescentado à soma.
        for (int numero = 1; numero <= 5; numero++) {
            soma += numero; // Equivale a: soma = soma + numero.
        }

        System.out.println("Soma de 1 até 5: " + soma);

        System.out.println("\n5) PERCORRENDO UM ARRAY PELO ÍNDICE");

        String[] alunos = {"Ana", "Bruno", "Carla"};

        // Os índices de um array começam em 0.
        // alunos.length informa a quantidade de elementos do array.
        // Usamos indice < alunos.length para não ultrapassar o último índice.
        for (int indice = 0; indice < alunos.length; indice++) {
            System.out.println("Índice " + indice + ": " + alunos[indice]);
        }

        System.out.println("\n6) FOR-EACH (FOR APRIMORADO)");

        /*
         * O for-each percorre diretamente todos os elementos de um array.
         * É mais simples quando não precisamos saber o índice.
         *
         * Estrutura:
         * for (tipo elemento : coleção) {
         *     código;
         * }
         */
        for (String aluno : alunos) {
            System.out.println("Aluno: " + aluno);
        }

        System.out.println("\n7) USANDO CONTINUE");

        // continue ignora o restante da repetição atual e vai para a próxima.
        for (int numero = 1; numero <= 5; numero++) {
            if (numero == 3) {
                continue; // O número 3 não será impresso.
            }

            System.out.println("Número diferente de 3: " + numero);
        }

        System.out.println("\n8) USANDO BREAK");

        // break encerra completamente o laço, mesmo que a condição ainda seja verdadeira.
        for (int numero = 1; numero <= 10; numero++) {
            if (numero == 4) {
                break; // Encerra o for quando numero for igual a 4.
            }

            System.out.println("Antes do break: " + numero);
        }

        System.out.println("\n9) FOR ANINHADO");

        // Um for pode ficar dentro de outro for.
        // Para cada valor de linha, o for interno percorre todas as colunas.
        for (int linha = 1; linha <= 2; linha++) {
            for (int coluna = 1; coluna <= 3; coluna++) {
                System.out.println("Linha " + linha + ", coluna " + coluna);
            }
        }

        /*
         * OBSERVAÇÕES IMPORTANTES:
         *
         * 1. A variável declarada no for só existe dentro dele:
         *    for (int i = 0; i < 3; i++) { ... }
         *    Fora desse for, a variável i não pode ser utilizada.
         *
         * 2. Cuidado com a condição para não criar uma repetição infinita.
         *    O exemplo abaixo nunca terminaria porque não possui uma condição falsa:
         *    for (;;) { ... }
         *
         * 3. Cuidado com <= ao percorrer arrays. Como os índices começam em 0,
         *    o correto normalmente é indice < array.length, e não indice <= array.length.
         *
         * 4. As partes do for podem ser omitidas, mas os dois pontos e vírgulas
         *    continuam obrigatórios. Na maioria dos casos, a forma completa é mais clara.
         */
    }
}
