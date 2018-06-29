//Methodes die je kan opvragen
public class Boek {
	
	private String titel;
	private String auteur;
	private String ISBN;
	
	
	public Boek(String titel, String auteur, String ISBN) {
		this.titel=titel;
		this.ISBN=ISBN;
		this.auteur=auteur;

	}
	public String getDag() {
		return titel;
	}
	
	public String getISBN() {
		return ISBN;
	}
	public String getAuteur() {
		return auteur;
	}
	public String toString() {
		return "Auteur: "+ auteur + "  " + "Titel: "+ titel + "  " + "ISBN:" + ISBN;
	}
}
