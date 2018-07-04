public class Artikel {
  private String omschrijving;
  private int aantal;

  public Artikel( String omschrijving, int aantal ) {
    this.omschrijving = omschrijving;
    this.aantal = aantal;
  }
  public String toString() {
    return String.format( "%-40s  aantal: %4d", omschrijving, aantal );
  }
}