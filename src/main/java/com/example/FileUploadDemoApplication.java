package com.example;

import com.example.storage.StorageProperties;
import com.example.storage.StorageService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

/**
 * Created by Administrator on 2017/6/16 0016.
 */
@SpringBootApplication
@EnableConfigurationProperties(StorageProperties.class)
public class FileUploadDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(FileUploadDemoApplication.class, args);
    }

    @Bean
    CommandLineRunner init(StorageService storageService) {
        return (args) -> {
            storageService.deleteAll();
            storageService.init();
        };
    }
//    It retrieves all the beans that were created either by your app or were automatically added thanks to Spring Boot. It sorts them and prints them out.
//    @Bean
//    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
//        return args -> {
//
//            System.out.println("Let's inspect the beans provided by Spring Boot:");
//
//            String[] beanNames = ctx.getBeanDefinitionNames();
//            Arrays.sort(beanNames);
//            for (String beanName : beanNames) {
//                System.out.println(beanName);
//            }
//
//        };
//    }

}
