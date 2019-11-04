package com.o7planning.formcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class TestController {

	@GetMapping("/test.htm")
	public String test() {
		return "test";
	}

}
