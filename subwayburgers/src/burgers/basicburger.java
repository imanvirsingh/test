package burgers;
import java.util.Scanner;

public class basicburger {

	public static void main(String[] args) {
		double total=0;
		char choice='Y';
		Scanner input= new Scanner(System.in);
		do {
			System.out.println("1- Basic Hamburger on a white roll with Sausage.");
			System.out.println("COST :- 3.60");
			System.out.println();
			System.out.println("1- Healthy Hamburger on a white roll with Sausage.");
			System.out.println("COST :- 5.60");
			System.out.println();
			System.out.println("3- Deluxe Hamburger on a white roll with Sausage.");
			System.out.println("COST :- 14.45");
			System.out.println();
			System.out.println("4- Exit");
			System.out.println();
			System.out.println("Enter your choice from 1-4");
			int bchoice = input.nextInt();
			if(bchoice==1) {
			burger_base bug1= new burger_base();
			total=total+bug1.base_ret();
			}
			if(bchoice==2) {
				healthy bug2= new healthy();
				total=total+bug2.healthy_ret();
				}
			if(bchoice==3) {
				Deluxe bug3= new Deluxe();
				total=total+bug3.Deluxe_ret();
				}
			if(bchoice==4) {
				break;
				}
			System.out.println("Total Price:"+ total);
			System.out.println("Do you want another Burger??(Y/N)");
			choice = input.next().charAt(0);
		}
		while(choice=='Y'|| choice=='y');
		System.out.println("Thankyou");

	}

}
