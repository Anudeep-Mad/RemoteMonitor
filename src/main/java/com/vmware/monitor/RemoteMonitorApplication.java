package com.vmware.monitor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class RemoteMonitorApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(RemoteMonitorApplication.class, args);
	}
}
