package classesPackage;

import org.json.simple.JSONObject;

public class Consumer {

	private String id,firstname,lastname,productname,price,quantity,total;
	
	//Method to extract detais of Individual Details of the Customer from JSON Object
	public void setDetails(JSONObject jobj){
		this.id=(String)jobj.get("id");
		this.firstname=(String)jobj.get("firstname");
		this.lastname=(String)jobj.get("lastname");
		this.productname=(String)jobj.get("productname");
		this.price=(String)jobj.get("price");
		this.quantity=(String)jobj.get("quantity");
		this.total=(String)jobj.get("total");
	}

	// Getter methods to get access on member variables 
	public String getId() {
		return id;
	}
	public String getFirstname() {
		return firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public String getProductname() {
		return productname;
	}
	public String getPrice() {
		return price;
	}
	public String getQuantity() {
		return quantity;
	}
	public String getTotal() {
		return total;
	}
}
