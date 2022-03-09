
public class Cachorro implements Animal {

       @Override
		public void nome() {
			System.out.println("O nome do cachorro é Snopy.");
			
		}

		@Override
		public void idade() {
			System.out.println("Snopy tem 3 anos.");
			
		}

		@Override
		public void emitirSom() {
			System.out.println("O cachorro faz: AU-AU...");
			
		}

		@Override
		public void correr() {
			System.out.println("O cachorro está correndo.\n\n");
			
		}

		@Override
		public void subirEmArvores() {}

	}