package xadrez;

import tabuleiro.Position;
import tabuleiro.Tabuleiro;
import xadrez.pecas.Rei;
import xadrez.pecas.Torre;

public class PartidaDeXadrez {
	
	private Tabuleiro tabuleiro; 
	
	public PartidaDeXadrez() {
		tabuleiro = new Tabuleiro(8, 8);
		initialSetup();
	}
	
	public PecaDeXadrez[][] getPecas() {
		PecaDeXadrez[][] mat = new PecaDeXadrez[tabuleiro.getLinhas()][tabuleiro.getColunas()];
		for (int i=0; i<tabuleiro.getLinhas(); i++) {
			for (int j=0; j<tabuleiro.getColunas(); j++) {
				mat[i][j] = (PecaDeXadrez) tabuleiro.peca(i, j);
			}
		}
		return mat;
	}
	
	private void initialSetup() {
		tabuleiro.localDaPeca(new Torre(tabuleiro, Cor.WHITE), new Position(2, 1));
		tabuleiro.localDaPeca(new Rei(tabuleiro, Cor.BLACK), new Position(0, 4));
		tabuleiro.localDaPeca(new Rei(tabuleiro, Cor.WHITE), new Position(7, 4));
	}

}
