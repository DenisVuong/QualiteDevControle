import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest

public class TestCalculatrice extends Calculatrice{

    private Calculatrice calcul = new Calculatrice();

    @Test
    void testAdd(){
        assertEquals(calcul.add(2,3),5,"Ceci est la bonne répone");
        assertNotEquals(calcul.add(2,3),6,"Mauvaise réponse, la bonne réponse est 5");
    }

    @Test
    void testDiv(){
        assertEquals(calcul.div(10, 2), 5.0, "Ceci est la bonne réponse");
        assertNotEquals(calcul.div(10,2),4.5,"Ceci est la mauvaise réponse");
    }

    @Test
    void testMult(){
        assertEquals(calcul.mult(5,5),25,"C'est la bonne réponse");
        assertNotEquals(calcul.mult(5,5), 30, "C'est la mauvaise réponse");
    }

    @Test
    void testMinus(){
        assertEquals(calcul.minus(5,5), 0, "C'est la bonne réponse");
        assertNotEquals(calcul.minus(5,5),-5,"Ce n'est pas la bonne réponse");

    }
}
