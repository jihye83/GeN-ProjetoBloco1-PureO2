package Mecanica;

public abstract class Automovel {

	private String tipo;
	private String modelo;
	private int ano;
	private String placa;

	public abstract void CO2(int ano);

	public Automovel() {
		
	}
	
	public Automovel(String tipo, String modelo, int ano, String placa) {
		this.tipo = tipo;
		this.modelo = modelo;
		this.ano = ano;
		this.placa = placa;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	@Override
	public String toString() {
		return "Tipo: " + getTipo() + "Modelo: " + getModelo() + "\nAno: " + getAno() + "\nPlaca: " + getPlaca();
	}
}
