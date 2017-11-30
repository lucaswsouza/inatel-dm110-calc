package br.inatel.dm110.impl;

import br.inatel.dm110.api.CalculadoraService;
import br.inatel.dm110.api.Resultado;

public class CalculadoraServiceImpl implements CalculadoraService {
	
		@Override
		public Resultado soma(int numberOne, int numberTwo) {
			
			int total = numberOne + numberTwo;
			
			Resultado result = new Resultado();
			result.setNumberOne(numberOne);
			result.setNumberTwo(numberTwo);
			result.setResultado(total);
			
			return result;
		}

		@Override
		public Resultado subtracao(int numberOne, int numberTwo) {
			
			int total = numberOne - numberTwo;
			
			Resultado result = new Resultado();
			result.setNumberOne(numberOne);
			result.setNumberTwo(numberTwo);
			result.setResultado(total);
			
			return result;
		}

}
