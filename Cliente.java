package Objetoeclasse;

public class Cliente {
	String nome;  //Criando variaveis
	String telefone;
	String cpf;
	String rg;
	int id;

	public String getNome() { //com retorno
		return nome;

	}
	public void setNome(String nome) {  //sem retorno
		this.nome = nome;  //Atribui este a String nome
	}

	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String comprar() {
		return "Comprando";
	}
	public String reservar() {
		return "Reservando";
	}
	public String alugar() {
		return "Alugando";
	}
	public String Experimentar() {
		return "Experimentando";
	}


}