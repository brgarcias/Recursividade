public class Recursividade {

    public static void main(String[] args) {

        System.out.println("// ---------- Recursividade 1 -------- //");
        // ---------- Recursividade 1 -------- //

        //Exercício 3
        //chamada Linear
        int lr[] = {4, 8, 2, 1, 7, 9, 3, 6, 12, 15, -1};
        int resLr = buscaLinearRecursiva(lr, 3, 0);
        if (resLr != -1) System.out.println("O 3 encontra-se no índice " + resLr);
        else System.out.println("O 3 não existe!");

        //Exercício 4
        //chamada Binaria
        int br[] = {-1, 1, 2, 3, 4, 6, 7, 8, 9, 12, 15,};
        int resBr = buscaBinariaRecursiva(br, 12, 0, 10);
        if (resBr != -1) System.out.println("O 12 encontra-se no índice " + resBr);
        else System.out.println("O 12 não existe!");

        //Exercício 5
        //chamada maior valor
        int mv[] = {4, 8, 2, 1, 7, 9, 3, 6, 12, 15, -1};
        int resMv = maiorRecursivo(mv, 0);
        System.out.println("O maior valor é: " + resMv);


        //Exercicio 6
        //torre de hanoi
        System.out.println("\nResolvendo a Torre de Hanoi para 3 discos:");
        hanoi(3, 'A', 'C', 'B');
        System.out.println("\nResolvendo a Torre de Hanoi para 4 discos:");
        hanoi(4, 'A', 'C', 'B');


        System.out.println("\n// ---------- Recursividade 2 -------- //");
        // ---------- Recursividade 2 -------- //

        //Exercicio 1
        //valor da expressão: 1/1 + 1/2 +...
        System.out.println("O resultado da expressão para n=10: " + expressao1(10));

        //Exercicio 5
        //potenciação
        System.out.println("2^10 = " + potenciacao(2, 10));

        //Exercicio 6
        //decimal binário 12 e 6
        System.out.print("12 em binário é: ");
        decbin(12);

        //Exercicio 4
        //pi
        System.out.println("\npi(9) = " + pi(9));
        System.out.println("pi(99) = " + pi(99));
        System.out.println("pi(999) = " + pi(999));

        //Exercicio 8
        //euclides
        System.out.println("mdc de 30,45 = " + mdc(30, 45));
        System.out.println("mdc de 37,89 = " + mdc(37, 89));
        System.out.println("mdc de 74,2 = " + mdc(74, 2));

    }

    // ---------- Recursividade 1 -------- //

    //Exercício 3
    // Busca Linear Recursiva:

    public static int buscaLinearRecursiva(int vet[], int procurado, int inicio) {
        if (inicio >= vet.length) return -1; //não existe
        else if (vet[inicio] == procurado) return inicio;
        else return buscaLinearRecursiva(vet, procurado, inicio + 1);
    }

    //Exercício 4
    // Busca Binaria Recursiva:

    public static int buscaBinariaRecursiva(int vet[], int procurado, int inicio, int fim) {
        if (inicio > fim) return -1; //não existe
        else {
            int meio = (inicio + fim) / 2;
            if (vet[meio] == procurado) return meio;
            else if (vet[meio] > procurado) return buscaBinariaRecursiva(vet, procurado, inicio, meio - 1);
            else return buscaBinariaRecursiva(vet, procurado, meio + 1, fim);
        }
    }

    //Exercício 5
    // Maior valor do vetor Recursivamente:

    public static int maiorRecursivo(int vet[], int inicio) {
        if (inicio == vet.length - 1) return vet[inicio];
        else {
            int maior = maiorRecursivo(vet, inicio + 1);
            if (maior > vet[inicio]) return maior;
            else return vet[inicio];
        }
    }

    //Exercicio 6
    //torre de hanoi
    public static void hanoi(int n, char origem, char destino, char auxiliar) {
        if (n == 1) System.out.println("Mova o disco do pino " + origem + " para o pino " + destino);
        else {
            hanoi(n - 1, origem, auxiliar, destino);
            System.out.println("Mova o disco do pino " + origem + " para o pino " + destino);
            hanoi(n - 1, auxiliar, destino, origem);
        }
    }

    // ---------- Recursividade 2 -------- //

    //Exercicio 1
    //valor da expressão: 1/1 + 1/2 +...
    public static double expressao1(int n) {
        if (n == 0) return 0;
        else return expressao1(n - 1) + 1.0 / n;
    }

    //Exercicio 4
    //pi
    public static double pi(int n) {
        if (n == 1) return 4.0;
        else if (n % 2 == 0) return pi(n - 1);
        else if (n % 4 == 1) return pi(n - 2) + 4.0 / n;
        else return pi(n - 2) - 4.0 / n;
    }

    //Exercicio 5
    //potenciação
    public static double potenciacao(double base, int exp) {
        if (exp == 0) return 1;
        else return potenciacao(base, exp - 1) * base;
    }


    //Exercicio 6
    //decimal binário 12 e 6
    public static void decbin(int n) {
        if (n == 0 || n == 1) System.out.print("" + n);
        else {
            decbin(n / 2);
            System.out.print("" + (n % 2));
        }
    }

    //Exercicio 8
    //euclides
    public static int mdc(int a, int b) {
        if (a % b == 0) return b;
        else return mdc(b, a % b);
    }

}
