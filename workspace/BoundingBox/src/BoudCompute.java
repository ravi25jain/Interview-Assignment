import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BoudCompute {

	public static void main(String[] args) {
		
		//Variable Decelerations
		int x[]=new int[10]; 		//Array to store the x coordinates of points
		int y[]=new int[10];		//Array to store the y coordinates of points
		int maxX, maxY, minX, minY;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));		//BufferedReader object to read date from Console
		
		try {
			//Reading the 10 points ----------------------
			System.out.println("Enter 10 x values for the points");
			for(int i=0;i<10;i++){
				x[i]=Integer.parseInt(br.readLine());
			} 
			
			System.out.println("Enter 10 y values for the points");
			for(int i=0;i<10;i++){
				y[i]=Integer.parseInt(br.readLine());
			} 
			//-------------------------
			
			//find Maximum And Minimum x and y values
			maxX=max(x);
			maxY=max(y);
			minX=min(x);
			minY=min(y);
			
			System.out.println("Points for the Bounding Box are");
			System.out.println("NW = ("+maxX+", "+ maxY+")");
			System.out.println("NE = ("+minX+", "+ maxY+")");
			System.out.println("SW = ("+maxX+", "+ minY+")");
			System.out.println("SE = ("+minX+", "+ minY+")");
			
		}catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}

	}
	
	//Method to Find the maximum Value of the Array
	static int max(int []arr){
		int maximum;
		maximum=arr[0];
		for(int i=1;i<arr.length;i++){
			if(maximum<arr[i]){
				maximum=arr[i];
			}
		}
		return maximum;
	}

	//Method to Find Minimum value of the array
	static int min(int []arr){
		int minimum;
		minimum=arr[0];
		for(int i=1;i<arr.length;i++){
			if(minimum>arr[i]){
				minimum=arr[i];
			}
		}
		return minimum;
	}
}
