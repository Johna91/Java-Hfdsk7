public class Tijdstip {
	private String dag;
	private int uur;
	
	public Tijdstip(String dag, int uur) {
		this.dag=dag;
		this.uur=uur;
	}
	public String getDag() {
		return dag;
	}
	public int getUur() {
		return uur;
	}
	public String toString() {
		return dag + ", " + uur + "e uur";
	}
}
