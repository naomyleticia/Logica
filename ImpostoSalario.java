
public class ImpostoSalario {

	public static void main(String[] args) {
	String imposto;
	double salario = 3000;

	if (salario < 1000) {
	System.out.println(salario * 0.5);	

	} else if(salario >= 1000 && salario < 2000) {
		System.out.println(salario * 0.1);
	} else if(salario >= 2000 && salario < 4000 ) {
		System.out.println(salario * 0.15);
	} else {
		System.out.println(salario * 0.20);
	}

}
}
