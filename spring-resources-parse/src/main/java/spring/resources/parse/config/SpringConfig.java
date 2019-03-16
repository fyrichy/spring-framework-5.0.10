package spring.resources.parse.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spring.resources.parse.dao.UserDao;

@Configuration
public class SpringConfig {

	@Bean
	public UserDao userDao(){
		return new UserDao();
	}
}
