package tabuleiro;

public class Tabuleiro {
	
	private int linhas;
	private int colunas;
	private Peca[][] pecas;

	public Tabuleiro(int linhas, int colunas) {
		if (linhas < 1 || colunas < 1) {
			throw new ExcecaoTabuleiro("Erro na criação do tabuleiro, deve conter no mínimo 1 linha e 1 coluna.");
		}
		this.linhas = linhas;
		this.colunas = colunas;
		pecas = new Peca[linhas][colunas]; 
	}

	public int getLinhas() {
		return linhas;
	}

	public int getColunas() {
		return colunas;
	}
	
	public Peca peca(int linha, int coluna) {
		if (!posicaoExistente(linha, coluna)) {
			throw new ExcecaoTabuleiro("Posição não está no tabuleiro.");
		}
		return pecas[linha][coluna];
	}
	
	public Peca peca(Position posicao) {
		if (!posicaoExistente(posicao)) {
			throw new ExcecaoTabuleiro("Posição não está no tabuleiro.");
		}
		return pecas[posicao.getLinha()][posicao.getColuna()];
	}
	
	public void localDaPeca(Peca peca, Position posicao) {
		if (temUmaPeca(posicao)) {
			throw new ExcecaoTabuleiro("Já existe uma peça na posição " + posicao);
		}
		pecas[posicao.getLinha()][posicao.getColuna()] = peca;
		peca.position = posicao;
	}
	
	private boolean posicaoExistente(int linha, int coluna) {
		return linha >=0 && linha < linhas && coluna >=0 && coluna < colunas;
	}
	
	public boolean posicaoExistente(Position posicao) {
		return posicaoExistente(posicao.getLinha(), posicao.getColuna());		
	}
	
	public boolean temUmaPeca(Position posicao) {
		if (!posicaoExistente(posicao)) {
			throw new ExcecaoTabuleiro("Posição não está no tabuleiro.");
		}
		return peca(posicao) != null;
	}
}
