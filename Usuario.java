import java.util.Scanner;

public class Usuario {

    float a, dobro, triplo, metade, quadrado, quinta;

    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Digite o valor: ");
        float a = ler.nextFloat();

        float dobro = 2 * a;
        float triplo = 3 * dobro;
        float metade = triplo / 2;
        float quadrado = a * a;
        float quinta = dobro / 5;

        System.out.println("o dobro de: " + a + " e: " + dobro);
        System.out.println("o triplo de: " + dobro + " e: " + triplo);
        System.out.println("o metade de: " + triplo + " e: " + metade);
        System.out.println("o quadrado de: " + metade + " e: " + quadrado);
        System.out.println("a quinta de: " + dobro + " e: " + quinta);
    }

}
