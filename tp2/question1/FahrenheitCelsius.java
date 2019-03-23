package question1;
public class FahrenheitCelsius {

	public static void main(String[] args) {
	   
		int fahrenheit = 0;
		float celsius = 0;

		//La valeur de '°'
		final String degre = "\u00B0";
		
		//Les valeurs de Fahrenheit sont storées dans args
		for(int x=0;x<args.length;x++){
			try {
				fahrenheit=Integer.parseInt(args[x]);
				celsius=fahrenheitEnCelsius(Integer.parseInt(args[x]));
				System.out.println(fahrenheit + degre + "F -> " + celsius + degre + "C");
					
			} catch (Exception e) {
				System.out.println("Une erreur a occure dans question 1");
			}																	
	
}}

	public static float fahrenheitEnCelsius(int f) {
				int newFahrenheit = f - 32;
				float c = 5/9f * newFahrenheit;
				//Calcul de conversion
                 float final=(int)(c*10)/10.0f;
		return final;
	}

}
