package Objetoeclasse;

public class ObjetoAnimal {

	public static void main(String[] args) {
		Animal animal1 = new Animal();//contrua para mim a partir da Classe Aviao. o objrto aviao 1
		Animal animal2 = new Animal();
		Animal animal3 = new Animal();
		Animal animal4 = new Animal();
		Animal animal5 = new Animal();
		Animal animal6 = new Animal();
		Animal animal7 = new Animal();

		//OBJETO 1
		System.out.println("----------------Animal 1----------------");
		animal1.setEspecie("Vaca");//inserir
		animal1.setNome("Mimi");
		animal1.setCor("Marrom");
		animal1.setSom("Mu");

		//Chamando o método get() para apresentar os objetos

		System.out.println(animal1.getEspecie());
		System.out.println(animal1.getNome());
		System.out.println(animal1.getCor());
		System.out.println(animal1.getSom());
		System.out.println(animal1.comer());

		//OBJETO 2
		System.out.println("----------------Animal 2----------------");
		animal2.setEspecie("Bezerro");
		animal2.setNome("Lucas");
		animal2.setCor("Branco e preto");
		animal2.setSom("Mu");

		System.out.println(animal2.getEspecie());
		System.out.println(animal2.getNome());
		System.out.println(animal2.getCor());
		System.out.println(animal2.getSom());
		System.out.println(animal2.dormir());

		//OBJETO 3
		System.out.println("----------------Animal 3----------------");
		animal3.setEspecie("Cabra");
		animal3.setNome("Zezé");
		animal3.setCor("Bege");
		animal3.setSom("Béh");

		System.out.println(animal3.getEspecie());
		System.out.println(animal3.getNome());
		System.out.println(animal3.getCor());
		System.out.println(animal3.getSom());
		System.out.println(animal3.andar());

		//OBJETO 4
		System.out.println("----------------Animal 4----------------");
		animal4.setEspecie("Cachorro");
		animal4.setNome("Serena");
		animal4.setCor("Branco e marrom");
		animal4.setSom("Auau");

		System.out.println(animal4.getEspecie());
		System.out.println(animal4.getNome());
		System.out.println(animal4.getCor());
		System.out.println(animal4.getSom());
		System.out.println(animal4.dormir());

		//OBJETO 5
		System.out.println("----------------Animal 5----------------");
		animal5.setEspecie("Coelho");
		animal5.setNome("Pompom");
		animal5.setCor("Branco");
		animal5.setSom("--");

		System.out.println(animal5.getEspecie());
		System.out.println(animal5.getNome());
		System.out.println(animal5.getCor());
		System.out.println(animal5.getSom());
		System.out.println(animal5.dormir());

		//OBJETO 6
		System.out.println("----------------Animal 6----------------");
		animal6.setEspecie("Galinha/Galo");
		animal6.setNome("José");
		animal6.setCor("Malhado");
		animal6.setSom("Cócoricó");

		System.out.println(animal6.getEspecie());
		System.out.println(animal6.getNome());
		System.out.println(animal6.getCor());
		System.out.println(animal6.getSom());
		System.out.println(animal6.andar());

		//OBJETO 7
		System.out.println("----------------Animal 7----------------");
		animal7.setEspecie("Pintinho");
		animal7.setNome("Piu");
		animal7.setCor("Amarelo");
		animal7.setSom("piupiu");

		System.out.println(animal7.getEspecie());
		System.out.println(animal7.getNome());
		System.out.println(animal7.getCor());
		System.out.println(animal7.getSom());
		System.out.println(animal7.andar());
	}
}