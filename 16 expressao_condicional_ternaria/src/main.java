
public class main {

	public static void main(String[] args) {
		/*Sintaxe:
			( condição ) ? valor_se_verdadeiro : valor_se_falso
			
			Exemplos:
				( 2 > 4 ) ? 50 : 80 >> 80
				( 10 != 3 ) ? "Maria" : "Alex" >> "Maria"*/
		
		double preco = 34.5;
		double desconto;
		
		if (preco < 20.0) {
			desconto = preco * 0.1;
		} 
		else {
			desconto = preco * 0.05;
		}

		System.out.println("Desconto if: " + desconto);
		
		//double preco = 34.5;
		double desconto_t = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
		
		System.out.println("Desconto expressão condicional ternária: " + desconto_t);
		
	}

}
