package br.com.faeterj.classes_aplicação;
import java.util.ArrayList;
import java.util.Scanner;

import br.com.faeterj.classes_dominio.quarto;

public class Mquarto {
	
	public static void AddQuarto (ArrayList<quarto>Lq) {
		
		Scanner sc = new Scanner(System.in);
		
		quarto Quarto = new quarto();
    	System.out.println("insira o id do quarto");
    	Quarto.id = sc.nextInt();
    	System.out.println("insira o nome do quarto");
    	Quarto.nomeQuarto = sc.next();
    	System.out.println("insira a quantidade de camas no quarto");
    	Quarto.qtdeCamas = sc.nextInt();
    	System.out.println("insira a descrição do querto");
    	Quarto.descrição = sc.next();
    	
    	if (Quarto.qtdeCamas == 8) {
    		
    		Quarto.banheiro = false;
    		
    	}else {
    		
    		Quarto.banheiro = true;
    		
    	}
    	
        Lq.add(Quarto);
		
	}
	
    public static void AlterQuarto (ArrayList<quarto>Lq) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("insira o id do quarto");
		int id = sc.nextInt();
		int i = 0;
		quarto Q = Lq.get(i);
		
		while(i < Lq.size() && id != Q.id) {
			
			Q = Lq.get(i);
			i++;
			
		}
		
		if (id != Q.id) {
			
			System.out.println("Quarto não encontrado");
			
		}else if (id == Q.id) {
			
			System.out.println("insira o novo id do quarto");
	    	Q.id = sc.nextInt();
	    	System.out.println("insira o novo nome do quarto");
	    	Q.nomeQuarto = sc.next();
	    	System.out.println("insira a quantidade nova de camas no quarto");
	    	Q.qtdeCamas = sc.nextInt();
	    	System.out.println("insira a nova descrição do quarto");
	    	Q.descrição = sc.next();
	    	
	    	if (Q.qtdeCamas == 8) {
	    		
	    		Q.banheiro = false;
	    		
	    	}else {
	    		
	    		Q.banheiro = true;
	    		
	    	}
		}
		
		
		
	}
	
	public static void DelQuarto (ArrayList<quarto>Lq) {
		
    Scanner sc = new Scanner(System.in);
		
		System.out.println("insira o id do quarto");
		int id = sc.nextInt();
		int i = 0;
		quarto Q = Lq.get(i);
		
		while(i < Lq.size() && id != Q.id) {
			
			Q = Lq.get(i);
			i++;
			
		}
		
		if (id != Q.id) {
			
			System.out.println("quarto não encontrado");
			
		}else if (id == Q.id) {
			
			Lq.remove(i);
			
		}
		
	}
	
	public static void ListQuarto (ArrayList<quarto>Lq) {
		
		int i = 0;
		quarto Q = Lq.get(i);
		
		while(i < Lq.size()) {
			
			System.out.println("id " + Q.id);
			System.out.println("nome do quarto " + Q.nomeQuarto);
			System.out.println("quantidade de camas " + Q.qtdeCamas);
			System.out.println("tem banheiro " + Q.banheiro);
			System.out.println("descrição " + Q.descrição);
			
			Q = Lq.get(i);
			i++;
			
		}
		
	}

}
