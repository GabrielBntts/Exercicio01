
import java.util.Scanner;

public class Aluno {

    String nome;

    double nota1, nota2, nota3, resultado;

    static Scanner leitura = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("**** Olá Aluno ****");

        System.out.println("Digite o seu nome: ");
        String nome = leitura.nextLine();

        System.out.println("Digite sua nota: ");
        double nota1 = leitura.nextDouble();

        System.out.println("Digite sua nota:  ");
        double nota2 = leitura.nextDouble();

        System.out.println("Digite sua nota:  ");
        double nota3 = leitura.nextDouble();

        double resultado = nota1 + nota2 + nota3;

        System.out.println("Resultado das notas");
        System.out.println("Nome: " + nome);
        System.out.println("Média: " + resultado / 3);

    }
}
