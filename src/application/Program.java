package application;

import xadrez.PartidaDeXadrez;

public class Program {
	
	public static void main(String[] args) {
		
		PartidaDeXadrez partidaDeXadrez = new PartidaDeXadrez();
		IU.printTabuleiro(partidaDeXadrez.getPecas());			
	}
}
