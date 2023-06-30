package com.micah.springannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Tecno {
	
	@Autowired
	MobileProcessor cpu;
	
  public void config() {
	  System.out.println("Tecno : Octacore,4GB RAM, 12MP Camera ");
	  cpu.process();
  }
}
