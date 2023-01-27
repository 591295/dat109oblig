package Stigespillet;

import java.util.Random;

public class Terning {

	 private Random rand;

	    public Terning() {
	        rand = new Random();
	    }

	    public int kast() {
	        // Generer et tilfeldig tall mellom 1 og 6
	        return rand.nextInt(6) + 1;
	    }
	
}
