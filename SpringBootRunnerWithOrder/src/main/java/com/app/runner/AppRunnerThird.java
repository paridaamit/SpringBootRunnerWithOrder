package com.app.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

@Component
public class AppRunnerThird implements CommandLineRunner,Ordered{

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("from third runner");
		
	}

	@Override
	public int getOrder() {
		// TODO Auto-generated method stub
		return 10;
	}

}
