package springboot.domain;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Administrator
 * 
 * 添加 Dao
 * 
 * dao 只要继承 JpaRepository 类就可以，几乎可以不用写方法，
 * 还有一个特别有尿性的功能非常赞，就是可以根据方法名来自动的生成 SQL，
 * 比如findByUserName 会自动生成一个以 userName 为参数的查询方法，
 * 比如 findAlll 自动会查询表里面的所有数据，
 * 比如自动分页等等。
 *  自带save,update ,delete
 * 更多根据方法生成sql的命名规则，请参考->https://blog.csdn.net/qq_27886997/article/details/82982407
 */


public interface AdminRepository extends JpaRepository<Admin, Long> {
	Admin findByAdminName(String adminName);
	List<Admin> findAll();
	Admin findByAdminNameOrEmail(String adminname, String email);
}