package vrn.superblog;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@OpenAPIDefinition(info = @Info(
		title = "Super-Blog APIs using Spring boot v3",
		description = "Documentation for Super-blog app REST APIs created using Spring boot and Spring Security ",
		version = "v1.0",
		contact = @Contact(
				name = "Viren Rathod",
				email = "viren.rathod.2023@gmail.com",
				url = "https://github.com/viren-rathod"
		),
		license = @License(
				name = "Apache 2.0",
				url = "https://httpd.apache.org/"
		)
),
		externalDocs = @ExternalDocumentation(
				description = "Spring Boot Super-Blog Application",
				url = "https://github.com/viren-rathod/super-blog"
		)
)
@SpringBootApplication
public class SuperBlogApplication {

	public static void main(String[] args) {
		SpringApplication.run(SuperBlogApplication.class, args);
	}
	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}

}
