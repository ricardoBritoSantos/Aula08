	/*É muito comum que programas que realizam cadastros de pessoas precisem validar a sigla do estado a que elas pertencem.
Crie uma função que receba uma String contendo a sigla de um estado e 
verifique se esse estado existe ou não. 
Caso exista, a função deve retornar um boolean true. 
Caso não exista, ele deve retornar um boolean false.
A main do seu programa deve conter a digitação do estado, a chamada da função e a 
exibição de uma mensagem para afirmar se o estado existe ou não, dependendo do que a função retornar.

	 * */

import java.util.Scanner;

public class Desafio01 {
	
	public static boolean validarSigla(String sigla) {
		//		
		String[] estados = new String[]{"AC" , "AL" , "AP" , "AM" , "BA" , "CE" , "ES" , "GO" , "MA" , "MT" , "MS" , "MG" , "PA" , "PB" , "PR" , "PE" , "PI" , "RJ" , "RN" , "RS" , "RO" , "RR" , "SC" , "SP" , "SE" , "TO" , "DF"};
		
		for (int i = 0; i < estados.length; i++) {
			if (estados[i].equalsIgnoreCase(sigla)) {
				return true;
			} 
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a sigla");
		
		if(validarSigla(scanner.next())) {
			System.out.println("Estado Existe");
		}else {
			System.out.println("Não existe");
		}
		
		scanner.close();
	}
}
