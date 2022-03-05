package Lista1;

import java.util.Scanner;

public class ProjetoExemplo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		//Jogo do advinha de 1 a 99
		JogoAdvinha jogoAdvinha = new JogoAdvinha();			
		int numeroSorteado = jogoAdvinha.Sortear();
		int numeroRecebido;
		boolean advinhou;
		
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
		
		
		//calculo delta		
		System.out.println("Digite o primeiro numero para calcular o delta: ");
		double a = sc.nextDouble();
		System.out.println("Digite o segundo numero para calcular o delta: ");
		double b = sc.nextDouble();	
		System.out.println("Digite o terceiro numero para calcular o delta: ");
		double c = sc.nextDouble();	
		
		EqGrau eqGrau = new EqGrau(a, b, c);		
		double delta = eqGrau.Delta();
		double raiz1 = eqGrau.Raiz1(delta);
		double raiz2 = eqGrau.Raiz2(delta);
		
		System.out.println("resultado delta = " + delta);
		System.out.println("resultado Raiz 1 = " + raiz1);
		System.out.println("resultado Raiz 2 = " + raiz2);		
		
		
		
		//verificar porta aberta ou fechada
		Porta porta = new Porta();		
		porta.abrir();		
		Boolean portaAberta = porta.isOpen;
		if(portaAberta) {
			System.out.println("resultado a porta esta aberta");
		}
		else {
			System.out.println("resultado a porta esta fechada");
		}
	
	}

}
