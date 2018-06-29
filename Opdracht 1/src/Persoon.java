public class Persoon {
	
	private String naam;
	private String datum;
	
	public Persoon(String naam, String datum) {
		this.naam=naam;
		this.datum=datum;
	}
	public String getDag() {
		return naam;
	}
	public String getUur() {
		return datum;
	}
	public String toString() {
		return naam + ", " +"Geboren op: "+ datum;
	}
}
