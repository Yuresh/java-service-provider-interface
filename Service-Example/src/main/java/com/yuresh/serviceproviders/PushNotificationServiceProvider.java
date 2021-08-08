package com.yuresh.serviceproviders;

public class PushNotificationServiceProvider implements MessageLackMan {

		public void sendMessage(String message) {
			System.out.println("Sending Push Notification with Message = "+message);
		}

}
