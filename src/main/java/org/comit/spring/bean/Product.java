package org.comit.spring.bean;


public class Product {
	
	int idProduct;
	String sku;
	String productName;
	String description;
	String statusProduct;
	String productImage;
	int stockQuantity;
	double productPrice;

	public int getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(int idProduct) {
		this.idProduct = idProduct;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStatusProduct() {
		return statusProduct;
	}

	public void setStatusProduct(String statusProduct) {
		this.statusProduct = statusProduct;
	}

	public String getProductImage() {
		return productImage;
	}

	public void setProductImage(String productImage) {
		this.productImage = productImage;
	}

	public int getStockQuantity() {
		return stockQuantity;
	}

	public void setStockQuantity(int stockQuantity) {
		this.stockQuantity = stockQuantity;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	@Override
	public String toString() {
		return "Product [idProduct=" + idProduct + ", sku=" + sku + ", productName=" + productName + ", description="
				+ description + ", statusProduct=" + statusProduct + ", productImage=" + productImage
				+ ", stockQuantity=" + stockQuantity + ", productPrice=" + productPrice + "]";
	}
	
}
