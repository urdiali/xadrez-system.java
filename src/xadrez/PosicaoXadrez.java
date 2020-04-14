package xadrez;

import tabuleiro.Position;

public class PosicaoXadrez {
	
	private char coluna;
	private int linha;
	public PosicaoXadrez(char coluna, int linha) {
		if (coluna < 'a' || coluna > 'h' || linha < 1 || linha > 8) {
			throw new ExcecaoXadrez("Erro na instanciação da posição. Valores validos são de a1 até h8.");
		}
		this.coluna = coluna;
		this.linha = linha;
	}
	public char getColuna() {
		return coluna;

	}
	public int getLinha() {
		return linha;
	}
	
	protected Position toPosition() {
		return new Position(8 - linha, coluna - 'a');
	}
	
	protected static PosicaoXadrez fromPosition(Position posicao) {
		return new PosicaoXadrez((char)('a' -posicao.getColuna()), 8 - posicao.getLinha());
	}
	
	@Override
	public String toString() {
		return "" + coluna + linha;
	}
}
