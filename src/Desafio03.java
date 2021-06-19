import java.util.Scanner;

public class Desafio03 {
/*Você deve se lembrar que os triângulos possuem uma regra para existirem: a soma de QUAISQUER dois lados tem que ser maior do que o lado restante.
 * 
E deve se lembrar, também, que os triângulos podem ser de três tipos: equiláteros, escalenos ou isósceles.

Crie uma função que valida se um triângulo existe ou não. 

Além disso, crie uma função que verifica o tipo do triângulo 
(ela deve primeiro validar se o triângulo existe).

A main do seu programa deve ter a leitura dos lados do triângulo e a chamada da função que retorna o tipo dele. 

	 * */
	public static String validaTriangulo(int lado1, int lado2, int lado3) {
		
		if(((lado1 + lado2) > lado3)  && ((lado1 + lado3) > lado2) && ((lado2 + lado3) > lado1)) {
			if(lado1 == lado2 && lado1 == lado3) {
				return "Equilatero";
			}else if(lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
				return "Isosceles";
			}else {
				return "Escaleno";
			}
		}
		
		return "Triangulo não existe";
		
	}
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int lado1=0, lado2=0, lado3=0;
		
		System.out.println("Digite o 1º lado");
		lado1   = leitor.nextInt();
		System.out.println("Digite o 2º lado");
		lado2   = leitor.nextInt();
		System.out.println("Digite o 3º lado");
		lado3   = leitor.nextInt();
		
		System.out.print(validaTriangulo(lado1, lado2, lado3));
		
		leitor.close();
	}
}
