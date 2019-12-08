
public class ControleDeFluxo {

	public static void main(String[] args) {

		int idade = 10;
		String status;
		boolean ok = true;
		
		status  = idade < 15 ? "infantil" : idade >= 15 && idade < 18 ? "juvenil" : "adulto";
		System.out.println(status);
	}

}
