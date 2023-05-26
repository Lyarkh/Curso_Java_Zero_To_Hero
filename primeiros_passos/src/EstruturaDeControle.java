import java.util.Locale;
import java.util.Scanner;

public class EstruturaDeControle {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        float num;
        num = sc.nextFloat();

        // if-else
        boolean condition = num > 10;
        if (condition) {
            System.out.println("o numero é maior que 10");
        } else {
            System.out.println("o numero não é maior que 10");
        }

        // switch-case
        int diaDaSemana = sc.nextInt();
        switch (diaDaSemana){
            case 1:
                System.out.println("Domingo");
            case 2:
                System.out.println("Segunda-feira");
            case 3:
                System.out.println("Terça-feira");
            case 4:
                System.out.println("Quarta-feira");
            case 5:
                System.out.println("Quinta-feira");
            case 6:
                System.out.println("Sexta-feira");
            case 7:
                System.out.println("Sábado");
            default:
                System.out.println("Número inválido");
        }

        // ternário
        String ternario = (num != 10) ? "Os numeros são diferentes" : "Os números são iguais";
    }
}
