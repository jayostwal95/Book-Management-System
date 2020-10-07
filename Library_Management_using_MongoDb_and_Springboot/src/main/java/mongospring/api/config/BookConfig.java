package mongospring.api.config;

import static springfox.documentation.builders.PathSelectors.regex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class BookConfig {
	@Bean
	public Docket postsApi() {
		return new Docket(DocumentationType.SWAGGER_2).groupName("Book System").apiInfo(apiInfo()).select()
				.paths(regex("/api.*")).build();
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("Book Management using Swagger, REST and MongoDB :)")
				.description("Sample Documentation Generated Using SWAGGER2 for our Book Rest API where you can perform CRUD operations on your API Successfully")
				.termsOfServiceUrl("https://www.spring.io")
				.license("License_Free")
				.licenseUrl("https://www.spring.io").version("1.0").build();
	}


}
