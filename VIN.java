import java.util.Scanner;

public class VIN {
	//JHMCB7658LCO56658
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter VIN number: ");
		String vin = input.nextLine();
		//String manufacturer = null,description=null,checkDigit=null,identification=null ;
		while(!(vin.equals(""))) {
			String manufacturer = vin.substring(0,3);
			String description = vin.substring(3,8);
			String checkDigit = vin.substring(8,9);
			String identification = vin.substring(8);
			System.out.println("World manufacturer identifier: "+ manufacturer);
			System.out.println("vehicle description section: "+description);
			System.out.println("Check digit: "+ checkDigit);
			System.out.println("Vehicle identification section: "+ identification);
			char country = manufacturer.charAt(0);
			switch (country) {
			case 'J' :
				System.out.println("Country of manufacture is Japan");
				break;
				
			case '1' :
				System.out.println("Country of manufacture is USA");
				break;
			case '2' :
				System.out.println("Country of manufacture is Canada");
				break;
			case '3' :
				System.out.println("Country of manufacture is Mexico");
				break;
			default :
				System.out.println("Error");
				break;
			}
			System.out.print("Enter new VIN number: ");
			vin = input.nextLine();
		}
		
		
	}

}
