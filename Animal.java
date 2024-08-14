package Objetoeclasse;

public class Animal {
	String nome;
	String cor;
	String som;
	String especie;

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
	public String getSom() {
		return som;
	}
	public void setSom(String som) {
		this.som = som;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public String andar() {
		return "Andando";
	}
	public String comer() {
		return "Comendo";
	}
	public String dormir() {
		return "Dormindo";
	}
	public String cantar() {
		return "Cantando";
	}


}