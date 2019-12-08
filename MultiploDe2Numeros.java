
public class MultiploDe2Numeros {

	public static void main(String[] args) {

			int vezes = 0;
			for (int i = 1; i <= 1000; i++) {
				
				if(i < 3) {
					break;
				}

				else if (i % 11 == 0 && i % 13 == 0) {
					System.out.println(i);
				}
			
			}
		}

	}


