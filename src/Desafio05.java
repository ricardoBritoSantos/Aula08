import java.util.Scanner;

public class Desafio05 {
/*A rede de supermercados MercaJava est� levando a s�rio as restri��es de isolamento social no Brasil. 
 * Est�o trabalhando para automatizar as portas das unidades, permitindo a entrada apenas das pessoas que est�o atendendo �s solicita��es.
Toda a identifica��o das medidas necess�rias � feita atrav�s de c�meras e sensores de temperaturas. 
Sua tarefa � criar as fun��es que recebam essas medidas e informem se o cliente pode ou n�o entrar no estabelecimento.
As fun��es s�o:

�	Temperatura: Clientes com temperatura superior a 37,0 graus n�o podem entrar no estabelecimento.
�	M�scara: Clientes sem m�scara n�o podem entrar no estabelecimento.
�	Fam�lias: grupos com mais de 2 pessoas n�o podem entrar no estabelecimento.
�	Fun��o agregadora: s� autoriza a entrada no estabelecimento de clientes que cumprirem com as 3 fun��es anteriores.
*/
	
	public static boolean temperatura(double temperatura) {
		if(!(temperatura > 37)) {
			return true;
		}
		return false;
	}
	
	public static boolean mascara(String mascara) {
		if(mascara.equalsIgnoreCase("sim")){
			return true;
		}
		return false;
	}
	
	public static boolean familia(int qtde) {
		if(!(qtde > 2)){
			return true;
		}
		return false;
	}
	
	public static String Agregadora(boolean temperatura, boolean mascara, boolean familia) {
		if(temperatura && mascara && familia){
			return "Entrada autorizada";
		}
		return "Entrada n�o autorizada";
	}
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.print("Informe a temperatura: ");
		var temperatura = leitor.nextDouble();
		System.out.print("Informe se est� com a mascara(Sim ou n�o): ");
		var mascara = leitor.next();
		System.out.print("Informe a qtde de pessoas por familia ");
		var familia = leitor.nextInt();

		System.out.print(Agregadora(temperatura(temperatura),mascara(mascara), familia(familia)));
		
		leitor.close();
	}

}
