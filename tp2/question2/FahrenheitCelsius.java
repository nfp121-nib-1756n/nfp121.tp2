package question2;


public class FahrenheitCelsius{

     /** le point d'entrée de cette application, 
      * dont le commentaire est à compléter
      *
      *  @param args ...
      */
     public static void main(String[] args){
       int fahrenheit = 0;
		float celsius = 0;
         try{
       for(int x=0;x<args.length;x++){
		    fahrenheit=Integer.parseInt(args[x]);
		    celsius=fahrenheitEnCelsius(Integer.parseInt(args[x]));
		System.out.println(fahrenheit + "\u00B0F -> " + celsius + "\u00B0C"); // ligne,
																				// format
																				// imposés
																				
	

      
       }}catch(NumberFormatException nfe){
           System.out.println("error : " + nfe.getMessage());  // en cas d'erreur 
       }
       
     }
     
     /** 
      * la méthode à compléter. 
      *   @param f la valeur en degré Fahrenheit
      *   @return  la conversion en degré Celsius
      */
     public static float fahrenheitEnCelsius( int f){
         float celsius=5/9f * (f-32);
                 float resultat=(int)(celsius*10)/10.0f;
		return resultat;
     }

}