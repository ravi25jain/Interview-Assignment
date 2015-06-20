package ClassesPackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		Convertor convert=new Convertor();
		String filePath;
		try {
			System.out.println("Enter the file path:");
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			filePath=br.readLine();
			convert.convert(filePath);	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
