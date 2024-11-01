import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scam = new Scanner(System.in);
        int[] num = new int[10];

        for (int i = 0; i < num.length; i++) {
            System.out.print("Digite o "+(i+1)+"ª numero: ");
            num[i] = scam.nextInt();
        }

        System.out.println("O numeros pares são: ");

        for (int i = 0; i < num.length; i++) {

            if (num[i] % 2 == 0) {
                System.out.print(num[i] + " ");
            }
        }
    }
}
