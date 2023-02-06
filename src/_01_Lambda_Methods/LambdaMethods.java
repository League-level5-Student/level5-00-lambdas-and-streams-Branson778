package _01_Lambda_Methods;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.
	//done
		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
		printCustomMessage((s)->{
			for(int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, "repeat");
		
		//2. Call the printCustonMessage method using a lambda so that the String prints backwards.
		printCustomMessage((s) ->{
					String backwards = "";
					for(int i = s.length()-1; i > -1; i--) {
						backwards = backwards+s.charAt(i);
					}
					System.out.println(backwards);
				},"repeat");
		//3. Call the printCustonMessage method using a lambda so that the String prints with a mix between upper an lower case characters.
		printCustomMessage((s) ->{
			String uplow = "";
			for (int i = 0; i < s.length(); i++) {
				if(i%2==0) {
					String temp = ""+ s.charAt(i);
					uplow = uplow + temp.toUpperCase();
				}
				else {
					String temp = ""+ s.charAt(i);
					uplow = uplow + temp.toLowerCase();
				}
			}
			System.out.println(uplow);
		}, "repeat");
		//4. Call the printCustonMessage method using a lambda so that the String prints with a period in between each character.
		printCustomMessage((s) ->{
			String period = "";
			for (int i = 0; i < s.length(); i++) {
				period = period + s.charAt(i)+ ".";
			}
			System.out.println(period);
		},"repeat");
		//5. Call the printCustonMessage method using a lambda so that the String prints without any vowels.
	    printCustomMessage((s) ->{
	    	String noVow = "";
	    	for (int i = 0; i < s.length(); i++) {
				if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
					continue;
				}
				else {
					noVow = noVow+s.charAt(i);
				}
			}
	    	System.out.println(noVow);
	    },"repeat");
	}
	
	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
	
