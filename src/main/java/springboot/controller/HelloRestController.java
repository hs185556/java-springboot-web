package springboot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import springboot.domain.User;

// json 接口开发
// 只需要类添加 @RestController 即可，默认类中的方法都会以 json 的格式返回

// 输出log到文件
// 在application.properties定义log配置信息
// path 为本机的 log 地址，logging.level 后面可以根据包路径配置不同资源的 log 级别
@RestController
public class HelloRestController {
	private static final Logger LOG = LoggerFactory.getLogger(HelloRestController.class);
	
    @RequestMapping("/getUser")
    public User getUser() {
    	LOG.info("==========getUser==========");
        User user=new User();
        user.setUserName("小明"); 
        user.setPassWord("xxxx");
        return user;
    }
    
}