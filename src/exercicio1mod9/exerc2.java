package exercicio1mod9;

		import java.util.Scanner;

		public class exerc2 {
		public static void main(String[] args) {
			
			int produto;
			int quantidade;
			
			Scanner leia = new Scanner(System.in);

			System.out.println("\n\t\tCódigo do produto\t\tProduto\t\tPreço unitário");
			System.out.println("\n\t\t1- \t\t\t\tCachorro quente\tR$10,00");
			System.out.println("\n\t\t2- \t\t\t\tX-salada\tR$15,00");
			System.out.println("\n\t\t3- \t\t\t\tX-bacon\t\tR$18,00");
			System.out.println("\n\t\t4- \t\t\t\tBauru\t\tR$12,00");
			System.out.println("\n\t\t5- \t\t\t\tRefrigerante\tR$8,00");
			System.out.println("\n\t\t6- \t\t\t\tSuco de laranja\tR$13,00");
			
			System.out.println("\nDigite o código do produto: ");
			produto = leia.nextInt();
			
			System.out.println("\nDigite a quantidade: ");
			quantidade = leia.nextInt();
			
			switch(produto) {
			case 1:
				System.out.println("Produto: Cachorro quente");
				System.out.println("Valor total:");
				System.out.println(quantidade*10.00);
				break;
				
			case 2:
				System.out.println("Produto: X-salada");
				System.out.println("Valor total:");
				System.out.println(quantidade*15.00);
				break;
				
			case 3:
				System.out.println("Produto: X-bacon");
				System.out.println("Valor total:");
				System.out.println(quantidade*18.00);
				break;
				
			case 4:
				System.out.println("Produto: Bauru");
				System.out.println("Valor total:");
				System.out.println(quantidade*12.00);
				break;
				
			case 5:
				System.out.println("Produto: Refrigerante");
				System.out.println("Valor total:");
				System.out.println(quantidade*8.00);
				break;
				
			case 6:
				System.out.println("Produto: Suco de laranja");
				System.out.println("Valor total:");
				System.out.println(quantidade*13.00);
				break;
			}
			 leia.close();
			
		}



	}

