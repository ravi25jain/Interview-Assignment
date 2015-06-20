package classesPackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int choice=0;
		try {
			while(choice!=9){
				System.out.println("How you want to use the System??");
				System.out.println("press 1 for Publisher");
				System.out.println("press 2 for Subscriber");
				System.out.println("press 9 to exit");
				choice=Integer.parseInt(br.readLine());
				switch(choice){
				case 1:
					new Publisher();
					break;
				case 2:
					new Subscriber();
					break;
				case 9:
					break;
				default:
					System.out.println("Wronge Choice");
					break;
				}
			}
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
	}

}
