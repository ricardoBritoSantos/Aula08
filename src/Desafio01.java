	/*� muito comum que programas que realizam cadastros de pessoas precisem validar a sigla do estado a que elas pertencem.
Crie uma fun��o que receba uma String contendo a sigla de um estado e 
verifique se esse estado existe ou n�o. 
Caso exista, a fun��o deve retornar um boolean true. 
Caso n�o exista, ele deve retornar um boolean false.
A main do seu programa deve conter a digita��o do estado, a chamada da fun��o e a 
exibi��o de uma mensagem para afirmar se o estado existe ou n�o, dependendo do que a fun��o retornar.

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
			System.out.println("N�o existe");
		}
		
		scanner.close();
	}
}
