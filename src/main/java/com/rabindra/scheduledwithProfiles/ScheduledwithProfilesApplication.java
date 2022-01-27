package com.rabindra.scheduledwithProfiles;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ScheduledwithProfilesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScheduledwithProfilesApplication.class, args);
	}

}
