import java.util.Scanner;

/*
1. Create a program to:
(a) receive from the user a time in seconds, corresponding to the duration of any event (e.g. a soccer game);
(b) calculate and show the user the equivalent time in hours, minutes, and seconds.
*/

public class Tempo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int segundos = 0;
        int horas = 0;
        int minutos = 0;
        int segundos_restantes = 0;

        System.out.println("Digite o tempo em segundos: ");
        segundos = scanner.nextInt();

        horas = segundos/3600;
        segundos_restantes = segundos % 3600;
        minutos = segundos_restantes/60;
        segundos_restantes = segundos_restantes % 60;

        System.out.println(segundos + " segundos são equivalentes a " + horas + " horas, " + minutos + " minutos e " + segundos_restantes + " segundos.");
    }
}