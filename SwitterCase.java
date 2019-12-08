import java.util.Scanner;


public class SwitterCase {

	public static void main(String[] args) {

		String diaDaSemana;
		Scanner ler = new Scanner(System.in);

		System.out.println("Digite o dia da semana: ");
		diaDaSemana = ler.next();

		switch (diaDaSemana) {
		case "1":
			System.out.println("Domingo \n Final de semana");
			break;
		case "2":
			System.out.println("Segunda \n Dia da semana");
			break;
		case "3":
			System.out.println("Terça \n Dia da semana");
			break;
		case "4":
			System.out.println("Quarta \n Dia da semana");
			break;
		case "5":
			System.out.println("Quinta \n Dia da semana");
			break;
		case "6":
			System.out.println("Sexta \n Dia da semana");
			break;
		case "7":
			System.out.println("Sabado \n Final de semana");
			break;
			default:
				System.out.println("não é uma dia da semana");

		}
	}

}
