import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Aula 03");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int inteiro1 = scanner.nextInt();

        System.out.print("Digite outro número inteiro: ");
        int inteiro2 = scanner.nextInt();

        scanner.close();

        if (inteiro1 > inteiro2) {
            System.out.println("O maior número é " + inteiro1);
        } else if  (inteiro1 < inteiro2) {
            System.out.println("O maior número é " + inteiro2);
        } else {
            System.out.println("Os números são iguais!");
        }

    }
}