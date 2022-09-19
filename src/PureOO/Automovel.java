package PureOO;

public abstract class Automovel {
	//atributos
	private String marca;
	private String modelo;
	private int ano;
	private String placa;
	//metodo emitir Co2
	public abstract void CO2(int ano);
	//construtor vazio
	public Automovel() {
	}

	public Automovel(String marca, String modelo, int ano, String placa) {
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.placa = placa;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
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
		return "Marca: " + getMarca() + "\nModelo: " + getModelo() + "\nAno: " + getAno() + "\nPlaca: " + getPlaca();
	}
}
