package Stigespillet;

public class Brett {
	
	private Rute[] ruter;
	
	public Brett() {
		
		ruter = new Rute[100] ;
		
		for (int i = 0; i < ruter.length; i++) {
            ruter[i] = new Rute(); 
		}
		
		
	}

    public void flyttBrikke(Brikke brikke, int antallSteg) {
        
    	// finn brikkens posisjon
    	
    	  int gammelPosisjon = brikke.getPosisjon();

        // finn ny posisjon basert på antall steg
    	  
    	  int nyPosisjon = (gammelPosisjon + antallSteg) % ruter.length ; 
      
    	  
    	  brikke.setPosisjon(nyPosisjon);
    	  ruter[nyPosisjon].utforHandling(brikke); 

    }

}
