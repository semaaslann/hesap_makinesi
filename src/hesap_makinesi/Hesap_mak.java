package hesap_makinesi;

import java.util.Scanner;

public class Hesap_mak {

	public static void main(String[] args) {
		
			Scanner input = new Scanner(System.in);
			System.out.println("welcome! please follow the steps bellow");
			System.out.print("1. number:");
			float a = input.nextInt();
			System.out.print("2. number:");
			float b = input.nextInt();
			
			
			System.out.print("select one action:\n" + "1)add\n" + "2)sub\n" + "3)mul\n" + "4)divi\n\n"  );
			System.out.print("your action : ");
			int select = input.nextInt();
			
			if(select == 1) {
				System.out.println("answer : " + a + b);
			}
			else if(select == 2) {
				System.out.println("answer : "  + (a - b));
			}
			else if (select == 3) {
				System.out.println("answer : " + a * b);
			}
			else if(select == 4){
				if(b == 0) {
					System.out.println("you can't choose 0");
				}
				else {
				System.out.println("answer : " + a / b);
			}
			}
			else {
				System.out.println("please enter a valid transaction");
			}
			
		}

}
