import java.util.Scanner;

/*
2. Fazer um programa para receber 3 valores inteiros do usuário e 
mostrar a sua média (que pode não ser inteira).
*/

public class Media {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        double media = 0.0;

        System.out.println("Digite um número: ");
        num1 = scanner.nextInt();

        System.out.println("Digite um número: ");
        num2 = scanner.nextInt();

        System.out.println("Digite um número: ");
        num3 = scanner.nextInt();

        media = (num1 + num2 + num3)/3.0;

        System.out.println("A média dos valores inseridos é: " + media);

    }
}