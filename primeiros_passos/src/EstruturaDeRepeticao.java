import java.util.Locale;
import java.util.Scanner;

public class EstruturaDeRepeticao {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int number;
        int result = 0;

        // while
        while (true) {
            System.out.print("Digite um numero para a soma. caso deseje parar, digite 0: ");
            number = sc.nextInt();
            if (number == 0) {
                break;
            }

            result += number;
        }

        System.out.println(result);

        // for
        result = 0;
        for (int i = 0; i <= 100; i++) {
            result += i;
        }
        System.out.printf("Result: %d%n", result);

        // do-while
        result = 0;
        do {
            System.out.print("Digite um numero para a soma. caso deseje parar, digite 0: ");
            number = sc.nextInt();
            result += number;

        } while (number != 0);

        System.out.printf("Result: %d%n", result);
    }
}
