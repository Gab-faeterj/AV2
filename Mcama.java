package br.com.faeterj.classes_aplicação;
import java.util.ArrayList;
import java.util.Scanner;

import br.com.faeterj.classes_dominio.cama;

public class Mcama {
	
	public static void AddCama (ArrayList<cama>lca) {
		
		Scanner sc = new Scanner(System.in);
		
		cama Cama = new cama();
    	System.out.println("insira o id da cama");
    	Cama.id = sc.nextInt();
    	System.out.println("insira o codigo da cama");
    	Cama.codigoCama = sc.nextInt();
    	System.out.println("a cama é beliche ou não");
    	Cama.beliche = sc.nextBoolean();
    	System.out.println("insira a posição da cama");
    	Cama.posição = sc.next();
    	System.out.println("insira a descrição da cama");
    	Cama.descrição = sc.next();
    	lca.add(Cama);
		
	}
	
    public static void AlterCama (ArrayList<cama>lca) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("insira o id do quarto");
		int id = sc.nextInt();
		int i = 0;
		cama Ca = lca.get(i);
		
		while(i < lca.size() && id != Ca.id) {
			
			Ca = lca.get(i);
			i++;
			
		}
		
		if (id != Ca.id) {
			
			System.out.println("Cama não encontrada");
			
		}else if (id == Ca.id) {
			
			System.out.println("insira o novo id da cama");
	    	Ca.id = sc.nextInt();
	    	System.out.println("insira o novo codigo da cama");
	    	Ca.codigoCama = sc.nextInt();
	    	System.out.println("é beliche ou não");
	    	Ca.beliche = sc.nextBoolean();
	    	System.out.println("insira a nova posição");
	    	Ca.posição = sc.next();
	    	System.out.println("insira a nova descrição da cama");
	    	Ca.descrição = sc.next();
		}
		
		
		
	}
	
	public static void DelCama (ArrayList<cama>lca) {
		
    Scanner sc = new Scanner(System.in);
		
		System.out.println("insira o id da cama");
		int id = sc.nextInt();
		int i = 0;
		cama Ca = lca.get(i);
		
		while(i < lca.size() && id != Ca.id) {
			
			Ca = lca.get(i);
			i++;
			
		}
		
		if (id != Ca.id) {
			
			System.out.println("cama não encontrada");
			
		}else if (id == Ca.id) {
			
			lca.remove(i);
			
		}
		
	}
	
	public static void ListCama (ArrayList<cama>lca) {
		
		int i = 0;
		cama Ca = lca.get(i);
		
		while(i < lca.size()) {
			
			System.out.println("id " + Ca.id);
			System.out.println("codigo da cama " + Ca.codigoCama);
			System.out.println("beliche " + Ca.beliche);
			System.out.println("posição " + Ca.posição);
			System.out.println("descrição " + Ca.descrição);
			
			Ca = lca.get(i);
			i++;
			
		}
		
	}

}
