package beginner_java;
import java.util.Scanner;
public class vetri {

	public static void main(String[] args) {
		Scanner rat=new Scanner(System.in);
		System.out.println("Enter your 12th mark.");
		System.out.println("Tamil:");
		int a=rat.nextInt();
		System.out.println("English:");
		int b=rat.nextInt();
		System.out.println("Maths:");
		int c=rat.nextInt();
		System.out.println("Chemistry:");
		int d=rat.nextInt();
		System.out.println("Physics:");
		int e=rat.nextInt();
		System.out.println("Computer science:");
		int f=rat.nextInt();
		int total=a+b+c+d+e+f;
		System.out.println("Total marks:"+total);
			if(a>=35&&b>=35&&c>=35&&d>=35&&e>=35&&f>=35) {
			System.out.println("You are completed 12th");
			float cut=d+e;
			float off=cut/2;
			float cutoff=c+off;
			System.out.println("Cutoff:"+cutoff);
			rat.nextLine();
			if(cutoff>=180) {
				System.out.println("Selected to 1-st Round");
				System.out.println("Hostel or Dayscholar:");
				String eat=rat.nextLine();
				if(eat.equals("Hostel")||eat.equals("hostel")||eat.equals("HOSTEL")) {
					System.out.println("You choose hostel");
					System.out.println("pay your hostel amount:");
					int amount=rat.nextInt();
					if(amount==85000) {
						System.out.println("You completed your hostel fees");
					}
					else if(amount!=85000){
						int balance=85000-amount;
						System.out.println("You not comleted hostel fees");
						System.out.println("Balance amount:"+balance);
					}
				}
					else {
						System.out.println("You choose dayscholar");
						System.out.println("Pay your bus fees:");
						int fees=rat.nextInt();
						if(fees==15000) {
							System.out.println("you completed bus fees");
						}
						else{
							int balance=15000-fees;
							System.out.println("Pay your balance bus fees");
							System.out.println("Balance fees:"+balance);
						}
					}
			}
			else if(cutoff<180&&cutoff>=150) {
				System.out.println("Selected to 2-nd Round");
				System.out.println("Hostel or Dayscholar:");
				String eat=rat.nextLine();
				if(eat.equals("Hostel")||eat.equals("hostel")||eat.equals("HOSTEL")) {
					System.out.println("You choose hostel");
					System.out.println("pay your hostel amount:");
					int amount=rat.nextInt();
					if(amount==85000) {
						System.out.println("You completed your hostel fees");
					}
					else if(amount!=85000){
						int balance=85000-amount;
						System.out.println("You not comleted hostel fees");
						System.out.println("Balance amount:"+balance);
					}
				}
					else {
						System.out.println("You choose dayscholar");
						System.out.println("Pay your bus fees:");
						int fees=rat.nextInt();
						if(fees==15000) {
							System.out.println("you completed bus fees");
						}
						else{
							int balance=15000-fees;
							System.out.println("Pay your balance bus fees");
							System.out.println("Balance fees:"+balance);
						}
					}
			}
			else {
				System.out.println("Selected to 3-rd Round");
				System.out.println("Hostel or Dayscholar:");
				String eat=rat.nextLine();
				if(eat.equals("Hostel")||eat.equals("hostel")||eat.equals("HOSTEL")) {
					System.out.println("You choose hostel");
					System.out.println("pay your hostel amount:");
					int amount=rat.nextInt();
					if(amount==85000) {
						System.out.println("You completed your hostel fees");
					}
					else if(amount!=85000){
						int balance=85000-amount;
						System.out.println("You not comleted hostel fees");
						System.out.println("Balance amount:"+balance);
					}
				}
					else {
						System.out.println("You choose dayscholar");
						System.out.println("Pay your bus fees:");
						int fees=rat.nextInt();
						if(fees==15000) {
							System.out.println("you completed bus fees");
						}
						else{
							int balance=15000-fees;
							System.out.println("Pay your balance bus fees");
							System.out.println("Balance fees:"+balance);
						}
					}
			}
		}
		else {
			System.out.println("Fail in 12th");
			System.out.println("You not completed 12th");
		}
	}
}
