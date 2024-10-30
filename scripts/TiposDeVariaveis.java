package scripts;

import java.util.Locale;

public class TiposDeVariaveis {
    public static void main(String[] args) {

        // para garantir o ponto no print
        Locale.setDefault(Locale.US);

        int idade;
        double salario, altura;
        char genero;
        String nome;

        idade = 30;
        salario = 5800.5;
        altura = 1.72;
        genero = 'F';
        nome = "Marioa Silva";

        System.err.println("Idade = " + idade);
        System.err.println("Salario = " + salario);
        System.err.println("Altura = " + altura);
        System.err.println("Genero = " + genero);
        System.err.println("Nome = " + nome);
    };
};
