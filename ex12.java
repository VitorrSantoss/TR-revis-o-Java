package Revisao;

import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {

        // 12. Inversão de String: Inverta uma string fornecida pelo usuário.

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite algo: ");
        String texto = sc.nextLine();

        String invertida = new StringBuilder(texto).reverse().toString();

        System.out.println(invertida);
    }
}
