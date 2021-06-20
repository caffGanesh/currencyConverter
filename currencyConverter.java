package currencyConverter;
import java.util.Scanner;
//
//imported scanner to get user input
//
public class currencyConverter {

	public static void main(String[] args) {
		//
		//asking the user to input the desired USD.
		//
		Scanner USD = new Scanner(System.in);
		System.out.println("What is the desired amount of USD you would like to convert today?");
		//
		//creating the users desired USD to double
		//
		double baseUSD = USD.nextDouble();
		//
		//asking the user to identify which currency they would like to convert their basedUSD to. 
		//
		Scanner pickedCurr = new Scanner(System.in);
		System.out.println("What is the desired currency you would like to convert your $" + baseUSD + " to today?");
		System.out.println("1) USD to Euros.");
		System.out.println("2) USD to Pesos.");
		System.out.println("3) USD to YEN.");
		//
		//creating the users choice of currency into a double.
		//
		double convCurr = pickedCurr.nextDouble();
		//
		//
		//
		double Euros = .92;
		double Pesos = 19.49;
		double YEN = 107.2;
		//
		// Creating a If/Else Statement so depending on which option the user selects, we convert the baseUSD to desired currency and print out the result. 
		//
		if(convCurr == 1){
			double result1 = baseUSD*Euros;
			System.out.println("The original $" + baseUSD + " has been converted to " + result1 + " Euros. Thank you!");
		} else if(convCurr == 2){
			double result2 = baseUSD*Pesos;
			System.out.println("The original $" + baseUSD + " has been converted to " + result2 + " Pesos. Thank you!");
		} else if(convCurr == 3){
			double result3 = baseUSD*YEN;
			System.out.println("The original $" + baseUSD + " has been converted to " + result3 + " YEN. Thank you!");
		}
	}
}