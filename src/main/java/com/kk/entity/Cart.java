package com.kk.entity;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

/**
 * 
 * @author astha.pandey
 *
 */
public class Cart {
	private List<Product> productList;
	private Map<Integer, Integer> productIdVsQuantityMap;

	public List<Product> getProductList() {
		return productList;
	}

	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}

	public Map<Integer, Integer> getProductIdVsQuantityMap() {
		return productIdVsQuantityMap;
	}

	public void setProductIdVsQuantityMap(Map<Integer, Integer> productIdVsQuantityMap) {
		this.productIdVsQuantityMap = productIdVsQuantityMap;
	}
	
	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		Product p1 = new Product();
		p1.setColour("kaala");
		p1.setPrice(99.0);
		p1.setProductId(1);
		
		Product p2 = new Product();
		p2.setColour("bhura");
		p2.setPrice(199.0);
		p2.setProductId(2);
		
		List<Product> productList = new ArrayList<Product>();
		productList.add(p1);
		productList.add(p2);
		
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		map.put(1, 10);
		map.put(2, 4);
		
		Cart c = new Cart();
		c.setProductIdVsQuantityMap(map);
		c.setProductList(productList);
		
		ObjectMapper obm = new ObjectMapper();
		String serializedCart = obm.writeValueAsString(c);
		System.out.println(serializedCart);

		Cart deserializedCartObject = obm.readValue(serializedCart, Cart.class);
	}

}
