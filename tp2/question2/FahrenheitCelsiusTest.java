package question2;
public class FahrenheitCelsiusTest extends junit.framework.TestCase
{
    // Définissez ici les variables d'instance nécessaires à vos engagements;
    // Vous pouvez également les saisir automatiquement du présentoir
    // à l'aide du menu contextuel "Présentoir --> Engagements".
    // Notez cependant que ce dernier ne peut saisir les objets primitifs
    // du présentoir (les objets sans constructeur, comme int, float, etc.).

    /**
     * Constructeur de la classe-test FahrenheitCelsiusTest
     */
    public FahrenheitCelsiusTest()
    {
    }

    /**
     * Met en place les engagements.
     *
     * Méthode appelée avant chaque appel de méthode de test.
     */
    protected void setUp() // throws java.lang.Exception
    {
        // Initialisez ici vos engagements

    }

    /**
     * Supprime les engagements
     *
     * Méthode appelée après chaque appel de méthode de test.
     */
    protected void tearDown() // throws java.lang.Exception
    {
        //Libérez ici les ressources engagées par setUp()
    }

   public void test_fahrenheitEnCelsius() {
		assertEquals("    0 °F -> -17.7 °C ? ", -17.7, question2.FahrenheitCelsius.fahrenheitEnCelsius(0), 0.1);
		assertEquals("  100 °F -> 37.7 °C ? ", 37.7, question2.FahrenheitCelsius.fahrenheitEnCelsius(100), 0.1);
		assertEquals(" 2000 °F -> 1093.3 °C ?", 1093.3, question2.FahrenheitCelsius.fahrenheitEnCelsius(2000), 0.1);
		assertEquals("   54 °F -> 12.2 °C ?", 12.2, question2.FahrenheitCelsius.fahrenheitEnCelsius(54), 0.1);
	}

}

