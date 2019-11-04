package springboot.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

// 添加实体类
// Entity 中不映射成列的字段得加 @Transient 注解，不加注解也会映射成列

@Entity
public class Admin implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    private Long id;
    @Column(nullable = false, unique = true)
    private String adminName;
    @Column(nullable = false)
    private String passWord;
    @Column(nullable = false, unique = true)
    private String email;
    @Column(nullable = true, unique = true)
    private String nickName;
    @Column(nullable = false)
    private String regTime;
    public Admin() {
		super();
	}
	public Admin(String adminName, String passWord, String email, String nickName, String regTime) {
		super();
		this.adminName = adminName;
		this.passWord = passWord;
		this.email = email;
		this.nickName = nickName;
		this.regTime = regTime;
	}
	public Admin(Long id, String adminName, String passWord, String email, String nickName, String regTime) {
		super();
		this.id = id;
		this.adminName = adminName;
		this.passWord = passWord;
		this.email = email;
		this.nickName = nickName;
		this.regTime = regTime;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getRegTime() {
		return regTime;
	}
	public void setRegTime(String regTime) {
		this.regTime = regTime;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Admin [id=" + id + ", adminName=" + adminName + ", passWord=" + passWord + ", email=" + email
				+ ", nickName=" + nickName + ", regTime=" + regTime + "]";
	}
}
