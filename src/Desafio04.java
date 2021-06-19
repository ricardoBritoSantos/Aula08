import java.util.Scanner;

public class Desafio04 {
	/* 
	Considere o c�lculo do sal�rio de um professor, dispon�vel em http://www1.sinprosp.org.br/guia_consultas.asp?mat=8
	
	Crie as fun��es que julgar necess�rias para obter cada um dos valores que fazem parte do sal�rio de um professor
	 * */
	
	
	public static double calcularSalario(int numeroAulas, double horaAula) {
		
		var salarioBase = numeroAulas * 4.5 * horaAula;
		var horaAtividade = salarioBase * 0.05;
		var descansoSemanalRemunerado = (salarioBase + horaAtividade) / 6;
		var salario = salarioBase + horaAtividade + descansoSemanalRemunerado;
		
		return salario;
	}
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Para calcular seu sal�rio base precisamos saber quantas aulas semanais o professor tem na institui��o");
		var numeroAulas = leitor.nextInt();
		System.out.println("Para calcular seu sal�rio base precisamos saber qual � o valor da hora aula praticada nessa institui��o");
		var horaAula = leitor.nextDouble();
		
		System.out.println("Sal�rio total R$ " + calcularSalario(numeroAulas, horaAula));
		
		leitor.close();
	}
}
