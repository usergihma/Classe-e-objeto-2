package Objetoeclasse;

public class ObjetoCliente {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente();//contrua para mim a partir da Classe Aviao. o objrto aviao 1
		Cliente cliente2 = new Cliente();

		//OBJETO 1
		System.out.println("----------------Cliente 1----------------"); //Chamando o método set() para adicionar os objetos
		cliente1.setNome("Giovanna Machado Vieira Cezario");//inserir
		cliente1.setTelefone("997040653");
		cliente1.setCpf("111 222 333 44");
		cliente1.setRg("5556667");
		cliente1.setId(12345);

		//Chamando o método get() para apresentar os objetos

		System.out.println(cliente1.getNome());
		System.out.println(cliente1.getTelefone());
		System.out.println(cliente1.getCpf());
		System.out.println(cliente1.getRg());
		System.out.println(cliente1.getId());
		System.out.println(cliente1.comprar());

		//OBJETO 2
		System.out.println("----------------Cliente 2----------------");
		cliente2.setNome("Maria Julia Aparecida Américo França");//inserir
		cliente2.setTelefone("15 993722644");
		cliente2.setCpf("455 566 677 89");
		cliente2.setRg("9900011");
		cliente2.setId(0123);

		System.out.println(cliente2.getNome());
		System.out.println(cliente2.getTelefone());
		System.out.println(cliente2.getCpf());
		System.out.println(cliente2.getRg());
		System.out.println(cliente2.getId());
		System.out.println(cliente2.reservar());
	}

}
