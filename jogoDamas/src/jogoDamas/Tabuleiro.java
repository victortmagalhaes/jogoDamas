
package jogoDamas;

import java.util.ArrayList;
import java.util.List;

import jogoDamas.Peca.Cor;
import jogoDamas.Peca.Posicao;
import jogoDamas.Peca.Tipo;

public class Tabuleiro {

	private final Jogador jogadorBrancas, jogadorPretas;
	
	public Tabuleiro(Jogador jogadorBrancas, Jogador jogadorPretas) {
		
		this.jogadorBrancas = jogadorBrancas;
		
		this.jogadorPretas = jogadorPretas;
		
		resetarTabuleiro();
		
		desenharPecas();
		
	}
	
	private void resetarTabuleiro() {
		
		tabuleiro.clear();
		
		for (int i = 0; i < tabuleiroEstatico.length; i++) {
			tabuleiro.add(new StringBuilder(tabuleiroEstatico[i]));
		}
		
	}
	
	private final static short xInicialTabuleiro = 3;
	//int X final tabuleiro = 97
	private final static short yInicialTabuleiro = 2;
	// Y final tabuleiro = 41
	
	// Cada peça tem 5 linhas e 11 colunas
	
	private static final short larguraPeca = 11;
	
	private static final short alturaPeca = 5;
	
