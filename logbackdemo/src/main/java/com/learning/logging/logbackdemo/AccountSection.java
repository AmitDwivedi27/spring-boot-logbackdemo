package com.learning.logging.logbackdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountSection {

	Logger logger = LoggerFactory.getLogger("accountlogger");
	
	@RequestMapping("/account")
	public String printAccountDetails() {
		logger.error("saying hi from AccountSection");
		return "hi from AccountSection";
	}
}
