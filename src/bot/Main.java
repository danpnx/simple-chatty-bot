package bot;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Person botOwner = new Person();
		int index = 0;
		int chooseInvestimento;
		
		botOwner.setPersonName("Daniel Nunes");
		botOwner.setPersonAge(26);
		introduceYourself();
		botOwner.greetPerson();
		
		mostrarOpcoesInvestimentos();
		do {
			System.out.print("Faça uma escolha: ");
			chooseInvestimento = scanner.nextInt();
			botOwner.setInvestimentosPreferidos(chooseInvestimento, index);
			index++;
		} while(index < 5);
		botOwner.showInvestimentosPreferidos();
		
		scanner.close();
	}
	
	public static void introduceYourself() {
		System.out.println("Olá! O meu nome é Empy.");
		System.out.println("Estou super ansiosx para me juntar a você nesta sua jornada de crescimento financeiro.");
		System.out.println("Você pode contar comigo!");
		System.out.println();
	}
	
	public static void mostrarOpcoesInvestimentos() {
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
	}
}