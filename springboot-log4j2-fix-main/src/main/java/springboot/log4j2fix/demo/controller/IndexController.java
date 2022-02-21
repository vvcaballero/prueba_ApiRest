package springboot.log4j2fix.demo.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

	private static final Logger logger = LogManager.getLogger(IndexController.class);
	@GetMapping("/")
	public String index() {
		
		logger.info("info level message");
		logger.warn("warning level message");
		logger.error("error level message");
		
		return "index";
	}
}





