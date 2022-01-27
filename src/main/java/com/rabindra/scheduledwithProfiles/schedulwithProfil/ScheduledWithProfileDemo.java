package com.rabindra.scheduledwithProfiles.schedulwithProfil;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ScheduledWithProfileDemo {

	@Value("${student.name}")
	private String userName;

	@GetMapping
	public String welcome() {
		return "Welcome to "+userName + " "+ new Date();
	}
}
