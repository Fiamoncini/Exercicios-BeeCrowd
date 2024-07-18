import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        DecimalFormat ftd = new DecimalFormat("0.0");
        Scanner notas = new Scanner(System.in);
        float nota1 = notas.nextFloat();
        float nota2 = notas.nextFloat();
        float nota3 = notas.nextFloat();
        float nota4 = notas.nextFloat();
        float peso1 = nota1 * 2;
        float peso2 = nota2 * 3;
        float peso3 = nota3 * 4;
        float peso4 = nota4;
        double media = (peso1 + peso2 + peso3 + peso4) / 10;
        System.out.println("Media: " + ftd.format(media));
        if (media >= 7) {
        	System.out.println("Aluno aprovado.");
        } else if (media < 7 && media >= 5) {
        	System.out.println("Aluno em exame.");
        	double NExame = notas.nextDouble();
			System.out.println("Nota do exame: " + ftd.format(NExame));
        	media = (media + NExame) / 2;
        	if (media >= 5) {
            	System.out.println("Aluno aprovado.");
        	} else {
            	System.out.println("Aluno reprovado.");
        	}
			System.out.println("Media final: " + ftd.format(media));
        } else {
        	System.out.println("Aluno reprovado.");
        }
	}
	
}
