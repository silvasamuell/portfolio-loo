package gerenciaBanco;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Qual é o seu primeiro nome?");
		String nome = entrada.next();
		
		System.out.println("Qual é o seu sobrenome?");
		String sobrenome = entrada.next();
		
		System.out.println("Qual é o seu CPF?");
		String cpf = entrada.next();
		
		Usuario user = new Usuario(nome, sobrenome, cpf);
		
		int resposta = 0;
		
		do {
			System.out.println("O que deseja realizar hoje?");
			System.out.println("1. Consultar o saldo");
			System.out.println("2. Realizar depósito");
			System.out.println("3. Saque");
			System.out.println("4. Sair");
			resposta = entrada.nextInt();
			
			switch (resposta) {
			case 1:
				System.out.println(user.getSaldo()); break;
			case 2:
				System.out.println("Qual valor deseja depositar?");
				float valorDeposito = entrada.nextFloat();
				user.deposito(valorDeposito); break;
			case 3:
				System.out.println("Qual valor deseja sacar?");
				float valorSaque = entrada.nextFloat();
				user.saque(valorSaque); break;
			}
		}while (resposta != 4);
		
		System.out.println(user.toString());
		
		entrada.close();
	}

}
