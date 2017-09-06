package kr.hs.emirim.nmb2017.springmvc4;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller 
public class HelloContreooler {
	@RequestMapping("/")
	@ResponseBody
	public String Hello() {
		return "hello, worid";
	}
}
