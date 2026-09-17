package assingnment1;
import java.util.Scanner;

public class BillingSystem {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your item name here please!");
		String item = sc.nextLine();
		
		System.out.println("Enter your quantity of that item ");
		int quantity = sc.nextInt();
		
		System.out.println("so the price of that item is, please mention here.. for further discount process!");
		Float price = sc.nextFloat();
		
		float total = quantity*price;
		float discount = 0;
		
		if (total >= 5000)
		{
			System.out.println("so the discount becomes : ");
			discount = total * 0.10f;
			System.out.println ("Discount" + discount);
		}
		else if (total < 5000)
		{
			System.out.println("so the discount becomes :");
			discount = total * 0.05f;
			System.out.println(" discount is " + discount);
		}

		
		float final_amount = total - discount;
		
		System.out.println("item name is : " + item );
		System.out.println("item quantity is :" + quantity );
		System.out.println("item price is : "+ price);
		System.out.println("the discount price is : "+ discount);
		System.out.println("so th total final amount applicable discount is : "+ final_amount);
		
		sc.close();
	}
}
