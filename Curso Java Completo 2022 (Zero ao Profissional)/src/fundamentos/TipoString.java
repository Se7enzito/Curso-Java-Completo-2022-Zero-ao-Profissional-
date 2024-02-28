package fundamentos;

public class TipoString {

	public static void main(String[] args) {
		System.out.println("Olá pessoa".charAt(2));

		String s = "Boa Tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.startsWith("b"));
		System.out.println(s.endsWith("Tarde"));

		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 1234.21;

		System.out.printf("O senhor %s %s tem %d anos e ganha %a", nome, sobrenome, idade, salario);
	}

}
