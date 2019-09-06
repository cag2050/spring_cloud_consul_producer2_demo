package com.cag2050.spring_cloud_consul_producer2_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringCloudConsulProducer2DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudConsulProducer2DemoApplication.class, args);
    }

}
