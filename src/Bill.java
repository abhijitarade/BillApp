
public class Bill {
	private int prodId;
	private String prodName;
	private double price;
	private int quantity;
	public Bill(int prodId, String prodName, double price, int quantity) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
		this.price = price;
		this.quantity = quantity;
	}
	public void printProduct()

	{
		System.out.println("Product Id : "+prodId);
		System.out.println("Product Name : "+prodName);
		System.out.println("Product Price : "+price);
		System.out.println("Product Quantity : "+quantity);
		double bill=price*quantity;
		System.out.println("Bill : "+bill);	
	}

}
