package com.myfirm.EducationalWebSite;

import com.myfirm.EducationalWebSite.Repository.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class EducationalWebSiteApplication {

	public static void main(String[] args) {
		SpringApplication.run(EducationalWebSiteApplication.class, args);
	}

}
