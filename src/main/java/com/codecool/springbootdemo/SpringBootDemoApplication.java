package com.codecool.springbootdemo;

import com.codecool.springbootdemo.service.DogCreator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class SpringBootDemoApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(SpringBootDemoApplication.class);

	private DogCreator dogCreator;
	private DogCreator creatorOther;
	private DogCreator helloCreator;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoApplication.class, args);
	}

	@PostConstruct
	public void afterInit() {
		LOGGER.info(dogCreator.toString());
		LOGGER.info(creatorOther.toString());
		LOGGER.info(helloCreator.toString());
	}

	@Autowired
	public void setDogCreator(DogCreator dogCreator) {
		this.dogCreator = dogCreator;
	}

	@Autowired
	public void setCreator5(DogCreator creator1) {
		this.creatorOther = creator1;
	}

	@Autowired
	public void setHelloCreator(DogCreator helloCreator) {
		this.helloCreator = helloCreator;
	}
}
