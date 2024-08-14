package Objetoeclasse;



public class ObjetoAviao {

	public static void main(String[] args) {
		Aviao aviao1 = new Aviao();//contrua para mim a partir da Classe Aviao. o objrto aviao 1
		Aviao aviao2 = new Aviao();

		//OBJETO 1
		aviao1.setNome("LZ 129 Hidenburg");
		aviao1.setCor("Laranja");
		aviao1.setEmpresa("Azul");
		aviao1.setCapacidade(85);

		//Chamando o método get() para apresentar os objetos

		System.out.println(aviao1.getNome());
		System.out.println(aviao1.getCor());
		System.out.println(aviao1.getEmpresa());
		System.out.println(aviao1.getCapacidade());
		System.out.println(aviao1.voar());

		//OBJETO 2
		aviao2.setNome("LZ 129 Hight");
		aviao2.setCor("Branco");
		aviao2.setEmpresa("Gol");
		aviao2.setCapacidade(100);

		//Chamando o método get() para apresentar os objetos

		System.out.println(aviao2.getNome());
		System.out.println(aviao2.getCor());
		System.out.println(aviao2.getEmpresa());
		System.out.println(aviao2.getCapacidade());
		System.out.println(aviao2.pousar());


	}
}
