package ClassesPackage;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONObject;

public class Convertor {
	
	
	// this method convert the csv file to JSON with File Handling  
/*	public void convert(String fileName){
		String tempLine="";
	
		try {
			BufferedReader br=new BufferedReader(new FileReader(fileName));					//BufferedReader Object to Read the Content from CSV File
			BufferedWriter bw=new BufferedWriter(new FileWriter("Files/consumpro.json"));	//BufferedWriter Object to Write the content to JSON File
			
			bw.write("{\"consumer\" :[\n"); 	//Writing the Object type which will be stored in the json file 
			
			tempLine=br.readLine();					//Reading the header line from the CSV File
			String []heading=tempLine.split(",");	//Separating the each column heading and storing in string array
			
			tempLine="";
			//Reading remaining lines from the csv file and writing it into the json file------
			while((tempLine=br.readLine())!=null){
				String []temp=tempLine.split(",");
				tempLine="{";
				
				//Generating key pair value for json file object=============
				for(int i=0;i<heading.length;i++){
					tempLine+="\""+heading[i]+"\":\""+temp[i]+"\",";
				}
				//===========================================================
				
				tempLine+="},\n";
				bw.write(tempLine);
			}
			//--------------------------------------------------------------------------------
			
			bw.write("]}");
			bw.close();
			br.close();
			System.out.println("File Successfully Converted.");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	*/
	
	public void convert(String fileName){
		String tempLine="";
		JSONObject obj=new JSONObject();
		
		try {
			BufferedReader br=new BufferedReader(new FileReader(fileName));					//BufferedReader Object to Read the Content from CSV File
			BufferedWriter bw=new BufferedWriter(new FileWriter("Files/consumpro.json"));	//BufferedWriter Object to Write the content to JSON File
			
			bw.write("{\"consumer\" :[\n"); 	//Writing the Object type which will be stored in the json file 
			
			tempLine=br.readLine();					//Reading the header line from the CSV File
			String []heading=tempLine.split(",");	//Separating the each column heading and storing in string array
			
			
			tempLine="";
			//Reading remaining lines from the csv file and writing it into the json file------
			while((tempLine=br.readLine())!=null){
				String []temp=tempLine.split(",");
				
				for(int i=0;i<heading.length;i++){
//					System.out.println(heading[i]);
					obj.put(heading[i], temp[i]);
				}
				
				bw.write(obj.toJSONString()+",\n");
				
				
			}
			bw.write("]}");
			bw.close();
			br.close();
			System.out.println("File Successfully Converted.");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

}
