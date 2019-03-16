package spring.resources.parse.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.resources.parse.config.SpringConfig;

/**
 * 第一个测试类
 */
public class FirstTest {

	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfig.class);
		String[] beanNames = ac.getBeanDefinitionNames();
		for(String beanName:beanNames){
			System.out.println(beanName);
		}
	}
}
