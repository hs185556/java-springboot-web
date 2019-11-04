package springboot.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

// 自定义 Property
// 配置在 application.properties 中

@Component
public class MyProperties {
	@Value("${com.hst.title}")
    private String title;
    @Value("${com.hst.description}")
    private String description;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "MyProperties [title=" + title + ", description=" + description + "]";
	}
}
