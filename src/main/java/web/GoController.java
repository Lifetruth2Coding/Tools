package web;

import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class GoController implements EnvironmentAware {

	@RequestMapping(value = "/", method = RequestMethod.HEAD)
	public String head() {
		return "go.jsp";
	}

	@RequestMapping(value = { "/index", "/" }, method = RequestMethod.GET)
	public String index(Model model) {
		System.out.println("===processed by index===");
		model.addAttribute("msg", "gogogo");
		return "go.jsp";

	}

	private Environment environment;

	@Override
	public void setEnvironment(Environment environment) {
		this.environment = environment;
	}

}
