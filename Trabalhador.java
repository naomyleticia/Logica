import java.util.Scanner;

public class Trabalhador {

	public static void main(String[] args) {

		String nome;
		String sexo;
		int idade;
		String estadoCivil;
		double salario;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("ola!!! \n digite seu nome: ");
		nome = ler.next();
		
		System.out.println("Digite sua idade: ");
		idade = ler.nextInt();
		
		System.out.println("Digite seu sexo: ");
		sexo = ler.next();
		
		System.out.println("Digite seu estado civil: ");
		estadoCivil = ler.next();
		
		System.out.println("Digite seu salario: ");
		salario = ler.nextDouble();
		
		
		System.out.println("O(a) Trabalhador(a) " + nome + " do sexo " + "\n" 
		+ sexo + "," + "idade " + idade + " estado civil " + estadoCivil + " e salario " + 
				salario);
		
	}

}
