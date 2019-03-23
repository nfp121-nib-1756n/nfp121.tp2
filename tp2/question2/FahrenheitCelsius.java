package question2;


public class FahrenheitCelsius{

     /** le point d'entr�e de cette application, 
      * dont le commentaire est � compl�ter
      *
      *  @param args ...
      */
     public static void main(String[] args){
       int fahrenheit = 0;
    float celsius = 0;
    final String degre = "\u00B0";
         try{
       for(int x=0;x<args.length;x++){
		    fahrenheit=Integer.parseInt(args[x]);
		    celsius=fahrenheitEnCelsius(Integer.parseInt(args[x]));
		System.out.println(fahrenheit + degre + "F -> " + celsius + degre + "C"); // ligne,
																				// format
																				// impos�s
																				
	

      
       }}catch(NumberFormatException ex){
           System.out.println("error : " + ex.getMessage());  // en cas d'erreur 
       }
       
     }
     
     /** 
      * la m�thode � compl�ter. 
      *   @param f la valeur en degr� Fahrenheit
      *   @return  la conversion en degr� Celsius
      */
     public static float fahrenheitEnCelsius( int f ) {
      int newFahrenheit = f - 32;

         float celsius=5/9f * newFahrenheit;
                 float final=(int)(celsius*10)/10.0f;
		return final;
     }

}