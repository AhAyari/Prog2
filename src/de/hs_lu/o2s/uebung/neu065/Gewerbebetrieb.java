package de.hs_lu.o2s.uebung.neu065;

public class Gewerbebetrieb {

	private String name;
	private int gruendungsjahr;
	
	
	public Gewerbebetrieb() {
		this.name = "KEIN NAME";
		this.gruendungsjahr = -1;
	}
	
	public Gewerbebetrieb(String name, int gruendungsjahr) {
		this.name = name;
		this.gruendungsjahr = gruendungsjahr;
	}
	
	public String toString() {
		return this.getClass().getSimpleName() + " mit dem Namen: " + this.name + " und dem Gründungsjahr: " + this.gruendungsjahr;
	}

}
