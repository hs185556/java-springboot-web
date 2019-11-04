package springboot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


//简单说， Thymeleaf 是一个跟 Velocity、FreeMarker 类似的模板引擎，它可以完全替代 JSP 
//这个注解不能使用RestController，不然会返回模板类型的页面
@Controller
public class HelloController {
	private static final Logger LOG = LoggerFactory.getLogger(HelloController.class);

    @GetMapping("/hello")
    public String hello(Model model) {
        String name = "jiangbei";
        model.addAttribute("name", name);
        //thymeleaf默认的模板映射路径是：src/main/resources/templates,Thymeleaf找到其中同名的页面返回
        return "hello";
    }
	
}
