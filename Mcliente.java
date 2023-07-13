package br.com.faeterj.classes_aplicação;
import java.util.ArrayList;
import java.util.Scanner;

import br.com.faeterj.classes_dominio.cliente;

public class Mcliente {  
	
	
	public static void AddCliente (ArrayList<cliente>lc) {
		
		Scanner sc = new Scanner(System.in);
		
		cliente Cliente = new cliente();
    	System.out.println("insira o id do cliente");
    	Cliente.id = sc.nextInt();
    	System.out.println("insira o nome do cliente");
    	Cliente.nome = sc.next();
    	System.out.println("insira o endereço do cliente");
    	Cliente.endereço = sc.next();
    	System.out.println("insira o postalCode do cliente");
    	Cliente.postalCode = sc.nextInt();
    	System.out.println("insira o pais do cliente");
    	Cliente.pais = sc.next();
    	System.out.println("insira o CPF do cliente");
    	Cliente.CPF = sc.nextInt();
    	System.out.println("insira o passaporte do cliente");
    	Cliente.passaporte = sc.next();
    	System.out.println("insira o email do cliente");
    	Cliente.email = sc.next();
    	System.out.println("insira a data de nascimento do cliente");
    	Cliente.dataNascimento = sc.next();
    	lc.add(Cliente);
    	
	}
	
	public static void AlterCliente (ArrayList<cliente>lc) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("insira o id do cliente");
		int id = sc.nextInt();
		int i = 0;
		cliente C = lc.get(i);
		
		while(i < lc.size() && id != C.id) {
			
			C = lc.get(i);
			i++;
			
		}
		
		if (id != C.id) {
			
			System.out.println("Cliente não encontrado");
			
		}else if (id == C.id) {
			
			System.out.println("insira o novo id do cliente");
	    	C.id = sc.nextInt();
	    	System.out.println("insira o novo nome do cliente");
	    	C.nome = sc.next();
	    	System.out.println("insira o novo endereço do cliente");
	    	C.endereço = sc.next();
	    	System.out.println("insira o novo postalCode do cliente");
	    	C.postalCode = sc.nextInt();
	    	System.out.println("insira o novo pais do cliente");
	    	C.pais = sc.next();
	    	System.out.println("insira o novo CPF do cliente");
	    	C.CPF = sc.nextInt();
	    	System.out.println("insira o novo passaporte do cliente");
	    	C.passaporte = sc.next();
	    	System.out.println("insira o novo email do cliente");
	    	C.email = sc.next();
	    	System.out.println("insira a novo data de nascimento do cliente");
	    	C.dataNascimento = sc.next();
			
		}
		
		
		
	}
	
	public static void DelCliente (ArrayList<cliente>lc) {
		
    Scanner sc = new Scanner(System.in);
		
		System.out.println("insira o id do cliente");
		int id = sc.nextInt();
		int i = 0;
		cliente C = lc.get(i);
		
		while(i < lc.size() && id != C.id) {
			
			C = lc.get(i);
			i++;
			
		}
		
		if (id != C.id) {
			
			System.out.println("Cliente não encontrado");
			
		}else if (id == C.id) {
			
			lc.remove(i);
			
		}
		
	}
	
	public static void ListCliente (ArrayList<cliente>lc) {
		
		int i = 0;
		cliente C = lc.get(i);
		
		while(i < lc.size()) {
			
			System.out.println("id " + C.id);
			System.out.println("nome " + C.nome);
			System.out.println("endereço " + C.endereço);
			System.out.println("postalCode " + C.postalCode);
			System.out.println("pais " + C.pais);
			System.out.println("CPF " + C.CPF);
			System.out.println("passaporte " + C.passaporte);
			System.out.println("email " + C.email);
			System.out.println("data de nacimento " + C.dataNascimento);
			
			C = lc.get(i);
			i++;
			
		}
		
	}

}