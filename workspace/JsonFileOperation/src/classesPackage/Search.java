package classesPackage;

import java.util.List;

public class Search {
	
	// Method to search the name of consumer who had consumed specified product
	public void searchByProduct(List <Consumer>consumerList, String product){
		int flag=0;
		for(int i=0;i<consumerList.size();i++){
			if(product.equalsIgnoreCase(consumerList.get(i).getProductname())){
				System.out.println(consumerList.get(i).getFirstname()+" "+consumerList.get(i).getLastname());
				flag++;
			}
		}
		if(flag==0){
			System.out.println("Product Not Found in the list");
		}
	}
	
	// Method to search the products consumed by any of customer
	public void searchByName(List <Consumer>consumerList, String name){
		int flag=0;
		for(int i=0;i<consumerList.size();i++){
			if(name.equalsIgnoreCase(consumerList.get(i).getLastname())){
				System.out.println(consumerList.get(i).getProductname());
				flag++;
			}
		}
		if(flag==0){
			System.out.println("Consumer Not Found in the list");
		}
	}
}
