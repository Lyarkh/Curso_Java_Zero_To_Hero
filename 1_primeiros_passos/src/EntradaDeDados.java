import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDados {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String x;
        int y;
        double z;


        x = sc.next(); // `nextLine()` pega as informações ate a quebra de linha
        y = sc.nextInt();
        z = sc.nextDouble();
        System.out.println("Você digitou a string:  " + x);
        System.out.println("Você digitou o int: " + y);
        System.out.println("Você digitou o double: " + z);

        sc.close();
    }
}
