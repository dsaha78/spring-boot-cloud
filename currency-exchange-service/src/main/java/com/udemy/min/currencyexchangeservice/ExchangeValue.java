package com.udemy.min.currencyexchangeservice;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

@Entity
public class ExchangeValue {

	@Id
	private long id;

	@Column(name = "currency_from")
	private String from;

	@Column(name = "currency_to")
	private String to;

	@Column(name = "conversion_multiple")
	private BigDecimal conversionMultiple;

	@Column(name = "application_port")
	private int port;

	public ExchangeValue(long id, String from, String to, BigDecimal conversionMultiple) {

		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionMultiple = conversionMultiple;

	}
}
