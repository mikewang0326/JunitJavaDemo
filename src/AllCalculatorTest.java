import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;



@RunWith (Suite.class)
@SuiteClasses(value = { CalculatorTest.class, SquareTest.class }) 
public class AllCalculatorTest {
	
	public static void main(String[] args) {
		
	}

}
