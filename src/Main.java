
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		String entrada = " ";
		List<String> vetor = new ArrayList<>();
		System.out.println("Ol�, digite o os numeros que comp�e o vetor de permuta��o.");
		System.out.println("Digitando os n�meros e enter, vazio para sair:");

		while (!entrada.equals("")) {

			entrada = leia.nextLine();

			if (!entrada.equals("")) {
				if (vetor.contains(entrada)) {
					System.out.println("N�o pode repetir n�meros!!");
				} else {
					vetor.add(entrada);
				}

			}
		}

		System.out.println(vetor.toString() + "\n#######################\n");

		List<String> vetorImpressao = new ArrayList<>();
		
		permuta(vetorImpressao, vetor);

		System.out.println("\n#######################");
		System.out.println("Programa encerrado!\n");
		leia.close();
 	}

	private static void permuta(List<String> vetorImpresso, List<String> vetor) {
		
		if (vetorImpresso.size() < vetor.size()){
			
			for (int j = 0; j < vetor.size(); j++) {

				if (!vetorImpresso.contains(vetor.get(j))) {

					vetorImpresso.add(vetor.get(j));
					permuta(vetorImpresso, vetor);
					vetorImpresso.remove(vetorImpresso.size()-1);
					
				}
				
			}
			
		}else if(vetorImpresso.size() == vetor.size()){

			System.out.println(vetorImpresso.toString());

		}

	}
}
