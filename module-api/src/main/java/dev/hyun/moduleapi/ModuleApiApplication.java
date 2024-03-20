package dev.hyun.moduleapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(
        scanBasePackages = { "dev.hyun.moduleapi", "dev.hyun.modulecommon" }
)
@EntityScan("dev.hyun.modulecommon.domain")
@EnableJpaRepositories(basePackages = "dev.hyun.modulecommon.repositories")
public class ModuleApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ModuleApiApplication.class, args);
    }

}
