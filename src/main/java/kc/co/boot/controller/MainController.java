package kc.co.boot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	Logger log = LoggerFactory.getLogger(getClass());
	
	@GetMapping(value="/")
	public String main() {
	
		log.info("hello lee sany yoon");
		return "{\"msg\":\"OK\"}";
	}
}
