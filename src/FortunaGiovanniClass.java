/**
 * Classe per calcolare una produttoria:
 * Fortuna Giovanni
 
 * 
 * @author 4a
 *
 */
public class FortunaGiovanniClass {
	/**
	 *  Costruttore: 
	 * 
	 */
	public FortunaGiovanniClass() {
		
	}
	/**
	 * 
	 * @param s indice iniziale
	 * @param f indice finale
	 * @return risultato finale
	 */
	public int fortunaMet(int s, int f) {
		int r=0;
		for(int i=1; i<f; i++) {
			//ERRORE CORRETTO
			r=s*i*f;
		}
		return r;
		}
	/**
	 * @return toString
	 */
	public String toString() {
		return " ";
	}
	/**
	 * 
	 * @param args Test di classe
	 */
	public static void main(String[] args) {
		FortunaGiovanniClass p=new FortunaGiovanniClass();
		System.out.println("il risultato è: "+p.fortunaMet(5, 7));
	}
	}

