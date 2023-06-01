package com.ttu.edu.betterReads;

import java.nio.file.Path;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.cassandra.CqlSessionBuilderCustomizer;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

import com.ttu.edu.betterReads.connection.DataStaxAstraProperties;

@SpringBootApplication
@EnableConfigurationProperties(DataStaxAstraProperties.class)
// @RestController
public class BetterReadsApplication {

	public static void main(String[] args) {
		SpringApplication.run(BetterReadsApplication.class, args);
	}

	
	@Bean
	public CqlSessionBuilderCustomizer sessionBuilderCustomizer(DataStaxAstraProperties dataStaxAstraProperties)
	{
		Path bundle = dataStaxAstraProperties.getSecureConnectBundle().toPath();
		return builder -> builder.withCloudSecureConnectBundle(bundle);
	}

	// @RequestMapping("/user")
	// public String getUserFromPrincipal(@AuthenticationPrincipal OAuth2User principal)
	// {
	// 	return principal.getAttribute("name");
	// }


}
