package Mecanica;

public class Moto extends Automovel {
	
	public Moto(String tipo, String modelo, int ano, String placa) {
		super(tipo, modelo, ano, placa);
	}
	
	public Moto () {
	}
	
	@Override
	public void CO2(int ano) {

		if (ano >= 1940 && ano <= 1969) {
			System.out.println("\nSua moto está soltando gás carbonico acima de 5000 gCO2/km");
			System.out.println("\nCuriosidade: Nesta época, novas tecnologias foram implementadas para "
					+ "\nredução de consumo de combustível, consequentemente impactando nas emissões.");
			System.out.println("--------------------------------------------------------------------");
		} else if (ano >= 1970 && ano <= 1979) {
			System.out.println("\nSua moto está soltando gás carbonico 1500 a 4000 gCO2/km");
			System.out.println("\nCuriosidade: Nesta época a crise do petróleo obrigou os fabricantes a "
					+ "\nimplantar uma nova onda de novas soluções para reduzir o consumo.");
			System.out.println("------------------------------------------------------------");
		} else if (ano >= 1980 && ano <= 1989) {
			System.out.println("\nSua moto está soltando gás carbonico 500 a 2000 gCO2/km");
			System.out.println("\nCuriosidade: Nesta época foi início da aplicação de catalisadores em larga escala. "
					+ "\nLegislações ambientais mais rígidas e necessidade de testes de homologação "
					+ "\ntrouxeram rápida redução das emissões.");
			System.out.println("------------------------------------------------------------");
		} else if (ano >= 1990 && ano <= 1999) {
			System.out.println("\nSua moto está soltando gás carbonico 300 a 1000 gCO2/km");
			System.out.println("\nCuriosidade: Nesta época o aumento das restrições legais universalizou"
					+ "\no uso dos catalisadores e surgimento de novas tecnologias como injeção eletrônica"
					+ "\ne cabeçote multiválvulas se disseminou.");
			System.out.println("------------------------------------------------------------");
		} else if (ano >= 2000 && ano <= 2009) {
			System.out.println("\nSua moto está soltando gás carbonico 100 a 500 gCO2/km");
			System.out.println("\nCuriosidade: Nesta época a disseminação do downsizing de motores "
					+ "\ne o surgimento da motorização híbrida e elétrica contribuiu para a rápida "
					+ "\nqueda nas emissões.");
			System.out.println("------------------------------------------------------------");
		} else if (ano >= 2010) {
			System.out.println("\nSua moto está soltando gás carbonico zero a 400 gCO2/km");
			System.out.println("\nCuriosidade: Nesta época os veículos de emissão zero já são vendidos"
					+ "\nem escala comercial e os modelos a combustão se encontram em estágio tecnológico"
					+ "\navançado na maior parte do mundo. A média de emissões gira entre 130 a "
					+ "\n250 gCO2/km nos dias de hoje.");
			System.out.println("------------------------------------------------------------");
		} else {
			System.out.println("\n Coloque ano de 1940 até hoje.");
		}
	}
}
