//De methodes die je kan opvragen
public class Artikel {

	private String omschrijving, exbtw;
	private double prijsExBtw;
	private double percentage;
	private double verkoopPrijs;



	public Artikel(String omschrijving, double prijsExBtw, double percentage, double verkoopPrijs) {
		this.omschrijving=omschrijving;
		this.prijsExBtw=prijsExBtw;
		this.percentage=percentage;
		this.verkoopPrijs=verkoopPrijs;
		this.exbtw=exbtw;

	}
	public String getOmschrijving() {
		return omschrijving;
	}
	public double getprijsExBtw() {
		return prijsExBtw;

	}

	public double percentage() {
		return percentage;
	}
	public double berekenverkoopPrijs() {
		this.verkoopPrijs=this.prijsExBtw*(1+this.percentage/100);
		return this.verkoopPrijs;
	}
	public String toString() {
		return "Omschrijving: "+ omschrijving;
	}
	public String toString1() {
		return "Verkoopprijs" + this.berekenverkoopPrijs();
	}
	public String toString2() {
		return "exbtw" + prijsExBtw;
	}
	public String toString3() {
		return omschrijving;
	}
}
