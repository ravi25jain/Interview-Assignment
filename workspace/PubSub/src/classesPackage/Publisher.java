package classesPackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Publisher {
	
	// publisher class Constructor to get publisher and message details and to send it
	public Publisher(){
		String name, msg,subject;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Enter your Name:");
			name=br.readLine();
			System.out.println("Message Subject:");			
			subject=br.readLine();
			System.out.println("Message :");
			msg=br.readLine();
			Message message=new Message(name, msg, subject);
			message.sendMessage();
			System.out.println("Message successfully Send");
				
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
