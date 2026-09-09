import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class TesteStream{
	public static void main(String args[]){
		List<Integer> list = new ArrayList<Integer>();


		list = Arrays.asList(1,2,3,4,5,6,7,8,9,9,9,9,9,9,9,8,7,6,5,4,3,2,1);
		
		list.stream() // transformo para um "fluxo de dados"
			.distinct() // elimina as duplicadas
			//.skip(n)   // pula n elementos
			//.limit(n) // seleciona os n primeiros elementos  
			.filter(e -> e % 2 == 0)   
			//.map(e -> e * 10)
			.forEach(e -> System.out.println(e));



		//Long contador = list.stream()
		//						.count();

		//System.out.println("Numero de elementos " + contador);

		Integer soma = list.stream()
						   .filter(e -> e % 2 == 0)
						   .distinct()
						   .mapToInt(Integer::intValue)
						   .sum();

		System.out.println("Valor da soma = " + soma);
	}
}