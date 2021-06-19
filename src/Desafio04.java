import java.util.Scanner;

public class Desafio04 {
	/* 
	Considere o cálculo do salário de um professor, disponível em http://www1.sinprosp.org.br/guia_consultas.asp?mat=8
	
	Crie as funções que julgar necessárias para obter cada um dos valores que fazem parte do salário de um professor
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
		
		System.out.println("Para calcular seu salário base precisamos saber quantas aulas semanais o professor tem na instituição");
		var numeroAulas = leitor.nextInt();
		System.out.println("Para calcular seu salário base precisamos saber qual é o valor da hora aula praticada nessa instituição");
		var horaAula = leitor.nextDouble();
		
		System.out.println("Salário total R$ " + calcularSalario(numeroAulas, horaAula));
		
		leitor.close();
	}
}
