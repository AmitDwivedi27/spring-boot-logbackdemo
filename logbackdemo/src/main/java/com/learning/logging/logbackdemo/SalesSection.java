package com.learning.logging.logbackdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SalesSection {

	
Logger logger = LoggerFactory.getLogger("saleslogger");
	
	@RequestMapping("/sales")
	public String printAccountDetails() {
		logger.error("saying hi from Sales Section");
		return "hi from Sales Section";
	}
}
