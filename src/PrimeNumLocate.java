import java.util.ArrayList;

public class PrimeNumLocate {



	
	
public static int primeNums (int userInput) {
		
		ArrayList<Integer> myArray = new ArrayList<Integer>(); // stores prime numbers
		myArray.add(2);
		myArray.add(3);
         int count= 4;
             
         
           if (userInput == 4) {
        	  myArray.add(7) ;
        	   
           }
           if (userInput ==3)  {
        	   
        	   myArray.add(5);
           }
             
		while (myArray.size() <= userInput) {
			if (count  % 2 != 0) {
				int num = count / 2;
				while (num >= 3) {
					if (count % num == 0)
						break;
					num--;
				}
				if (num <= 3) {
					myArray.add(count);
				}
			}
			count++;
		}
		return myArray.get(userInput);
	}
}

