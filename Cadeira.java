package Objetoeclasse;

public class Cadeira {
	String cor;  //Criando variaveis
	String tamanho;
	String material;
	String tipo;
	
	public String getCor() { //com retorno
		return cor;

	}
	public void setCor(String cor) {  //sem retorno
		this.cor = cor;  //Atribui este a String nome
	}

	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String andar() {
		return "Andando";
	}
	public String reclinar() {
		return "Reclinando";
	}
	public String abaixar() {
		return "Abaixando";
	}
	public String rodar() {
		return "Rodando";
	}
}
