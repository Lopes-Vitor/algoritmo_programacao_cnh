package exercicios;
import java.util.Scanner;
public class exercicio_cnh {

	public static void main(String[] args) {
		//Declarando a variavel
		int psi, legis, direc; 
				
		//Declarando o scanner
		Scanner leitor = new Scanner(System.in); 
		        
		//Imprimindo uma pergunta para saber se a pessoa foi aprovada no exame psicotecnico, no exame de legislacao e no exame de direcao
		System.out.print("Digite (1) se voce foi aprovado no exame psicotecnico, (2) se foi reprovado"); 
		//Leitura do valor entrado
		psi = leitor.nextInt(); 
		
		System.out.print("Digite (1) se voce foi aprovado no exame de legislacao, (2) se foi reprovado");
		legis = leitor.nextInt(); 
		
		System.out.print("Digite (1) se voce foi aprovado no exame de direcao, (2) se foi reprovado");
		direc = leitor.nextInt(); 
		        
		//utilizando a estrutura condicional IF para ver se a pessoa vai poder solicitar sua CNH ou nao
		if(psi==1 && legis==1 && direc==1){ 
		System.out.print("Pode solicitar sua CNH");
		}
		else{ 
		System.out.print("Refaca o(s) exame(s) que foi reprovado para que seja possivel solicitar sua CNH");
		}
		        
	}
}