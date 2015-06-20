package classesPackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Subscriber {
	
	// subscriber class constructor to get the message of specific topic
	public Subscriber(){
		String topic;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try{
			System.out.println("Enter the message topic u want to search");
			topic=br.readLine();
			MsgRepository repo=new MsgRepository();
			repo.search(topic);
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

}
