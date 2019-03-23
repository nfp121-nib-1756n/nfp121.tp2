package question2;
public class FahrenheitCelsiusTest extends junit.framework.TestCase
{
    // D�finissez ici les variables d'instance n�cessaires � vos engagements;
    // Vous pouvez �galement les saisir automatiquement du pr�sentoir
    // � l'aide du menu contextuel "Pr�sentoir --> Engagements".
    // Notez cependant que ce dernier ne peut saisir les objets primitifs
    // du pr�sentoir (les objets sans constructeur, comme int, float, etc.).

    /**
     * Constructeur de la classe-test FahrenheitCelsiusTest
     */
    public FahrenheitCelsiusTest()
    {
    }

    /**
     * Met en place les engagements.
     *
     * M�thode appel�e avant chaque appel de m�thode de test.
     */
    protected void setUp() // throws java.lang.Exception
    {
        // Initialisez ici vos engagements

    }

    /**
     * Supprime les engagements
     *
     * M�thode appel�e apr�s chaque appel de m�thode de test.
     */
    protected void tearDown() // throws java.lang.Exception
    {
        //Lib�rez ici les ressources engag�es par setUp()
    }

   public void test_fahrenheitEnCelsius() {
        final String degre = "\u00B0";
        assertEquals("    0 " + degre + "F -> -17.7 " + degre + "C ? ", -17.7, question1.FahrenheitCelsius.fahrenheitEnCelsius(0), 0.1);
        assertEquals("  100 " + degre + "F -> 37.7 " + degre + "C ? ", 37.7, question1.FahrenheitCelsius.fahrenheitEnCelsius(100), 0.1);
        assertEquals(" 2000 " + degre + "F -> 1093.3 " + degre + "C ?", 1093.3, question1.FahrenheitCelsius.fahrenheitEnCelsius(2000), 0.1);
        assertEquals("   54 " + degre + "F -> 12.2 " + degre + "C ?", 12.2, question1.FahrenheitCelsius.fahrenheitEnCelsius(54), 0.1);
	}

}

