
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class partea {
	
	
       /**
        * Jane Austen is a woman, so say “Hello Ms. Austen”. 
        * George Orwell is a man, so say “Hello Mr. Orwell”. 
        * Isaac Newton was knighted, so say "Hello Sir Isaac Newton".
        **/

       @Test
       public void test() {
               partea teaParty = new partea();
              
               assertEquals("Hello Ms. Austen", teaParty.welcome("Austen", true, false));
               assertEquals("Hello Mr. Orwell", teaParty.welcome("Orwell", false, false));
               assertEquals("Hello Sir Isaac Newton", teaParty.welcome("Isaac Newton", false, true));
       }
       
       
       public String welcome(String name, boolean female, boolean knighted)
    {
		String result = "Hello";
		if(female==true&&knighted==false) {
			result+= " Ms. "+ name;
		}
		else if(female==false&&knighted==false)
		{
			result+= " Mr. "+name;
		}
		else if(female==false&&knighted==true) {
			result+=" Sir "+name; 
		}
		System.out.println(result);
		return result;

		
		
    }
}
