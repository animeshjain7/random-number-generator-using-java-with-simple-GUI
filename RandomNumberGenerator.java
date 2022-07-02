package rngenerator;
import java.util.Scanner;

public class RandomNumberGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner (System.in);
		int mynumber = (int)(Math.random()*100);
		int usernumber;
		do {
			System.out.println("Guess my number(1-100) : ");
			
			 usernumber = s.nextInt();
			if(mynumber==usernumber) {
				System.out.println("------Great Right Choice------");
				break;
				
			}
			else if (usernumber > mynumber) {
				System.out.println("your number is too large");
				
			}
			else {
				System.out.println("your number is too small");
			}
		} while(usernumber>=0);
		System.out.println("My number was : ");
		System.out.println(mynumber);
	}

}
