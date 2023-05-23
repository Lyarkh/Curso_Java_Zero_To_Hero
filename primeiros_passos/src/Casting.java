public class Casting {
    public static void main(String[] args) {
        int a, b;
        double c, resultadoExemplo1;
        int resultadoExemplo2;


        a = 5;
        b = 2;

        resultadoExemplo1 = exemploParaDouble(a, b);
        System.out.println(resultadoExemplo1);

        c = 5.0;
        resultadoExemplo2 = exemploParaInt(c);
        System.out.println(resultadoExemplo2);
    }
    public static double exemploParaDouble(int a, int b){
        return (double) a / b;
    }

    public static int exemploParaInt(double a){
        return (int) a;
    }
}
