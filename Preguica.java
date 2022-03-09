
public class Preguica implements Animal {

	@Override
	public void nome() {
		System.out.println("O nome da preguiça é Raabe.");
		
	}

	@Override
	public void idade() {
		System.out.println("Raabe tem 21 anos.");
		
	}

	@Override
	public void emitirSom() {
		System.out.println("A preguiça faz o som para chamar o macho: UUUUÍÍÍ");
		
	}

	@Override
	public void correr() {}

	@Override
	public void subirEmArvores() {
		System.out.println("A preguiça adora subir em árvores.\n\n");
		
	}
}