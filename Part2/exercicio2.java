package Part2;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) throws Exception {
        try (Scanner valor = new Scanner(System.in)) {
            Aluno b = new Aluno();
            boolean x = false;

            while (x == false) {
                System.out.println("Informe a data da matricula(dd/mm/yyyy): ");
                String data = valor.nextLine();

                System.out.println("Informe o nome do aluno: ");
                String Nome = valor.nextLine();

                System.out.println("Informe a nota da 1º prova: ");
                double n1 = valor.nextDouble();

                System.out.println("Informe a nota da 2º prova: ");
                double n2 = valor.nextDouble();

                System.out.println("Informe a nota do trabalho: ");
                double trab = valor.nextDouble();

                if (n1 > 2.5 || n1 > 2.5 || trab > 2) {
                    System.out.println("Valores acimas dos aceitaveis!");
                } else if (n1 < 0 || n1 < 0 || trab < 0) {
                    System.out.println("Valores abaixos dos aceitaveis!");
                }

                b.Matric = data;
                b.Name = Nome;
                b.n1 = n1;
                b.n2 = n2;
                b.trab = trab;

                System.out.println("Matricula: "+b.Matric+"\nNome: "+b.Name);

                if (b.media() >= 7) {
                    System.out.println("Aluno não ficara de recuperação");
                } else {
                    System.out.println("Aluno de recuperação, necessitando de: "+b.Final());
                }

                x = true;
            }
        }
    }
}