	private final static String[] tabuleiroEstatico = 
		{//          10        20        30        40        50        60        70        80        90       100 " 101 caracteres
		 // "01234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890"
			"        A           B           C           D           E           F           G           H        ", // 01
			"   ___________.___________.___________.___________.___________.___________.___________.___________   ", // 02
			"  |           |XXXXXXXXXXX|           |XXXXXXXXXXX|           |XXXXXXXXXXX|           |XXXXXXXXXXX|  ", // 03
			"  |           |XXXXXXXXXXX|           |XXXXXXXXXXX|           |XXXXXXXXXXX|           |XXXXXXXXXXX|  ", // 04
			"8 |           |XXXXXXXXXXX|           |XXXXXXXXXXX|           |XXXXXXXXXXX|           |XXXXXXXXXXX| 8", // 05
			"  |           |XXXXXXXXXXX|           |XXXXXXXXXXX|           |XXXXXXXXXXX|           |XXXXXXXXXXX|  ", // 06  
			"  |___________|XXXXXXXXXXX|___________|XXXXXXXXXXX|___________|XXXXXXXXXXX|___________|XXXXXXXXXXX|  ", // 07
			"  |XXXXXXXXXXX|           |XXXXXXXXXXX|           |XXXXXXXXXXX|           |XXXXXXXXXXX|           |  ", // 08
			"  |XXXXXXXXXXX|           |XXXXXXXXXXX|           |XXXXXXXXXXX|           |XXXXXXXXXXX|           |  ", // 09
			"7 |XXXXXXXXXXX|           |XXXXXXXXXXX|           |XXXXXXXXXXX|           |XXXXXXXXXXX|           | 7", // 10
			"  |XXXXXXXXXXX|           |XXXXXXXXXXX|           |XXXXXXXXXXX|           |XXXXXXXXXXX|           |  ", // 11
			"  |XXXXXXXXXXX|___________|XXXXXXXXXXX|___________|XXXXXXXXXXX|___________|XXXXXXXXXXX|___________|  ", // 12
			"  |           |XXXXXXXXXXX|           |XXXXXXXXXXX|           |XXXXXXXXXXX|           |XXXXXXXXXXX|  ", // 13
			"  |           |XXXXXXXXXXX|           |XXXXXXXXXXX|           |XXXXXXXXXXX|           |XXXXXXXXXXX|  ", // 14
			"6 |           |XXXXXXXXXXX|           |XXXXXXXXXXX|           |XXXXXXXXXXX|           |XXXXXXXXXXX| 6", // 15
			"  |           |XXXXXXXXXXX|           |XXXXXXXXXXX|           |XXXXXXXXXXX|           |XXXXXXXXXXX|  ", // 16
			"  |___________|XXXXXXXXXXX|___________|XXXXXXXXXXX|___________|XXXXXXXXXXX|___________|XXXXXXXXXXX|  ", // 17
			"  |XXXXXXXXXXX|           |XXXXXXXXXXX|           |XXXXXXXXXXX|           |XXXXXXXXXXX|           |  ", // 18
			"  |XXXXXXXXXXX|           |XXXXXXXXXXX|           |XXXXXXXXXXX|           |XXXXXXXXXXX|           |  ", // 19
			"5 |XXXXXXXXXXX|           |XXXXXXXXXXX|           |XXXXXXXXXXX|           |XXXXXXXXXXX|           | 5", // 20
			"  |XXXXXXXXXXX|           |XXXXXXXXXXX|           |XXXXXXXXXXX|           |XXXXXXXXXXX|           |  ", // 21
			"  |XXXXXXXXXXX|___________|XXXXXXXXXXX|___________|XXXXXXXXXXX|___________|XXXXXXXXXXX|___________|  ", // 22
			"  |           |XXXXXXXXXXX|           |XXXXXXXXXXX|           |XXXXXXXXXXX|           |XXXXXXXXXXX|  ", // 23
			"  |           |XXXXXXXXXXX|           |XXXXXXXXXXX|           |XXXXXXXXXXX|           |XXXXXXXXXXX|  ", // 24
			"4 |           |XXXXXXXXXXX|           |XXXXXXXXXXX|           |XXXXXXXXXXX|           |XXXXXXXXXXX| 4", // 25
			"  |           |XXXXXXXXXXX|           |XXXXXXXXXXX|           |XXXXXXXXXXX|           |XXXXXXXXXXX|  ", // 26
			"  |___________|XXXXXXXXXXX|___________|XXXXXXXXXXX|___________|XXXXXXXXXXX|___________|XXXXXXXXXXX|  ", // 27
			"  |XXXXXXXXXXX|           |XXXXXXXXXXX|           |XXXXXXXXXXX|           |XXXXXXXXXXX|           |  ", // 28
			"  |XXXXXXXXXXX|           |XXXXXXXXXXX|           |XXXXXXXXXXX|           |XXXXXXXXXXX|           |  ", // 29
			"3 |XXXXXXXXXXX|           |XXXXXXXXXXX|           |XXXXXXXXXXX|           |XXXXXXXXXXX|           | 3", // 30
			"  |XXXXXXXXXXX|           |XXXXXXXXXXX|           |XXXXXXXXXXX|           |XXXXXXXXXXX|           |  ", // 31
			"  |XXXXXXXXXXX|___________|XXXXXXXXXXX|___________|XXXXXXXXXXX|___________|XXXXXXXXXXX|___________|  ", // 32
			"  |           |XXXXXXXXXXX|           |XXXXXXXXXXX|           |XXXXXXXXXXX|           |XXXXXXXXXXX|  ", // 33
			"  |           |XXXXXXXXXXX|           |XXXXXXXXXXX|           |XXXXXXXXXXX|           |XXXXXXXXXXX|  ", // 34
			"2 |           |XXXXXXXXXXX|           |XXXXXXXXXXX|           |XXXXXXXXXXX|           |XXXXXXXXXXX| 2", // 35
			"  |           |XXXXXXXXXXX|           |XXXXXXXXXXX|           |XXXXXXXXXXX|           |XXXXXXXXXXX|  ", // 36
			"  |___________|XXXXXXXXXXX|___________|XXXXXXXXXXX|___________|XXXXXXXXXXX|___________|XXXXXXXXXXX|  ", // 37
			"  |XXXXXXXXXXX|           |XXXXXXXXXXX|           |XXXXXXXXXXX|           |XXXXXXXXXXX|           |  ", // 38
			"  |XXXXXXXXXXX|           |XXXXXXXXXXX|           |XXXXXXXXXXX|           |XXXXXXXXXXX|           |  ", // 39
			"1 |XXXXXXXXXXX|           |XXXXXXXXXXX|           |XXXXXXXXXXX|           |XXXXXXXXXXX|           | 1", // 40
			"  |XXXXXXXXXXX|           |XXXXXXXXXXX|           |XXXXXXXXXXX|           |XXXXXXXXXXX|           |  ", // 41
			"  |XXXXXXXXXXX|___________|XXXXXXXXXXX|___________|XXXXXXXXXXX|___________|XXXXXXXXXXX|___________|  ", // 42
			"        A           B           C           D           E           F           G           H        ", // 43
				
		};
	
