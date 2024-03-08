import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Questão 01

        int indice = 13, soma = 0, k = 0;

        while(k<indice){
            k=k+1;
            soma = soma +k;
        }
        System.out.println(soma);



        // Questão 2
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número:");
        int numero = scanner.nextInt();

        Fibonacci fibonacci = new Fibonacci();

        if (fibonacci.pertence(numero))
            System.out.println("O número informado pertence à sequência de Fibonacci.");
        else
            System.out.println("O número informado não pertence à sequência de Fibonacci.");
    }
}

//Questão 03

//Descubra a lógica e complete o próximo elemento:



//a) 1, 3, 5, 7, _9_
//
//b) 2, 4, 8, 16, 32, 64, _128_
//
//c) 0, 1, 4, 9, 16, 25, 36, _49_
//
//d) 4, 16, 36, 64, _100_
//
//e) 1, 1, 2, 3, 5, 8, _13_
//
//f) 2,10, 12, 16, 17, 18, 19, _200
//



//Questão 04

// Apesar de não poder ver as lampadas, elas gerão calor enquanto ligadas.
// Eu acenderia um interruptor, esperaria alguns minutos, depois apagaria o primeiro interruptor
// e acenderia um segundo. Usaria uma ida às salas e saberia qual interruptor acende a primeira
// lâmpada e veria a segunda acesa, restando somente a terceira lampada para o terceiro interruptor.
// Vi um caso muito parecido em uma série de TV, onde a lâmpada precisava ser apagada para dar
// acesso às outras salas, neste cenário, seriam necessário pelo menos 3 verificações nas salas
// para definir quais interruptores acendem quais lampadas.


