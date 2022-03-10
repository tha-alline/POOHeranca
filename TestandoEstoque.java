package POOHeranca;

	import java.util.ArrayList;
	import java.util.Scanner;
	
	public class TestandoEstoque {

		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
					
			ArrayList<Estoque> estoque = new ArrayList<>();
			
			int press = -1;
			
			estoque.add(new Estoque("Batom", 1515));
			estoque.add(new Estoque("Blush em pó", 2525));
			estoque.add(new Estoque("Pó Compacto", 3838));
			estoque.add(new Estoque("Removedor de Maquiagem", 4141));
			
			while(press !=0) {
				
			System.out.println("VOCÊ DESEJA?\n\n[1]ADICIONAR PRODUTO \n[2]REMOVER PRODUTO \n[3]ATUALIZAR PRODUTO \n[0]SAIR" );
			press = sc.nextInt();
			
				if (press == 1) {
					System.out.println("Insira o nome do produto: ");			
					String produto = sc.next();
				
					System.out.println("Insira o código do produto");
					int numCodigo= sc.nextInt();
				
					System.out.println();
					estoque.add(new Estoque(produto, numCodigo));
					} 
			
				else if (press == 2) {
					System.out.println("Digite o número do item que deseja remover: ");
					int i = sc.nextInt();
					estoque.remove(i);
				
					} 
			
				else if (press == 3) {
					System.out.println("Digite o número do item que deseja atualizar: ");
					int i = sc.nextInt();
				
					System.out.println("Insira o nome do novo produto: ");
					String produto = sc.next();
				
					System.out.println("Insira o código do produto: ");
					int numCodigo = sc.nextInt();
				
					estoque.set(i, new Estoque(produto, numCodigo));			
				} 
			
				else {
				System.out.println("Obrigada, até breve!!!");
				}
			
				for (int i = 0; i < estoque.size(); i++ ) {
				System.out.println(i + "|" + estoque.get(i));	
				System.out.println();
				}
			}
			sc.close();
		}
	}
