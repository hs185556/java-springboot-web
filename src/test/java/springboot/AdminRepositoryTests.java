package springboot;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import springboot.domain.Admin;
import springboot.domain.AdminRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AdminRepositoryTests {
	
	@Autowired
	AdminRepository adminRepository;
	
	@Test
	public void test() throws Exception {
//        Date date = new Date();
//        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);        
//        String formattedDate = dateFormat.format(date);
//        
//        adminRepository.save(new Admin("aa1", "aa@126.com", "aa", "aa123456",formattedDate));
//        adminRepository.save(new Admin("bb2", "bb@126.com", "bb", "bb123456",formattedDate));
//        adminRepository.save(new Admin("cc3", "cc@126.com", "cc", "cc123456",formattedDate));
		System.out.println("========================");
		// junit的断言功能，若相等，则过；不等，则报错
        Assert.assertEquals(3, adminRepository.findAll().size());
        Assert.assertEquals("wrongAnswer", adminRepository.findByAdminNameOrEmail("bb2", "bb@126.com").getNickName());
        System.out.println("========================");
//        adminRepository.delete(adminRepository.findByAdminName("aa1"));
//        List<Admin> listAdmin = adminRepository.findAll();
//        System.out.println(listAdmin);
    }
}
