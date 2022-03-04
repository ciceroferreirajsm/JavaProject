package Lista1;

import java.util.Scanner;

public class ProjetoExemplo {

	public static void main(String[] args) {
		
		//Jogo do advinha de 1 a 99
		JogoAdvinha jogoAdvinha = new JogoAdvinha();			
		int numeroSorteado = jogoAdvinha.Sortear();
		int numeroRecebido;
		boolean advinhou;
		Scanner sc = new Scanner(System.in);
		
		do
		{
			System.out.println("Digite um numero: ");
			numeroRecebido = sc.nextInt();			
			advinhou = jogoAdvinha.Advinhou(numeroRecebido);
			
			if(advinhou) {
				System.out.println("Parabens voce advinhou o numero sorteado. numero recebido = " + numeroRecebido + ", numero sorteado = " + numeroSorteado);
			}
			else {
				System.out.println("Ainda não é numero sorteado tente novamente.");
			}
			
		}while(!advinhou);

		
		// TODO Auto-generated method stub
		/*Porta porta = new Porta();		
		porta.abrir();
		
		Boolean portaAberta = porta.isOpen;
		System.out.println("resultado = " + portaAberta);*/
	}

}
