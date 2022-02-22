package Lista1;

//Ex 1.7 
public class Porta {
	
	Boolean isOpen;
	int numAberturas;
	
	public Porta (){

	}
	
	public void abrir(){
		isOpen = true;
		numAberturas++;
	}
	
	public int fechar(){
		isOpen = false;		
		return numAberturas;
	}
}
