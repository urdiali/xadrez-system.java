package tabuleiro;

public class ExcecaoTabuleiro extends RuntimeException {
	private static final long serialVersionUID = 1l;
	
	public ExcecaoTabuleiro(String msg) {
		super(msg);
	}

}
