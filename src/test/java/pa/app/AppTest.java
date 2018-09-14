package pa.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Unit test for Maven JUnit 5 - Hello world!
 * @author  Paulo Araújo
 * @version 1.0
 */

public class AppTest 
{
	
	public static App calc;
	
	@BeforeAll
    static void beforeAll() {
        System.out.println("Inicializações Globais");
        calc=new App(0,0);
    }
	
	@BeforeEach 
	public void init() {
		System.out.println("@BeforeEach - Runbefore Each method");
	}	
	
    @DisplayName("First Test - concat")
	@Test
	void testAdd() {
    	int num1 = 5;
    	int num2 = 5;
    	int result = calc.add(num1, num2);    	
    	int certo = num1+num2;
    	assertTrue(result==certo);
    }
    
    @Test
	void testSub() {
    	int num1 = 5;
    	int num2 = 5;
    	int result = calc.sub(num1, num2);    	
    	int certo = num1-num2;
    	assertTrue(result==certo);
    }
    
    @Test
	void testMult() {
    	int num1 = 5;
    	int num2 = 5;
    	int result = calc.mult(num1, num2);    	
    	int certo = num1*num2;
    	assertTrue(result==certo);
    }
    
    @Test
	void testDiv() {
    	int num1 = 5;
    	int num2 = 5;
    	int result = calc.div(num1, num2);    	
    	int certo = num1/num2;
    	assertTrue(result==certo);
    }
    
    
}
