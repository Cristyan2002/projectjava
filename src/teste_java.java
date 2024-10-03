import java.util.Scanner;
public class teste_java {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x;
    int y;
    System.out.print("Digite um número:");
    x = sc.nextInt();
    System.out.print("Digite outro número:");
    y = sc.nextInt();
    System.out.println("A Soma dos dois números é: " + (x + y));
    sc.close();
    }

}