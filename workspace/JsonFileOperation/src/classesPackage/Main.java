package classesPackage;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
// necessary Import for handling JSON  specified in JSON- simple Library
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Main {

	public static void main(String[] args) {
		
		BufferedReader br;	// To Read console Input
		JSONParser parser=new JSONParser(); 	// To Parse the JSON File
		JSONArray jarr;		// To Store the JSON Array
		JSONObject jobj;	// To Extract and Store Single JSON Object 
		
		// List To hold all the Consumers details Stored In JSON File
		List <Consumer>consumerList = new ArrayList<Consumer>();
		Consumer temp;		// Temporary Consumer Object  
		Search search=new Search();		// Search Class object to perform search Operations 
		int choice=0;		// Switch Choice
		String searchStr="";	
		
		try {
			// Reading data from JSON file and store in ConsumerList ---------------------
			// Parsing Each of JSON object from the file through JSON parser
			jobj=(JSONObject)parser.parse(new FileReader("Files/consumpro.json"));
			jarr=(JSONArray)jobj.get("consumer");  	// Extracting each of consumer details and store it in JSON Array
			
			//Storing consumers Details in Consumer List===============
			for(int i=0;i<jarr.size();i++){
				jobj=(JSONObject)jarr.get(i);				
				temp=new Consumer();
				temp.setDetails(jobj);
				consumerList.add(temp);
			}//========================================================
			//----------------------------------------------------------------------------
			br=new BufferedReader(new InputStreamReader(System.in));
			while(choice!=9){
				System.out.println("Press 1 to search by Produc Nmae");
				System.out.println("Press 2 to search by Consumer Name");
				System.out.println("press 9 to exit");
				choice=Integer.parseInt(br.readLine());
				switch(choice){
				case 1:
					System.out.println("Enter Product Name:");
					searchStr=br.readLine();
					search.searchByProduct(consumerList, searchStr);
					break;
				case 2:
					System.out.println("Enter Consumer Last Name:");
					searchStr=br.readLine();
					search.searchByName(consumerList, searchStr);
					break;
				case 9:
					break;
				default :
					System.out.println("Wronge Choice");
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
	}

}
