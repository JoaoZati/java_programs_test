package scripts;

public class SaidaDeDados {
    public static void main(String[] args) {
        System.out.println("Bom Dia");
        System.out.println("Boa Noite");

        int x, y;
        double z, division;

        x = 25;
        y = 10;
        z = 2.3456000;

        division = (double) x / y;

        System.out.println(x);
        System.out.println(y);

        System.out.println(String.format("%.2f", z));
        System.out.println(String.format("Divisao de: %.2f", division));

        int idade;
        double salario, altura;
        char genero;
        String nome;

        idade = 30;
        salario = 5800.5;
        altura = 1.72;
        genero = 'F';
        nome = "Maria Silva";

        System.out.println(
            String.format(
                "A funcionaria %s, de sexo %s, ganha %.2f e tem %d anos",
                nome,
                genero,
                salario,
                idade,
                altura
            )
        );
    }
}
