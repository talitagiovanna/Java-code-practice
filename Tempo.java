import java.util.Scanner;

/*
1. Fazer um programa para:
(a) receber do usuário um tempo em segundos, correspondente à duração de um
evento qualquer (por ex. jogo de futebol);
(b) calcular e mostrar ao usuário o tempo equivalente em horas, minutos e segundos.
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