package POOHeranca;

import java.util.Scanner;

public class HerancaCompleto {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		Cachorro cachorro = new Cachorro();
		Cavalo cav = new Cavalo();
		Preguica p = new Preguica();
		
		
		//cachorro
		cachorro.setNome("Snoppy");
		cachorro.setIdade(3);
		cachorro.setOrigem("Em nossos aptos/casas.");
		
		cav.setNome("Pocotó");
		cav.setIdade(5);
		cav.setOrigem("No Jockey Clube.");
		
		p.setNome("Guiçinha");
		p.setIdade(1);
		p.setOrigem("Na Mata Atlântica.");
		
		
		System.out.println(cachorro.getNome());
		System.out.println("Idade do Cachorro: " + cachorro.getIdade());
		System.out.println("Onde geralmente ele vive: " + cachorro.getOrigem());
		cachorro.EmitirSom("AUAUAUAUAU");
		
		System.out.println("=========================================================\n");
		
		System.out.println(cav.getNome());
		System.out.println("Idade do Cavalo: " + cav.getIdade());
		System.out.println("Onde geralmente ele vive: "  + cav.getOrigem());
		cav.EmitirSom("IRRRRRIIINN");
		
		System.out.println("=========================================================\n");
		
		System.out.println(p.getNome());
		System.out.println("Idade da Preguiça" + p.getIdade());
		System.out.println("Onde geralmente ele vive: " + p.getOrigem());
		p.EmitirSom("......");
		
		leia.close();
		
	}
}