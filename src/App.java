import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        System.out.println("Digite o valor que você ganha por hora de trabalho ");

        double valordahora = new Scanner(System.in).nextInt();

        System.out.println("Digite quantas horas você trabalha por dia ");

        int horastrabalhadas = new Scanner(System.in).nextInt();
        int quantidadededias = 22; 

        System.out.printf("O seu salário em um mês é de: " + (valordahora * horastrabalhadas) * quantidadededias);
      }

    }