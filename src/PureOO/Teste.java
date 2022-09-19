package PureOO;

import java.util.ArrayList;
import java.util.Scanner;

public class Teste {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Carro carro;
		Moto moto;

		ArrayList<Automovel> lista = new ArrayList<Automovel>();

		System.out.println("----------------------------------------------------");
		System.out.println("\t\tBem-vinde ao PureOO!!");
		System.out.println("----------------------------------------------------\n");

		int resposta = 0;

		do {
			System.out.println("\n\t\tMenu de opções");
			System.out.println("\n1 - Consultar emissão de CO2 do seu veículo");
			System.out.println("2 - Visualizar lista de veículos armazenados");
			System.out.println("0 - Sair");

			int menu = sc.nextInt();
			switch (menu) {
			case 1:
				System.out.println("\nQual o seu Veículo?");
				System.out.println("1 - Carro");
				System.out.println("2 - Moto");
				resposta = sc.nextInt();
				if (resposta == 1) {
					System.out.println("");
					System.out.println("Qual a marca do seu carro?");
					String marca = sc.next();
					System.out.println("Qual o modelo do seu carro?");
					String modelo = sc.next();
					System.out.println("Insira o ano do seu carro: ");
					int ano = sc.nextInt();
					System.out.println("Qual o número da placa do seu carro? (ABC-1234 OU ABC1D23)");
					String placa = sc.next();
					System.out.println("\n---------------------------------------------------------------");

					carro = new Carro();
					carro.setMarca(marca);
					carro.setModelo(modelo);
					carro.setAno(ano);
					carro.setPlaca(placa);
					carro.CO2(ano);
					lista.add(carro);

				} else if (resposta == 2) {
					System.out.println();
					System.out.println("Qual a marca da sua moto?");
					String marca = sc.next();
					System.out.println("Qual o modelo da sua moto?");
					String modelo = sc.next();
					System.out.println("Insira o ano da sua moto: ");
					int ano = sc.nextInt();
					System.out.println("Qual o número da placa da sua moto? (ABC-1234 OU ABC1D23) ");
					String placa = sc.next();
					System.out.println("---------------------------------------------------------------");

					moto = new Moto();
					moto.setMarca(marca);
					moto.setModelo(modelo);
					moto.setAno(ano);
					moto.setPlaca(placa);
					moto.CO2(ano);
					lista.add(moto);
				} else {
					System.out.println("Opção Invalida!!!");
				}
				break;
				
			case 2:
				if (lista.size() == 0) {
					System.out.println("----------------------------------------------------");
					System.out.println("\tNão há nenhum veículo armazenado!");
					System.out.println("----------------------------------------------------");
					resposta = 1;
				}
				for (Automovel auto : lista) {
					System.out.println(auto.toString());
					System.out.println();
				}
				break;

			case 0:
				System.out.println("----------------------------------------------------");
				System.out.println("   Muito obrigada por utilizar o nosso sistema.");
				System.out.println("----------------------------------------------------");
				System.exit(0);
				break;

			default:
				System.out.println("----------------------------------------------------");
				System.out.println("Opção inválida!!");
				System.out.println("----------------------------------------------------");
			}

		} while (resposta != 0);
	}
}
