package scripts;

import java.util.Scanner;

public class EntradaDeDados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();
        
        System.out.print("Digite seu nome completo: ");
        // limpeza de buffer
        sc.nextLine();
        String nome = sc.nextLine();

        System.out.println(
            String.format("Nome: %s, Idade: %d", nome, idade)
        );

        // boa pratica
        sc.close();
    }
}
