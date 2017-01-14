package sy.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/userController")
public class UserController {



	@RequestMapping("/{id}/showUser")
	public String showUser(@PathVariable String id, HttpServletRequest request) {
		
		return "showUser";
	}

}