	private List<StringBuilder> tabuleiro = new ArrayList<>();

	private static final String[] pedraBranca = 
		{ "XXXX   XXXX",
		  "XX       XX",
		  "X         X",
		  "XX       XX",
		  "XXXX___XXXX"};
	
	private static final String[] pedraPreta = 
		{ "    XXX    ",
		  "  XXXXXXX  ",
		  " XXXXXXXXX ",
		  "  XXXXXXX  ",
		  "____XXX____"};
	
	private static final String[] damaBranca_ = 
		{ "XXXX   XXXX",
		  "XX   D   XX",
		  "X   DDD   X",
		  "XX   D   XX",
		  "XXXX___XXXX"};
	
	private static final String[] damaBranca = 
		{ "           ",
		  "DAMA BRANCA",
		  "DAMA BRANCA",
		  "DAMA BRANCA",
		  "___________"};
	
	private static final String[] damaPreta_ = 
		{ "    DDD    ",
		  "  DDDDDDD  ",
		  " DDDDDDDDD ",
		  "  DDDDDDD  ",
		  "____DDD____"};
	
	private static final String[] damaPreta = 
		{ "           ",
		  "DAMA  PRETA",
		  "DAMA  PRETA",
		  "DAMA  PRETA",
		  "___________"};
	
	
	public void imprimir() {
		
		resetarTabuleiro();
		
		desenharPecas();
					
		for (int i = 0; i < tabuleiro.size(); i++) {
			System.out.println(tabuleiro.get(i));
		}	
		
	}
	
	public void ImprimirTabuleiroVazio() {
		
		for (int i = 0; i < tabuleiroEstatico.length; i++) {
			System.out.println(tabuleiroEstatico[i]);
		}
		
	}
	
	private void desenharPecas() {
		
		for (Peca peca : jogadorBrancas.getPecas()) {
			desenharPeca(peca);
		}
		
		for (Peca peca : jogadorPretas.getPecas()) {
			desenharPeca(peca);
		}
		
	}
	
	private void desenharPeca(Peca peca) {
		
		int x = peca.getPosicao().getX();
		
		x = x * (larguraPeca + 1) + xInicialTabuleiro;
		
		int y = 7 - peca.getPosicao().getY();
		
		y = y * alturaPeca + yInicialTabuleiro;
		
		String[] strPeca = null;
		
		if (peca.getCor() == Cor.BRANCA) {
			if (peca.getTipo() == Tipo.COMUM) {
				strPeca = pedraBranca;
			}
			else {
				strPeca = damaBranca;
			}
		}
		else {
			if (peca.getTipo() == Tipo.COMUM) {
				strPeca = pedraPreta;
			}
			else {
				strPeca = damaPreta;
			}
		}		
		
		StringBuilder sb = null;
		
		for (int i = y, j = 0 ; i < y + alturaPeca ; i++, j++) {			
			sb = tabuleiro.get(i);			
			sb.replace(x, x + larguraPeca, strPeca[j]);
		}
		
	}
	
	public void moverPeca(Posicao posicaoInicial, Posicao posicaoFinal) {
		
		Peca pecaPosicaoFinal = buscarPeca(posicaoFinal);
		
		if (pecaPosicaoFinal != null) {
			System.out.println("Impossível mover peça para a posição " + posicaoFinal + ", pois ela já está ocupada.");
			return;
		}
		
		Peca pecaMovida = buscarPeca(posicaoInicial);
		
		if (pecaMovida == null) {
			System.out.println("Não existe peça na posição " + posicaoInicial + ".");
			return;
		}
		
		pecaMovida.setPosicao(posicaoFinal);

	}
	
	private Peca buscarPeca(Peca.Posicao posicao) {
		
		for (Peca peca : jogadorBrancas.getPecas()) {
			if (peca.getPosicao().equals(posicao)) {
				return peca;
			}
		}
		
		for (Peca peca : jogadorPretas.getPecas()) {
			if (peca.getPosicao().equals(posicao)) {
				return peca;
			}
		}
		
		return null;
		
	}
	
}
