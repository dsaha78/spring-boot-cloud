package com.udemy.min.currencyexchangeservice;

import org.springframework.data.repository.CrudRepository;

public interface ExchnageServiceJPARepository extends CrudRepository<ExchangeValue, Long>{
	
	ExchangeValue findByFromAndTo(String from, String to);

}
