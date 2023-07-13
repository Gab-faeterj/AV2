package br.com.faeterj.classes_aplicação;
import br.com.faeterj.classes_dominio.cama;
import br.com.faeterj.classes_dominio.cliente;
import br.com.faeterj.classes_dominio.quarto;
import br.com.faeterj.classes_dominio.reserva;

import java.util.ArrayList;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList<cliente> lcliente = new ArrayList();
        ArrayList<quarto> lquarto = new ArrayList();
        ArrayList<cama> lcama = new ArrayList();
        ArrayList<reserva> lreserva = new ArrayList();
        
        Scanner sc = new Scanner(System.in);
        
        int resp;
        
        System.out.println("com quais perfis deseja interagir?");
        System.out.println("[1] perfil Cliente");
        System.out.println("[2] quartos");
        System.out.println("[3] camas");
        System.out.println("[4] reservas");
        
        resp = sc.nextInt();
        
        if (resp == 1) {
        	
        	System.out.println("deseja");
        	System.out.println("[1] Criar perfil cliente");
        	System.out.println("[2] alterar perfil cliente");
        	System.out.println("[3] deletar perfil cliente");
        	System.out.println("[4] listar perfis de cliente");
        	
        	resp = sc.nextInt();
        	
        	if (resp == 1) {
        		
        		Mcliente.AddCliente(lcliente);
        		
        	}
        	
            if (resp == 2) {
        		
        		Mcliente.AlterCliente(lcliente);
        		
        	}
            
            if (resp == 3) {
        		
        		Mcliente.DelCliente(lcliente);
        		
        	}
            
            if (resp == 4) {
        		
        		Mcliente.ListCliente(lcliente);
        		
        	}
        	
        }
        
        if (resp == 2) {
    		
        	System.out.println("deseja");
        	System.out.println("[1] Criar quarto");
        	System.out.println("[2] alterar quarto");
        	System.out.println("[3] deletar quarto");
        	System.out.println("[4] listar quartos");
        	
        	resp = sc.nextInt();
        	
            if (resp == 1) {
        		
        		Mquarto.AddQuarto(lquarto);
        		
        	}
            
            if (resp == 2) {
        		
        		Mquarto.AlterQuarto(lquarto);
        		
        	}
            
            if (resp == 3) {
        		
        		Mquarto.DelQuarto(lquarto);
        		
        	}
            
            if (resp == 4) {
        		
        		Mquarto.ListQuarto(lquarto);
        		
        	}
    		
    	}
        
            if (resp == 3) {
    		
        	System.out.println("deseja");
        	System.out.println("[1] Criar cama");
        	System.out.println("[2] alterar cama");
        	System.out.println("[3] deletar cama");
        	System.out.println("[4] listar camas");
        	
        	resp = sc.nextInt();
        	
            if (resp == 1) {
        		
        		Mcama.AddCama(lcama);
        		
        	}
            
            if (resp == 2) {
        		
        		Mcama.AlterCama(lcama);
        		
        	}
            
            if (resp == 3) {
        		
        		Mcama.DelCama(lcama);
        		
        	}
            
            if (resp == 4) {
        		
        		Mcama.ListCama(lcama);
        		
        	}
    		
    	}
            
            if (resp == 4) {
        		
            	System.out.println("deseja");
            	System.out.println("[1] Criar reserva");
            	System.out.println("[2] alterar reserva");
            	System.out.println("[3] deletar reserva");
            	System.out.println("[4] listar reserva");
            	
            	resp = sc.nextInt();
            	
                if (resp == 1) {
            		
            		Mreserva.AddReserva(lreserva);
            		
            	}
                
                if (resp == 2) {
            		
            		Mreserva.AlterReserva(lreserva);
            		
            	}
                
                if (resp == 3) {
            		
            		Mreserva.DelReserva(lreserva);
            		
            	}
                
                if (resp == 4) {
            		
            		Mreserva.ListReserva(lreserva);
            		
            	}
        		
        	}
        
	}

}
