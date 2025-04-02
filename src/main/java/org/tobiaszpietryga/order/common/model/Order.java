package org.tobiaszpietryga.order.common.model;

import java.math.BigDecimal;

import lombok.Builder;
import lombok.Data;
import lombok.Value;


@Builder
@Data
public class Order {
	Long id;
	Long customerId;
	String name;
	Status status;
	Integer price;
	boolean paymentStarted;
	boolean stockStarted;
}
