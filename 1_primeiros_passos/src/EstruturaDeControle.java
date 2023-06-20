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
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Número inválido");
                break;
        }

        // ternário
        String ternario = (num != 10) ? "Os numeros são diferentes" : "Os números são iguais";
        System.out.println(ternario);
    }
}
