package progressaoAritmetica;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProgressaoAritmetica pa = new ProgressaoAritmetica(5);
        System.out.println();

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de termos: ");
        int termo = sc.nextInt();

        for(int i = 0; i <= termo; i++) {
            System.out.println(pa.toString());
        }
    }
}