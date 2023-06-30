package com.micah.springannotation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//The primary annotation will specify this component as default bean for implementing the MobileProcessor interface
@Primary
public class Mobitex implements MobileProcessor {

	public void process() {
		System.out.println("Mobitex");
	}

}
