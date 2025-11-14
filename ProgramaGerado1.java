public class ProgramaGerado {
	public static void main(String[] args) {

		// Setup for keyboard input (scanf)
		java.util.Scanner scanner = new java.util.Scanner(System.in);

		int num;
		int i;
		boolean isPrime;
		double d;

		d = 123.45;
		System.out.println("Digite um numero inteiro para verificar se e primo:");
		num = scanner.nextInt();
		isPrime = true;
		i = 2;
		if (num <= 1) {
			isPrime = false;
		} else {
			while (i < num) {
			if (num % i == 0) {
			isPrime = false;
		}
			i = i + 1;
		}
		}
		if (isPrime == true) {
			System.out.println("O numero " + num + " e primo!");
		} else {
			System.out.println("O numero " + num + " NAO e primo.");
		}
		if (num == 2) {
			System.out.println("(Lembrando: 2 e o unico primo par!)");
		}
		System.out.println("Variavel double de teste: " + d);

		// Close the scanner at the end
		scanner.close();
	}
}
