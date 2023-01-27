package Stigespillet;

public class Spill {
	
	private Brett brett; 
	private Spiller[] spillere;
	private Terning terning;

	    public void startSpill() {
	        // initialiser brett, spillere og terning
	    	brett = new Brett() ; 
	    	
	    	spillere = new Spiller[4]; 
	    	spillere[0] = new Spiller("Spiller 1", new Brikke("rød"));
	        spillere[1] = new Spiller("Spiller 2", new Brikke("grønn"));
	        spillere[2] = new Spiller("Spiller 3", new Brikke("gul"));
	        spillere[3] = new Spiller("Spiller 4", new Brikke("blå"));
	    	
	    	
	    	terning = new Terning() ; 
	    	
	        // kjør spillet til noen vinner
	    	
	    	int vinner = -1;
	        while (vinner == -1) {
	            for (int i = 0; i < spillere.length; i++) {
	                Spiller.nesteTrekk(spillere[i]);
	                if (spillere[i].getPoeng() >= 100) {
	                    vinner = i;
	                    break;
	                }
	            }
	            
	        }
	    }
}
	

