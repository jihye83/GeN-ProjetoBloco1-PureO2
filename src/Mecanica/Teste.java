package Mecanica;

import java.util.ArrayList;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Carro carro;
		Moto moto;
		
		ArrayList<Automovel> lista= new ArrayList();
		
		int resposta;
		do {
			System.out.println("Qual o seu Veiculo?");
			System.out.println("(1) Carro");
			System.out.println("(2) Moto");
			System.out.println("(0) Sair");
			resposta = sc.nextInt();

			if (resposta == 1) {
				System.out.println("");
				System.out.println("Qual o modelo do seu carro?");
				String modelo = sc.next();
				System.out.println("Qual o ano do seu carro?");
				int ano = sc.nextInt();
				System.out.println("Qual o numero da placa do seu carro?");
				String placa = sc.next();
				System.out.println("---------------------------------------------------------------");
				//
				carro = new Carro();
				//carro.setTipo(carro);
				carro.setModelo(modelo);
				carro.setAno(ano);
				carro.setPlaca(placa);
				carro.CO2(ano);
				lista.add(carro);

			}
			if (resposta == 2) {
				System.out.println("");
				System.out.println("Qual o modelo da sua moto?");
				String modelo = sc.next();
				System.out.println("Qual o ano da sua moto");
				int ano = sc.nextInt();
				System.out.println("Qual o numero da placa da sua moto?");
				String placa = sc.next();
				System.out.println("---------------------------------------------------------------");
				//
				moto = new Moto();
				//moto.setTipo(moto);
				moto.setModelo(modelo);
				moto.setAno(ano);
				moto.setPlaca(placa);
				moto.CO2(ano);
				lista.add(moto);

			} if (resposta == 0) {
				System.out.println("Saindo...");
			} 
			
			else if (resposta != 1 && resposta != 2 && resposta != 3) {
				System.out.println("Opção InvalAAida!!!");
			}
			
			
			

		} while (resposta != 0);
		
		int resposta2;
		do {
			System.out.println("Você deseja ver a sua lista de veiculos armazenados?");
			System.out.println("(1) sim");
			System.out.println("(2) nao");
			resposta2 = sc.nextInt();
			switch(resposta2) {
			case 1:
				for(Automovel auto: lista) {
					System.out.println(auto.toString());
					System.out.println();
				}
				break;
			case 2:
				System.out.println("Muito obrigada por utilizar o nosso sistema.");
			}
			
		} while (resposta2 != 2);

	}

}
