package Lista1;

public class ProjetoExemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Porta porta = new Porta();		
		porta.abrir();
		
		Boolean portaAberta = porta.isOpen;
		System.out.println("resultado = " + portaAberta);
	}

}
