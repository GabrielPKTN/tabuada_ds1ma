package br.dev.gabriellacerda.tabuada;

import br.dev.gabriellacerda.tabuada.model.Tabuada;

public class main {
	public static void main(String[] args) {
		Tabuada tabuada = new Tabuada();
		
		tabuada.setMultiplicando(2);
		tabuada.setMinimoMultiplicador(1);
		tabuada.setMaximoMultiplicador(10);
		tabuada.mostrarTabuada();
		
		Tabuada tabuada2 = new Tabuada();
		
		tabuada2.setMultiplicando(8423123);
		tabuada2.setMinimoMultiplicador(1);
		tabuada2.setMaximoMultiplicador(10);
		tabuada2.mostrarTabuada();
	}
}
