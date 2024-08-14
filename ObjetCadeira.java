package Objetoeclasse;

public class ObjetCadeira {

		public static void main(String[] args) {
			Cadeira cadeira1 = new Cadeira();//contrua para mim a partir da Classe Aviao. o objrto aviao 1
			Cadeira cadeira2 = new Cadeira();
			
			//OBJETO 1
			System.out.println("----------------Cadeira 1:----------------"); //Chamando o método set() para adicionar os objetos
			cadeira1.setCor("Preta");//inserir
			cadeira1.setTamanho("Média");
			cadeira1.setMaterial("De couro");
			cadeira1.setTipo("De escritório");
			
			//Chamando o método get() para apresentar os objetos

			System.out.println(cadeira1.getCor());
			System.out.println(cadeira1.getTamanho());
			System.out.println(cadeira1.getMaterial());
			System.out.println(cadeira1.getTipo());
			System.out.println(cadeira1.reclinar());
			
			
			//OBJETO 2
			System.out.println("----------------Cadeira 2:----------------"); //Chamando o método set() para adicionar os objetos
			cadeira2.setCor("Branca e vermelha");//inserir
			cadeira2.setTamanho("Média");
			cadeira2.setMaterial("De couro");
			cadeira2.setTipo("Gamer");
			
			//Chamando o método get() para apresentar os objetos

			System.out.println(cadeira2.getCor());
			System.out.println(cadeira2.getTamanho());
			System.out.println(cadeira2.getMaterial());
			System.out.println(cadeira2.getTipo());
			System.out.println(cadeira2.andar());



	}

}
