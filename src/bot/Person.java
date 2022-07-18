package bot;

public class Person {
	
	private String personName;
	public void setPersonName(String name) {
		this.personName = name;
	}
	public String getPersonName() {
		return personName;
	}
	
	private int personAge;
	public void setPersonAge(int age) {
		this.personAge = age;
	}
	public int getPersonAge() {
		return personAge;
	}
	
	private String[] investimentosPreferidos = new String[5];
	public void setInvestimentosPreferidos(int escolha, int index) {
		switch(escolha) {
		case 1: {
				this.investimentosPreferidos[index] = "Ações";
				break;
			}
		case 2: {
			this.investimentosPreferidos[index] = "CDB";
			break;
			}
		case 3: {
			this.investimentosPreferidos[index] = "CDI";
			break;
			}
		case 4: {
			this.investimentosPreferidos[index] = "Criptomoedas";
			break;
			}
		case 5: {
			this.investimentosPreferidos[index] = "Debêntures";
			break;
			}
		case 6: {
			this.investimentosPreferidos[index] = "Fundos de Investimento";
			break;
			}
		case 7: {
			this.investimentosPreferidos[index] = "Fundos Imobiliários";
			break;
			}
		case 8: {
			this.investimentosPreferidos[index] = "LCA";
			break;
			}
		case 9: {
			this.investimentosPreferidos[index] = "LCI";
			break;
			}
		case 10: {
			this.investimentosPreferidos[index] = "REITs";
			break;
			}
		case 11: {
			this.investimentosPreferidos[index] = "Tesouro IPCA";
			break;
			}
		case 12: {
			this.investimentosPreferidos[index] = "Tesouro Prefixado";
			break;
			}
		case 13: {
			this.investimentosPreferidos[index] = "Tesouro Selic";
			break;
			}
		}
	}
	public String[] getInvestimentosPreferidos() {
		return investimentosPreferidos;
	}
	
	public void greetPerson() {
		System.out.printf("Hi, %s. Have a nice day!%n", personName);
	}
	
	public void showInvestimentosPreferidos() {
		System.out.println("Os seus investimentos preferidos são: ");
		for(int i = 0; i < investimentosPreferidos.length; i++) {
			if (i == investimentosPreferidos.length -1) {
				System.out.print(investimentosPreferidos[i] + ".");
			} else {
				System.out.print(investimentosPreferidos[i] + ", ");
			}
		}
	}
}