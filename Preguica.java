
public class Preguica implements Animal {

	@Override
	public void nome() {
		System.out.println("O nome da pregui�a � Raabe.");
		
	}

	@Override
	public void idade() {
		System.out.println("Raabe tem 21 anos.");
		
	}

	@Override
	public void emitirSom() {
		System.out.println("A pregui�a faz o som para chamar o macho: UUUU���");
		
	}

	@Override
	public void correr() {}

	@Override
	public void subirEmArvores() {
		System.out.println("A pregui�a adora subir em �rvores.\n\n");
		
	}
}