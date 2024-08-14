package Objetoeclasse;

public class Aviao {

	String nome;
	String cor;
	String empresa;
	int capacidade;

	public String getNome() { //com retorno
		return nome;

	}
	public void setNome(String nome) {  //sem retorno
		this.nome = nome;  //Atribui este a String nome
	}

	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	public int getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	public String voar() {
		return "Voando";
	}
	public String pousar() {
		return "Pousando";
	}
	public String planando() {
		return "Planar";
	}
}



