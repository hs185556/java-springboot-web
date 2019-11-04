package springboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import springboot.domain.MyProperties;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MyPropertiesTests {
	@Autowired
    MyProperties  myProperties;

	// 通过@Autowired的对象，才能获取到自定义配置的参数、直接new是不行的。
    @Test
    public void getNamegetDescription() {
    	myProperties.setTitle("hello");
        System.out.println(myProperties);
    }
}
