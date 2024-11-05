import java.util.Scanner;
public class Exercicio_carro {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o custo de fabrica carro novo: ");
		double custo = scanner.nextDouble();
		
		double porcentualDistribuidor=28.0/100.0;
		double porcentualImpostos = 45.0/100.0;
		
		double valorDistribuidor = custo*porcentualDistribuidor;
		double valorImpostos = custo*porcentualImpostos;
		
		double custoFinal = custo + valorDistribuidor + valorImpostos;
		
		System.out.printf("O custo é: R$%.2f%n", custoFinal);
		
		scanner.close();
		
		
		
		
		

	}

}
