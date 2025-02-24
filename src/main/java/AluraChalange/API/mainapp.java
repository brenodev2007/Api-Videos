package AluraChalange.API;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class mainapp {
    public static void main(String[] args) {
        SpringApplication.run(mainapp.class, args);
        System.out.println("🚀 Aplicação Spring Boot conectada ao PostgreSQL!");
    }
}
