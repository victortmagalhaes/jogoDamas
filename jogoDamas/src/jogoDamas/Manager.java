
package jogoDamas;

import jogoDamas.Peca.Cor;
import jogoDamas.Peca.Posicao;

public class Manager {
	
	public static void main(String[] args) {
		
		Jogador jogadorBrancas = new Jogador("João", Cor.BRANCA);
		
		Jogador jogadorPretas = new Jogador("Maria", Cor.PRETA);
		
		Tabuleiro tabuleiro = new Tabuleiro(jogadorBrancas, jogadorPretas);
		
		Posicao posicaoInicial = new Posicao((short)6, (short)2);
		
		Posicao posicaoFinal = new Posicao((short)7, (short)3);
		
		tabuleiro.moverPeca(posicaoInicial, posicaoFinal);
		
		posicaoInicial = new Posicao((short)7, (short)5);
		
		posicaoFinal = new Posicao((short)6, (short)4);
		
		tabuleiro.moverPeca(posicaoInicial, posicaoFinal);
		
		tabuleiro.imprimir();
		
		// tabuleiro.ImprimirTabuleiroVazio();
		
	}

}
