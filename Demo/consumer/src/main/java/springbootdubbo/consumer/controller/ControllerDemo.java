package springbootdubbo.consumer.controller;

import com.orbyun.api.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/t")
public class ControllerDemo {

	@Autowired
	private Api api;

	@GetMapping("/y")
	public String say(@RequestParam String str){
		String say = api.say(str);
		return say;
	}
}
