package quiz6POO;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


@SuppressWarnings("unused")
public class Main {

	public static void main(String[] args) {
		
		Participante p1 = new Participante("pedro", 10, 20);
		Participante p2 = new Participante("alissa", 6, 27);
		Participante p3 = new Participante("lucia", 12, 21);
		Participante p4 = new Participante("sandra", 6, 15);
		Participante p5 = new Participante("andres", 6, 30);
		Participante p6 = new Participante("sarah", 13, 23);
		Participante p7 = new Participante("willy", 14, 25);
	    
	    ArrayList<Participante> lista = new ArrayList<Participante>();
	    
	    lista.add(p1);
	    lista.add(p2);
	    lista.add(p3);
	    lista.add(p4);
	    lista.add(p5);
	    lista.add(p6);
	    lista.add(p7);
	    
	    Collections.sort(lista);
	    
	    System.out.println("nombre       juegos        puntos");
	    System.out.println("---------------------------------");
	    
	    for (Participante p :lista) {
	      System.out.print(p.getName() + "          ");
	      System.out.print(p.getCantidJuegos() + "           ");
	      System.out.println(p.getPoints());
	    }
    }    
}
