package com.yuresh.serviceproviders;

public class EmailServiceProvider implements MessageLackMan {

	public void sendMessage(String message) {
		System.out.println("Sending Email with Message = "+message);
	}
}
