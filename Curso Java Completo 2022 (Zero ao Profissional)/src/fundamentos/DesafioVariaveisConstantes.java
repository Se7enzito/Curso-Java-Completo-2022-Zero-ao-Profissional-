package fundamentos;

public class DesafioVariaveisConstantes {
	
	public static void main(String[] args) {
		// (f - 32) * 5/9 = C
		final double base = 32.0;
		final double divisao = 5.0/9.0;
		
		double temperaturaF = 256;
		
		double temperaturaC = (temperaturaF - base) * divisao;
		System.out.println("A temperatura é " + temperaturaC);
	}
	
	public void resolucao() {
		final double FATOR = 5.0/9.0;
		final double AJUSTE = 32;
		
		double fahrenheit = 86;
		double celsius = (fahrenheit - FATOR) * AJUSTE;
		
		System.out.println("O resultado é " + celsius + " C.");
	}

}
