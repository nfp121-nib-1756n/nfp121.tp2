package question3;
import question1.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class IHMFahrenheit extends JFrame implements ActionListener{
  private JTextField fahrenheitInput = new JTextField( 10 );
  /** Le bouton de conversion. */
  private JButton  convertButton = new JButton( "convertir" );
  /** La sortie en degré Celsius. */
  private JTextField celsiustOutput = new JTextField( 10 );

  public IHMFahrenheit(){
    super("IHM Fahrenheit");
 
    setLayout(new FlowLayout());
    add( fahrenheitInput ); add( convertButton ); add( celsiustOutput );
    sortie.setEditable( false );
    getContentPane().setBackground( Color.pink );
    setLocation(250, 250);
    pack();setVisible(true);
    
    convertButton.addActionListener( this );
  }

 
  public void actionPerformed( ActionEvent ae ){
    try{
      String input = fahrenheitInput.getText();
      int fahrenheit = Integer.parseInt(input);
      float celsius = FahrenheitCelsius.fahrenheitEnCelsius(fahrenheit); 
      //Pour eviter les valeurs irreelles
      if(celsius < -273.1F) celsius = -273.1F;
      celsiustOutput.setText(Float.toString(celsius));
    }catch(NumberFormatException nfe){
      celsiustOutput.setText("Oops, " + input + " could not be converted!");
    }
  }
  
  
  public static void main(String[] args){
      new IHMFahrenheit();
    }
}
