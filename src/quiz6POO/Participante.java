package quiz6POO;


public class Participante implements Comparable<Participante>{
	
	private String nombre;
	private int juegosCantid;
	private int puntos;
	
	public Participante(String name, int gamenumber, int points) {
	    super();
	    this.nombre = name;
	    this.juegosCantid = gamenumber;
	    this.puntos = points;
	}
	
	public int getCantidJuegos() {
		return juegosCantid;
	}
	
	public int getPoints() {
		return puntos;
	}
	
	public String getName() {
		return nombre;
	}
 
	
	@Override
	public int compareTo(Participante o) {
		
		if(this.getCantidJuegos() > o.getCantidJuegos()) {
			return 1;
		} else if(this.getCantidJuegos() < o.getCantidJuegos()) {
			return -1;
		} else {
			//en caso de que sean iguales hay que considerar los puntos
			if(this.getPoints() > o.getPoints()) {
				return -1;
			} else if(this.getPoints() < o.getPoints()) {
				return 1;
			} else {
				return 0;
			}
		}
	}
}
