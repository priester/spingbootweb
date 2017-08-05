package note.priest.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@Configuration
//@EnableAutoConfiguration
//如果发现应用了你不想要的特定自动配置类，你可以使用 @EnableAutoConfiguration 注解的排除属性来禁用它们。
//Spring Boot提供的自动配置都是位于包 org.springframework.boot.autoconfigure 之下。
//@EnableAutoConfiguration(exclude={Movie.class})  

@SpringBootApplication
//@ComponentScan 
//@ComponentScan 注解自动收集所有的Spring组件，包括 @Configuration 类
public class BootstrapMavenApplication2 {

	public static void main(String[] args) {
		SpringApplication.run(BootstrapMavenApplication2.class, args);
	}

}

