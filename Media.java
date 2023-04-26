import java.util.Scanner;

/*
2. Create a program to receive 3 integer values from the user and show their average (which may not be an integer).
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

        scanner.close();

    }
}