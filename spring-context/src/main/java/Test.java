import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfig.class);
		String[] beanNames = ac.getBeanDefinitionNames();
		for(String beanName:beanNames){
			System.out.println(beanName);
		}
	}
}
