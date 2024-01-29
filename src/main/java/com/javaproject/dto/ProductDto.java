package com.javaproject.dto;

public class ProductDto {

	int product_code;

	String product_name;
	String product_color;
	int product_qty;
	int product_size;
	int product_price;
	String imageFilePath;
	String imageFilePath_ShoeImageDir;

	String product_detail;

	// Constructor
	public ProductDto(

			// 상품 코드 : 상품 이름 : 상품 이미지
			int product_code, String product_name, String imageFilePath,

			// 상품 수량 : 상품 사이즈 : 상품 가격 : 상품 색상
			int product_qty, int product_size, int product_price, String product_color,
			String imageFilePath_ShoeImageDir) {
		super();
		this.product_code = product_code;
		this.product_name = product_name;
		this.product_color = product_color;
		this.product_qty = product_qty;
		this.product_size = product_size;
		this.product_price = product_price;
		this.imageFilePath = imageFilePath;
		this.imageFilePath_ShoeImageDir = imageFilePath_ShoeImageDir;
	}

	// 상세페이지에서 실행 하는 다오의 결과값을 받는 dto , 특정 상품명을 선택하면 그 상품명에는 다수의 상품디테일이 있으므로 dtos
	// 가필요하고
	// 그에대한 수량이 필요함. 그리고 나머지는 다 상품디테일의 스트링안에 정보가 담겨있으므로 만들필요없음 .

	public ProductDto(int product_qty, String product_detail) {
		super();
		this.product_qty = product_qty;
		this.product_detail = product_detail;
	}

	public ProductDto(String product_name, String product_color, int product_qty, int product_size, int product_price,
			String product_detail) {
		super();
		this.product_name = product_name;
		this.product_color = product_color;
		this.product_qty = product_qty;
		this.product_size = product_size;
		this.product_price = product_price;
		this.product_detail = product_detail;
	}

	public int getProduct_code() {
		return product_code;
	}

	public void setProduct_code(int product_code) {
		this.product_code = product_code;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public String getProduct_color() {
		return product_color;
	}

	public void setProduct_color(String product_color) {
		this.product_color = product_color;
	}

	public int getProduct_qty() {
		return product_qty;
	}

	public void setProduct_qty(int product_qty) {
		this.product_qty = product_qty;
	}

	public int getProduct_size() {
		return product_size;
	}

	public void setProduct_size(int product_size) {
		this.product_size = product_size;
	}

	public int getProduct_price() {
		return product_price;
	}

	public void setProduct_price(int product_price) {
		this.product_price = product_price;
	}

	public String getImageFilePath() {
		return imageFilePath;
	}

	public void setImageFilePath(String imageFilePath) {
		this.imageFilePath = imageFilePath;
	}

	public String getImageFilePath_ShoeImageDir() {
		return imageFilePath_ShoeImageDir;
	}

	public void setImageFilePath_ShoeImageDir(String imageFilePath_ShoeImageDir) {
		this.imageFilePath_ShoeImageDir = imageFilePath_ShoeImageDir;
	}

	public String getProduct_detail() {
		return product_detail;
	}

	public void setProduct_detail(String product_detail) {
		this.product_detail = product_detail;
	}

}
