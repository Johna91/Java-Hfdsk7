import javax.swing.*;
import java.awt.*;   // Nodig voor Graphics
   
public class Oefening0705App extends JFrame {
  public static void main( String args[] ) {
    JFrame frame = new Oefening0705App();
    frame.setSize( 600, 600 );
    frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    frame.setTitle( "Oefening0705" );
    frame.setContentPane( new Oefening0705Paneel() );
    frame.setVisible( true );
  }
}

