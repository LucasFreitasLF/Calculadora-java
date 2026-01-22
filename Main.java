import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String sair;
        int escolha;


        do {
            boolean operacaoValida = true;
            double resultado = 0;

            System.out.println("\n ---- Calcu4ladora ----");
            System.out.println("Escolha uma operação:");
            System.out.println("1 - Adição");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Porcentagem");
            System.out.println("6 - Potência");

            System.out.print("Operação: ");
            escolha = scanner.nextInt();

            System.out.println("Digite o primeiro número: ");
            double numero1 = scanner.nextDouble();

            System.out.println("Digite o segundo número: ");
            double numero2 = scanner.nextDouble();

            switch (escolha){
                case 1:
                    resultado = numero1 + numero2;
                    break;
                case 2:
                    resultado = numero1 - numero2;
                    break;
                case 3:
                    resultado = numero1 * numero2;
                    break;
                case 4:
                    if (numero2 == 0) {
                        System.out.println("Não é possível dividir por zero");
                        operacaoValida = false;
                        break;
                    }
                    resultado = numero1 / numero2;
                    break;
                case 5:
                    resultado = (numero1 /100) * numero2;
                    break;
                case 6:
                    resultado = Math.pow(numero1, numero2);
                    break;
                default:
                    System.out.println("Opção inválida");
                    operacaoValida = false;
                    resultado = 0;
            }

            if (operacaoValida){
                System.out.println("Resultado: " + resultado);
            }

            System.out.println("Deseja sair? (s/n): ");
            sair = scanner.next();

        } while (!sair.equalsIgnoreCase("s"));

        scanner.close();
        System.out.println("Encerrado!");
    }
}