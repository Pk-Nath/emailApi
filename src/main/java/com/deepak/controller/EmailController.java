package com.deepak.controller;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.deepak.utility.EmailService;

@Controller
public class EmailController {
	
	@Autowired
	private EmailService mailservice;
	
	@RequestMapping("/")
	public void EmailApi() {
		Random r=new Random();
		int randomNumber = r.nextInt(9999);
		while(true) {
			if(randomNumber>1000)
				break;
		mailservice.sendEmail("ddeepakkumar967@gmail.com",
				"1st check","otp is ".concat(String.valueOf(randomNumber)));
		}
	} 
}
