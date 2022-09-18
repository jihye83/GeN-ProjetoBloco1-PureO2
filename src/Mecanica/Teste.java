package Mecanica;

import java.util.ArrayList;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Carro carro;
		Moto moto;
		
		ArrayList<Automovel> lista= new ArrayList();
		
		System.out.println("\t\t--------------------------------------");
		System.out.println("\t\t\tBem vinde ao PureOO!!");
		System.out.println("\t\t--------------------------------------\n");
		
		
		int resposta = 0;
		do {
			
		 System.out.println("\nMenu de opções");
		 System.out.println("(1) Calcular emissão de CO2");
		 System.out.println("(2) Visualizar lista de veículos armazenados");
		 System.out.println("(0) Sair");
		 int j = sc.nextInt();
			
			
		switch (j) {
		
		case 1:
			
			System.out.println("Qual o seu Veículo?");
			System.out.println("(1) Carro");
			System.out.println("(2) Moto");
			resposta = sc.nextInt();

			if (resposta == 1) {
				System.out.println("");
				System.out.println("Insira a marca do seu carro?");
				String modelo = sc.next();
				System.out.println("Insira o ano do seu carro?");
				int ano = sc.nextInt();
				System.out.println("Insira o número da placa do seu carro?");
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
				System.out.println();
				System.out.println("Insira a marca da sua moto?");
				String modelo = sc.next();
				System.out.println("Insira o ano da sua moto");
				int ano = sc.nextInt();
				System.out.println("Insira a placa da sua moto?");
				String placa = sc.next();
				System.out.println("---------------------------------------------------------------");
				
				moto = new Moto();
				moto.setTipo(modelo);
				moto.setAno(ano);
				moto.setPlaca(placa);
				moto.CO2(ano);
				lista.add(moto);
			
			}
				
		
			case 2:
			for(Automovel auto: lista) {
		
				System.out.println(auto.toString());
				System.out.println();
		}
		break;
		
		case 0:
			System.out.println("Muito obrigada por utilizar o nosso sistema.");
			System.exit(0);
		break;	
		default: 
			System.out.println("Opção inválida!!");	
			
		}	
		
		}	while(resposta!=0);
		
	
}
}