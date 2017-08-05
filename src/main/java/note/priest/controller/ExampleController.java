package note.priest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {

	@RequestMapping("/say/hello")
	public String hello() {
		return "Hello World!";
	}

}
