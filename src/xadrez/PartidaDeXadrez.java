package xadrez;

import java.awt.Color;

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
	
	private void novaPosicao(char coluna, int linha, PecaDeXadrez peca) {
		tabuleiro.localDaPeca(peca, new PosicaoXadrez(coluna, linha).toPosition());
	}
	
	private void initialSetup() {
		novaPosicao('c', 1, new Torre(tabuleiro, Cor.WHITE));
		novaPosicao('c', 2, new Torre(tabuleiro, Cor.WHITE));
		novaPosicao('d', 2, new Torre(tabuleiro, Cor.WHITE));
		novaPosicao('e', 2, new Torre(tabuleiro, Cor.WHITE));
		novaPosicao('e', 1, new Torre(tabuleiro, Cor.WHITE));
		novaPosicao('d', 1, new Rei(tabuleiro, Cor.WHITE));

		novaPosicao('c', 1, new Torre(tabuleiro, Cor.BLACK));
		novaPosicao('c', 2, new Torre(tabuleiro, Cor.BLACK));
		novaPosicao('d', 2, new Torre(tabuleiro, Cor.BLACK));
		novaPosicao('e', 2, new Torre(tabuleiro, Cor.BLACK));
		novaPosicao('e', 1, new Torre(tabuleiro, Cor.BLACK));
		novaPosicao('d', 1, new Rei(tabuleiro, Cor.BLACK));
	}

}
