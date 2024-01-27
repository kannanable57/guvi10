package task10;

public class Array {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
    //create an array of product object
		Product[] obj = new Product[4];
		//create& initialize actual product objects using constructor
		obj[0]=new Product(01,"Black tea");
		
		obj[1]=new Product(02,"Green tea");
		
		obj[2]=new Product(03,"Herbal tea");
		
		obj[3]=new Product(04,"Milk tea");
		//Display the product object data
		
		System.out.println("Product object 1:");
		obj[0].disply();
		
		System.out.println("Product object 2:");
		obj[1].disply();
		
	    System.out.print("Product object 3:");
	    obj[2].disply();

        System.out.println("Product object 1:");
        obj[3].disply();
	}
	
}

//Product class with product id and product name as attributes

class Product

{
	int pro_id;
	String pro_name;
	//Product class constructor
	Product(int pid, String n)
	{
	pro_id = pid;
	
	pro_name=n;
	}
	public void disply()
	{
	System.out.print("Product Id="+pro_id+" "+"Product Name ="+pro_name);
	System.out.println();
	
	}
	
}
	
