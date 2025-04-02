package org.tobiaszpietryga.order.common.model;

import lombok.Builder;
import lombok.Value;


@Builder
@Value
public class Order {
	Long id;
	String name;
	Status status;
}
