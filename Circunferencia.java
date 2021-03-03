import java.util.Scanner;

public class Circunferencia {

    double raio, diametro, lado3, lado4, resultado;

    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Digite o raio: ");
        double raio = ler.nextDouble();

        double diametro = 2 * raio;
        double resultado = Math.PI * diametro;

        System.out.println("valor do diâmetro: " + resultado);
    }
}
