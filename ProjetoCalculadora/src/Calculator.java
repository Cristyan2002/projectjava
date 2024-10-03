import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // O Usuário irá digitar dois números para calcular;
        int n1;
        int n2;
        int operacao;
        // O programa irá armazenar as variáveis ;
        System.out.print("Qual o primeiro número para calcularmos?");
        n1 = sc.nextInt();
        System.out.print("Qual o segundo número que deseja calcular?");
        n2 = sc.nextInt();
        System.out.print("\n[1] - Somar \n[2] - Subtrair \n[3] - Multiplicar \n[4] - Dividir\n");
        System.out.print("Qual operação você deseja realizar ?");
        operacao = sc.nextInt();
        sc.close();
        if (operacao == 1){
            System.out.printf("A soma do número: %d + %d é o total de: %d", n1,n2, n1 + n2);
        }
        else if (operacao == 2){
            System.out.printf("A subtração do número: %d - %d é o total de: %d", n1,n2, n1-n2);
        }
        else if (operacao == 3){
            System.out.printf("A Multiplicação do número: %d x %d é o total de: %d", n1,n2, n1*n2);
        }
        else if (operacao == 4){
            System.out.printf("A Divisão do número: %d / %d é o total de: %d", n1,n2, n1/n2);
        }


        }
        }


