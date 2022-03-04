package Lista1;
import java.util.Random;

//Ex 1.5
public class JogoAdvinha {	
	
	int numeroSorteado;
	Random gerador = new Random();
	
	public JogoAdvinha (){

	}
	
	public int Sortear(){
		numeroSorteado = gerador.nextInt(20);
		
		return numeroSorteado;
	}
	
	public boolean Advinhou(int numeroSelecionado) {
		
		if(numeroSelecionado == numeroSorteado) {
			return true;
		}
		
		return false;
	}
	
}
