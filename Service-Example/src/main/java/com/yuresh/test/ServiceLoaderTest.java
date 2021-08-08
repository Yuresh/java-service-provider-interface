package com.yuresh.test;

import java.util.Optional;
import java.util.ServiceLoader;

import com.yuresh.serviceproviders.MessageLackMan;

public class ServiceLoaderTest {
	public static void main(String[] args) {
		
		ServiceLoader<MessageLackMan> serviceLoader = ServiceLoader.load(MessageLackMan.class);

		for (MessageLackMan service : serviceLoader) {
			service.sendMessage("Hello");
		}
		
		// using Java 8 forEach() method
		serviceLoader.forEach((service) -> service.sendMessage("Have a Nice Day!"));

		serviceLoader.stream().forEach(service -> service.get().sendMessage("EEE") );

	}
}
