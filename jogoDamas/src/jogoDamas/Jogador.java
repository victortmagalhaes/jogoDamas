
package jogoDamas;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import jogoDamas.Peca.Cor;
import jogoDamas.Peca.Tipo;


public class Jogador {

	private final String nome;
	
	private final Peca.Cor cor;
	
	private List<Peca> pecas;
	
	public Jogador(String nome, Peca.Cor cor) {
		this.nome = nome;
		this.cor = cor;
		inicializarPosicaoPecas();
	}
	
	private void inicializarPosicaoPecas() {
		
		pecas = new ArrayList<>();
		
		if (this.cor == Cor.BRANCA) {
			inicializarPecasBrancas();
		}
		else {
			inicializarPecasPretas();
		}
		
	}
	
	private void inicializarPecasBrancas() {
		
		// Peças brancas ficam na parte de baixo do tabuleiro, tal e qual as peças do jogo de xadrez
				
		for (Short y = 0; y < 3; y++) {
			for (Short x = 0; x < 8; x++) {
				// Se for linha par...
				if (y % 2 == 0) {
					if (x % 2 == 0) {
						pecas.add(new Peca(cor, Tipo.COMUM, x, y));
					}
				} // Se for linha impar...
				else {
					if (x % 2 == 1) {
						pecas.add(new Peca(cor, Tipo.COMUM, x, y));
					}
				}
			}
		}
		
	}
	
	private void inicializarPecasPretas() {
		
		// Peças brancas ficam na parte de baixo do tabuleiro, tal e qual as peças do jogo de xadrez
		
		for (Short y = 5; y < 8; y++) {
			for (Short x = 0; x < 8; x++) {
				// Se for linha par...
				if (y % 2 == 0) {
					if (x % 2 == 0) {
						pecas.add(new Peca(cor, Tipo.COMUM, x, y));
					}
				} // Se for linha impar...
				else {
					if (x % 2 == 1) {
						pecas.add(new Peca(cor, Tipo.COMUM, x, y));
					}
				}
			}
		}
		
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public Peca.Cor getCor() {
		return this.cor;
	}
	
	public List<Peca> getPecas() {
		return Collections.unmodifiableList(pecas);
	}
	
}
