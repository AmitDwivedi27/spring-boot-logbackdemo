package com.learning.logging.logbackdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OtherSection {

	Logger logger = LoggerFactory.getLogger(OtherSection.class);

	@RequestMapping("/other")
	public String printAccountDetails() {
		logger.error("saying hi from Other Section");
		return "hi from Other Section";
	}
}
