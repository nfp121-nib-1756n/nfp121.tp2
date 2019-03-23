package question1;
public class FahrenheitCelsius {

	public static void main(String[] args) {
	   
		int fahrenheit = 0;
		float celsius = 0;
		
		for(int x=0;x<args.length;x++){
		    fahrenheit=Integer.parseInt(args[x]);
		    celsius=fahrenheitEnCelsius(Integer.parseInt(args[x]));
		System.out.println(fahrenheit + "\u00B0F -> " + celsius + "\u00B0C"); // ligne,
																				// format
																				// imposés
																				
	
}}

	public static float fahrenheitEnCelsius(int f) {
                float celsius=5/9f * (f-32);
                 float resultat=(int)(celsius*10)/10.0f;
		return resultat;
	}

}
