import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ListaExercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha o exercício que deseja executar (de 1 a 16):");
        int exercicio = scanner.nextInt();

        switch (exercicio) {
            case 1: exe1(); break;
            case 2: exe2(); break;
            case 3: exe3(); break;
            case 4: exe4(); break;
            case 5: exe5(); break;
            case 6: exe6(); break;
            case 7: exe7(); break;
            case 8: exe8(); break;
            case 9: exe9(); break;
            case 10: exe10(); break;
            case 11: exe11(); break;
            case 12: exe12(); break;
            case 13: exe13(); break;
            case 14: exe14(); break;
            case 15: exe15(); break;
            case 16: exe16(); break;
            default: System.out.println("Exercício inválido!");
        }
    }

    // Exercício 1: Hello World
    public static void exe1() {
        System.out.println("Hello World!");
    }

    // Exercício 2: Tipos de dados
    public static void exe2() {
        int numeroInteiro = 10;
        double numeroDecimal = 10.5;
        boolean verdadeiro = true;
        char caractere = 'A';

        System.out.println("Número inteiro: " + numeroInteiro);
        System.out.println("Número decimal: " + numeroDecimal);
        System.out.println("Booleano: " + verdadeiro);
        System.out.println("Caractere: " + caractere);
    }

    // Exercício 3: Calculadora Simples
    public static void exe3() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        double soma = numero1 + numero2;
        double subtracao = numero1 - numero2;
        double multiplicacao = numero1 * numero2;
        double divisao = numero1 / numero2;

        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);

        if (numero2 != 0) {
            System.out.println("Divisão: " + divisao);
        } else {
            System.out.println("Divisão por zero não é permitida!");
        }

        scanner.close();
    }

    // Exercício 4: Par ou Ímpar
    public static void exe4() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O número é par");
        } else {
            System.out.println("O número é ímpar");
        }

        scanner.close();
    }

    // Exercício 5: Loop de 1 a 10
    public static void exe5() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    // Exercício 6: Método Soma 
    public static int soma(int a, int b) {
        return a + b;
    }

    public static void exe6() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int a = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int b = scanner.nextInt();
        System.out.println("A soma dos números é: " + soma(a, b));
        scanner.close();
    }

    // Exercício 7: Método Soma (com parâmetros) - Mesmo que o exercício 6, mas com o Scanner no main
    public static void exe7() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int a = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int b = scanner.nextInt();
        int resultado = soma(a, b); // Chama o método soma definido anteriormente
        System.out.println("A soma dos números é: " + resultado);
        scanner.close();
    }

    // Exercício 8: Ler nome e idade
    public static void exe8() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Olá, " + nome + "! Você tem " + idade + " anos.");

        scanner.close();
    }

    // Exercício 9: Calculadora com Switch
    public static void exe9() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.println("Escolha a operação:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");

        int escolha = scanner.nextInt();
        double resultado = 0;

        switch (escolha) {
            case 1:
                resultado = num1 + num2;
                break;
            case 2:
                resultado = num1 - num2;
                break;
            case 3:
                resultado = num1 * num2;
                break;
            case 4:
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Erro: Divisão por zero!");
                    scanner.close();
                    return; // Encerra o programa em caso de erro
                }
                break;
            default:
                System.out.println("Opção inválida!");
                scanner.close();
                return; // Encerra o programa em caso de erro
        }

        System.out.println("Resultado: " + resultado);
        scanner.close();
    }

    // Exercício 10: Verificar se um número é primo
    public static void exe10() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();

        boolean ehPrimo = true;

        if (numero <= 1) {
            ehPrimo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    ehPrimo = false;
                    break;
                }
            }
        }

        if (ehPrimo) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }

        scanner.close();
    }

    // Exercício 11: Verificar se uma palavra é um palíndromo
    public static void exe11() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();

        // Remove espaços e converte para minúsculas para ignorar diferenças de caixa e espaços
        palavra = palavra.replaceAll("\\s+", "").toLowerCase();

        boolean ehPalindromo = true;
        int tamanho = palavra.length();

        for (int i = 0; i < tamanho / 2; i++) {
            if (palavra.charAt(i) != palavra.charAt(tamanho - 1 - i)) {
                ehPalindromo = false;
                break;
            }
        }

        if (ehPalindromo) {
            System.out.println(palavra + " é um palíndromo.");
        } else {
            System.out.println(palavra + " não é um palíndromo.");
        }

        scanner.close();
    }

    // Exercício 12: Ordenar 5 números em ordem crescente
    public static void exe12() {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];

        System.out.println("Digite 5 números inteiros:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        Arrays.sort(numeros); // Ordena o array em ordem crescente

        System.out.println("Números em ordem crescente:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }

        scanner.close();
    }

    // Exercício 13: Jogo de Adivinhação
    public static void exe13() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(100) + 1; // Gera um número entre 1 e 100
        int tentativas = 0;
        int palpite;

        System.out.println("Tente adivinhar o número secreto entre 1 e 100!");
        do {
            System.out.print("Digite seu palpite: ");
            palpite = scanner.nextInt();
            tentativas++;

            if (palpite < numeroSecreto) {
                System.out.println("Muito baixo! Tente novamente.");
            } else if (palpite > numeroSecreto) {
                System.out.println("Muito alto! Tente novamente.");
            } else {
                System.out.println("Parabéns! Você acertou em " + tentativas + " tentativas!");
            }
        } while (palpite != numeroSecreto);

        scanner.close();
    }

    // Exercício 14: Contar Vogais
    public static void exe14() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma frase ou palavra: ");
        String texto = scanner.nextLine().toLowerCase(); // Converte para minúsculas para facilitar a comparação

        int contadorVogais = 0;

        for (int i = 0; i < texto.length(); i++) {
            char caractere = texto.charAt(i);
            if (caractere == 'a' || caractere == 'e' || caractere == 'i' || caractere == 'o' || caractere == 'u') {
                contadorVogais++;
            }
        }

        System.out.println("O número de vogais na frase é: " + contadorVogais);

        scanner.close();
    }

    // Exercício 15: Fatorial (Iterativo e Recursivo)
    public static int fatorialIterativo(int n) {
        int resultado = 1;
        for (int i = 2; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    public static int fatorialRecursivo(int n) {
        if (n == 0) {
            return 1; // Caso base: 0! = 1
        } else {
            return n * fatorialRecursivo(n - 1);
        }
    }

    public static void exe15() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro não negativo: ");
        int numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("O fatorial não está definido para números negativos.");
        } else {
            int fatorialIterativo = fatorialIterativo(numero);
            int fatorialRecursivo = fatorialRecursivo(numero);

            System.out.println("Fatorial (iterativo): " + fatorialIterativo);
            System.out.println("Fatorial (recursivo): " + fatorialRecursivo);
        }

        scanner.close();
    }

    // Exercício 16: Conversor de Temperatura
    public static void exe16() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha a conversão:");
        System.out.println("1 - Celsius para Fahrenheit");
        System.out.println("2 - Fahrenheit para Celsius");

        int escolha = scanner.nextInt();

        if (escolha == 1) {
            System.out.print("Digite a temperatura em Celsius: ");
            double celsius = scanner.nextDouble();
            double fahrenheit = (celsius * 9 / 5) + 32;
            System.out.println(celsius + "°C equivale a " + fahrenheit + "°F");
        } else if (escolha == 2) {
            System.out.print("Digite a temperatura em Fahrenheit: ");
            double fahrenheit = scanner.nextDouble();
            double celsius = (fahrenheit - 32) * 5 / 9;
            System.out.println(fahrenheit + "°F equivale a " + celsius + "°C");
        } else {
            System.out.println("Opção inválida!");
        }

        scanner.close();
    }
}
