package com.example.demo.entities.enums;

public enum OrderStatus {
	
	CANCELED(0),
	SHIPPED(3),
	PAID(2),
	WAITING_PAYMENT(1),
	DELIVERED(4);
	
	private int code;
	
	private OrderStatus(int code) {
		this.code = code;
	}
	
	public int getCode() {
		return code;
	}
	
	public static OrderStatus valueOf(int code) {
		for(OrderStatus value : OrderStatus.values()) {
			if(value.getCode() == code) {
				return value;
			}
		}
		throw new IllegalArgumentException("Invalid OrderStatus code");
	}
}
