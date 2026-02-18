package presentacion;

import logica.Pieza;
import logica.Peon;
import logica.Torre;
import logica.Rey;

public class Principal {
	
	public Principal() throws Exception {
		Pieza p;
		
		try {
		p = new Peon(1,2);
		System.out.println(p.numCasillas());

		p = new Peon(1,4);
		System.out.println(p.numCasillas());

		p = new Torre(1,1);
		System.out.println(p.numCasillas());

		p = new Torre(3,4);
		System.out.println(p.numCasillas());

		p = new Rey(5,5);
		System.out.println(p.numCasillas());

		p = new Rey(1,8);
		System.out.println(p.numCasillas());

		} catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}
		
	
	public static void main(String[] args) {
		try {
			new Principal();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	}
