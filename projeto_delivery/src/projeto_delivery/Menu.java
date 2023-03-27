package projeto_delivery;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		
Scanner leia = new Scanner(System.in);
		
		int opcao;
		String cliente, endereco, telefone, cpf, pedido;
		float valor;
		
		while(true) {
			
			System.out.println("*************************************************");
			System.out.println("                                                 ");
			System.out.println("             HAMBURGUERIA SIRIGUEIJO             ");
			System.out.println("                                                 ");
			System.out.println("*************************************************");
			System.out.println("                                                 ");
			System.out.println("              1-Cadastrar Clientes               ");
			System.out.println("              2-Fazer Pedido                     ");
			System.out.println("              3-Valor do Pedido                  ");
			System.out.println("              4-Listar Todos os Pedidos          ");
			System.out.println("              5-Listar Todos os Clientes         ");
			System.out.println("              6-Cancelar Pedido                  ");
			System.out.println("              7-Sair                             ");
			System.out.println("                                                 ");
			System.out.println("*************************************************");
			System.out.println("                                                 ");
			System.out.println("Digite a opi��o desejada:                        ");
			System.out.println("                                                 ");
			
			opcao = leia.nextInt();
			
			if (opcao == 7) {
				System.out.println("\nHanburgueria Sirigueijo: Aqui Gostamos de Dinheiro!$$");
				System.out.println("\nVolte Sempre!");
				sobre();
				leia.close();
				System.exit(0);
			}
			
			switch(opcao) {
			
			case 1 ->{
				System.out.println("Cadastrar Clientes\n");
				
				System.out.println("Digite o nome do cliente: ");
				leia.skip("\\R");
				cliente = leia.nextLine();
				
				System.out.println("Digite o CPF do cliente: ");
				cpf = leia.nextLine();
				
				System.out.println("Digite o endere�o do cliente: ");
				endereco = leia.nextLine();
				
				System.out.println("Digite o telefone do cliente: ");
				telefone = leia.nextLine();
			}
			case 2 ->{
				System.out.println("Fazer Pedido\n");
				
				System.out.println("Digite o pedido do cliente: ");
				leia.skip("\\R");
				pedido = leia.nextLine();
				
			}
			
			case 3 ->{
				System.out.println("Valor do Pedido\n");	
			}
			case 4 ->{
				System.out.println("Listar todos os pedidos\n");	
			}
			case 5 ->{
				System.out.println("Listar os clientes\n");
			}
			case 6 ->{
				System.out.println("Cancelar pedido\n");
			}
			default -> System.out.println("\nOp��o Invalida1\n");
			}
		}

	}
	
	public static void sobre() {
		System.out.println("*************************************************");
		System.out.println("                                                 ");
		System.out.println("   Projeto Criado por:                           ");
		System.out.println("                                                 ");
		System.out.println("*************************************************");
		System.out.println("   Ana Vieira                                    ");
		System.out.println("   GitHub: https://github.com/Aninhahouse        ");
		System.out.println("                                                 ");
		System.out.println("*************************************************");
		System.out.println("                                                 ");
		System.out.println("*************************************************");
		System.out.println("   Andressa Camillo                              ");
		System.out.println("   GitHub: https://github.com/Andressacamillo    ");
		System.out.println("                                                 ");
		System.out.println("*************************************************");
		System.out.println("                                                 ");
		System.out.println("*************************************************");
		System.out.println("   Bruno Kau�                                    ");
		System.out.println("   Ghttps://github.com/brunokauaal               ");
		System.out.println("                                                 ");
		System.out.println("*************************************************");
		System.out.println("                                                 ");
		System.out.println("*************************************************");
		System.out.println("   Giselle Souza                                 ");
		System.out.println("   GitHub: https://github.com/gisellesouzaa      ");
		System.out.println("                                                 ");
		System.out.println("*************************************************");
		System.out.println("                                                 ");
		System.out.println("*************************************************");
		System.out.println("   Jo�o Vitor Moreira                            ");
		System.out.println("   GitHub: https://github.com/JOAOVITORMOREIRA   ");
		System.out.println("                                                 ");
		System.out.println("*************************************************");
		System.out.println("                                                 ");
		System.out.println("*************************************************");
		System.out.println("   Yngrid Padilha                                ");
		System.out.println("   GitHub:                                       ");
		System.out.println("                                                 ");
		System.out.println("*************************************************");
		System.out.println("                                                 ");
		

	}

}