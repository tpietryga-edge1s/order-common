package org.tobiaszpietryga.order.common.model;

import java.beans.ConstructorProperties;
import java.math.BigDecimal;

import lombok.Builder;
import lombok.Data;
import lombok.Value;


@Builder
@Data
public class Order {
	@ConstructorProperties({"id", "customerId", "name", "status", "price", "paymentStarted", "stockStarted"})
	public Order(Long id, Long customerId, String name, Status status, Integer price, boolean paymentStarted, boolean stockStarted) {
		this.id = id;
		this.customerId = customerId;
		this.name = name;
		this.status = status;
		this.price = price;
		this.paymentStarted = paymentStarted;
		this.stockStarted = stockStarted;
	}

	Long id;
	Long customerId;
	String name;
	Status status;
	Integer price;
	boolean paymentStarted;
	boolean stockStarted;
}
