import java.util.*;

public class Voorraad {
  private ArrayList<Artikel> lijst;
  
  public Voorraad() {
  	lijst = new ArrayList<Artikel>();
  }
  
  public void voegtoe( Artikel artikel ) {
  	lijst.add( artikel );
  }
  
  public void print() {
  	System.out.println( "Voorraad" );
  	for( Artikel artikel : lijst ) {
      System.out.println( artikel );
  	}
  }
}
