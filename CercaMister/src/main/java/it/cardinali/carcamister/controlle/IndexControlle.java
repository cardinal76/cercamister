package it.cardinali.carcamister.controlle;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexControlle {

	/**
	 * 
	 * @param name
	 * @param model
	 * @return
	 * 
	 * test url http://localhost:8080/hello?name=Marco
	 * 
	 */
	@GetMapping("/hello")
    public String hello(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "index";
    }
	
}
