import javax.swing.*;
import java.awt.*;   // Nodig voor Graphics
   
public class Oefening0704App extends JFrame {
  public static void main( String args[] ) {
    JFrame frame = new Oefening0704App();
    frame.setSize( 600, 300 );
    frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    frame.setTitle( "Oefening0301" );
    frame.setContentPane( new Oefening0704Paneel() );
    frame.setVisible( true );
  }
}

