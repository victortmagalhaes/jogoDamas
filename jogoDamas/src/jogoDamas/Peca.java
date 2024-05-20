
package jogoDamas;

public class Peca {
	
	public enum Cor {
		BRANCA,
		PRETA;
	}
	
	public enum Tipo {
		COMUM,
		DAMA;
	}
	
	private final Cor cor;
	
	private Tipo tipo;
	
	private Posicao posicao;
		
	public Peca(Cor cor, Tipo tipo, short x, short y) {
		this.cor = cor;
		this.tipo = tipo;
		this.posicao = new Posicao(x, y);
	}
	
	static class Posicao {
		
		private final short x, y;
		
		private final static char[] colunas = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};
		
		public Posicao(short x, short y) {
			
			if (x > 7) {
				throw new IllegalArgumentException("Valor máximo para a coluna é 7 (sete).");
			}
			
			if (x < 0) {
				throw new IllegalArgumentException("Valor mínimo para a coluna é 0 (zero).");
			}
			
			if (y > 7) {
				throw new IllegalArgumentException("Valor máximo para a linha é 7 (sete).");
			}
			
			if (y < 0) {
				throw new IllegalArgumentException("Valor mínimo para a linha é 0 (zero).");
			}
			
			this.x = x;
			this.y = y;
		}
		
		@Override
		public String toString() {
			return "(" + colunas[x] + ", " + (y + 1) + ")";
		}
		
		@Override
		public boolean equals(Object obj) {
			
			if (obj == this) {
				return true;
			}
			
			if (!(obj instanceof Posicao)) {
				return false;
			}
			
			Posicao that = (Posicao) obj;
			
			if (this.getX() != that.getX()) {
				return false;
			}
			
			return (this.getY() == that.getY());
			
		}
		
		public short getX() {
			return x;
		}
	
		public short getY() {
			return y;
		}
		
	}
	
	@Override
	public String toString() {
		return "Peca[cor: " + this.getCor() + ", tipo: " + this.getTipo() + ", -> : " + this.posicao + "]";
	}
	
	public Cor getCor() {
		return this.cor;
	}
	
	public Tipo getTipo() {
		return this.tipo;
	}
	
	public Posicao getPosicao() {
		return this.posicao;
	}
	
	public void setPosicao(Posicao posicao) {
		this.posicao = posicao;
	}

}
