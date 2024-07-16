package com.korea.rest.vo;

import lombok.Data;

@Data
// 1.
// controller <--> Mapper <--> xml
//    ㄴ> html
public class ProductVO {
	private int productId;
	private String productName;
	private int productStock;
	private int productPrice;
	private String registerDate;
	private String updateDate;
}
