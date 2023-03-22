package Inteface.Task3;

public class Product {
private int productId;
private String ProductName;
private double productPrice;
public double getProductPrice() {
	return productPrice;
}
public void setProductPrice(double productPrice) {
	this.productPrice = productPrice;
}
private String type;
public int getProductId() {
	return productId;
}
public void setProductId(int productId) {
	this.productId = productId;
}
public String getProductName() {
	return ProductName;
}
public void setProductName(String productName) {
	ProductName = productName;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}

}
