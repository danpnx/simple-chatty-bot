package bot;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Person botOwner = new Person();
		int index = 0;
		int choose;
		
		botOwner.setPersonName("Daniel Nunes");
		botOwner.setPersonAge(26);
		botOwner.greetPerson();
		
		System.out.println("Escolha 5 investimentos que mais combinam com o seu perfil");
		System.out.println("1. Ações");
		System.out.println("2. CDB");
		System.out.println("3. CDI");
		System.out.println("4. Criptomoedas");
		System.out.println("5. Debêntures");
		System.out.println("6. Fundos de Investimento");
		System.out.println("7. Fundos Imobiliários");
		System.out.println("8. LCA");
		System.out.println("9. LCI");
		System.out.println("10. REITs");
		System.out.println("11. Tesouro IPCA");
		System.out.println("12. Tesouro Prefixado");
		System.out.println("13. Tesouro Selic");
		
		do {
			System.out.print("Faça uma escolha: ");
			choose = scanner.nextInt();
			botOwner.setInvestimentosPreferidos(choose, index);
			index++;
		} while(index < 5);
		
		botOwner.showInvestimentosPreferidos();
	}
}