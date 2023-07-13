package br.com.faeterj.classes_aplicação;
import java.util.ArrayList;
import java.util.Scanner;

import br.com.faeterj.classes_dominio.cama;
import br.com.faeterj.classes_dominio.reserva;

public class Mreserva {

	public static void AddReserva (ArrayList<reserva>Lr) {
		
		Scanner sc = new Scanner(System.in);
		
		reserva Reserva = new reserva();
    	System.out.println("insira o id da reserva");
    	Reserva.id = sc.nextInt();
    	System.out.println("insira o id do quarto");
    	Reserva.idQuarto = sc.nextInt();
    	System.out.println("insira o id da cama");
    	Reserva.idCama = sc.nextInt();
    	System.out.println("insira o id do cliente");
    	Reserva.idCliente = sc.nextInt();
    	System.out.println("insira a data de entrega da reserva");
    	Reserva.dataEntrega = sc.next();
    	System.out.println("insira a data de saida da reserva");
    	Reserva.dataSaida = sc.next();
    	Lr.add(Reserva);
		
	}
	
	 public static void AlterReserva (ArrayList<reserva>Lr) {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("insira o id do quarto");
			int id = sc.nextInt();
			int i = 0;
			reserva R = Lr.get(i);
			
			while(i < Lr.size() && id != R.id) {
				
				R = Lr.get(i);
				i++;
				
			}
			
			if (id != R.id) {
				
				System.out.println("Reserva não encontrada");
				
			}else if (id == R.id) {
				
				System.out.println("insira o novo id da cama");
		    	R.id = sc.nextInt();
		    	System.out.println("insira o novo id do quarto");
		    	R.idQuarto = sc.nextInt();
		    	System.out.println("insira o novo id da cama");
		    	R.idCama = sc.nextInt();
		    	System.out.println("insira o novo id do cliente");
		    	R.idCliente = sc.nextInt();
		    	System.out.println("insira a nova data de entrega");
		    	R.dataEntrega = sc.next();
		    	System.out.println("insira a nova data de saida");
		    	R.dataSaida = sc.next();
			}
			
			
			
		}
		
		public static void DelReserva (ArrayList<reserva>Lr) {
			
	    Scanner sc = new Scanner(System.in);
			
			System.out.println("insira o id da reserva");
			int id = sc.nextInt();
			int i = 0;
			reserva R = Lr.get(i);
			
			while(i < Lr.size() && id != R.id) {
				
				R = Lr.get(i);
				i++;
				
			}
			
			if (id != R.id) {
				
				System.out.println("Reserva não encontrada");
				
			}else if (id == R.id) {
				
				Lr.remove(i);
				
			}
			
		}
		
		public static void ListReserva (ArrayList<reserva>Lr) {
			
			int i = 0;
			reserva R = Lr.get(i);
			
			while(i < Lr.size()) {
				
				System.out.println("id " + R.id);
				System.out.println("id do quarto " + R.idQuarto);
				System.out.println("id da cama " + R.idCama);
				System.out.println("id do cliente " + R.idCliente);
				System.out.println("data de entrega " + R.dataEntrega);
				System.out.println("data de saida " + R.dataSaida);
				
				R = Lr.get(i);
				i++;
				
			}
			
		}
	
}
