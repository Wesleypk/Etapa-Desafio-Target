import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite a palavra que deseja inverter:");
        String entrada = scanner.nextLine();

        char[] stringQuebrada = entrada.toCharArray();

        // Inverte a ordem dos chars e armazena em outro vetor
        char[] stringInvertida = new char[stringQuebrada.length];
        for (int i = 0; i < stringQuebrada.length; i++) {
            stringInvertida[stringQuebrada.length - 1 - i] = stringQuebrada[i];
        }

        System.out.println("Segue a palavra invertida: ");
        for (char charInvertido : stringInvertida) {
            System.out.print(charInvertido);
        }
    }
}