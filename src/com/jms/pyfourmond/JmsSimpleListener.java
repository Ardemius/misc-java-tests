package com.jms.pyfourmond;

/*
 * A simple JMS Message Listener example for receiving JMS messages asynchronously from a queue.
 * See also JmsAsynchronousExample.java.
 *
 * This sample uses Sun Java System Message Queue JMS provider.
 *
 * More samples on http://pyfourmond.free.fr.
 */

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

public class JmsSimpleListener implements MessageListener {

	/**
	 * A simple onMessage method handling received TextMessage.
	 * 
	 * @param message
	 *            the received message
	 */
	public void onMessage(Message message) {
		try {
			if (!(message instanceof TextMessage)) {
				System.out.println("onMessage() received an unhandled: " + message.getClass().getName());
				return;
			}
			process((TextMessage) message);
		} catch (Throwable t) {
			System.err.println((t instanceof JMSException) ? "JMSException" : "Throwable" + " Caught in onMessage(): " + t.getMessage());
		}
	}

	/**
	 * The applicative code to process TextMessage.
	 * 
	 * @param message
	 *            the received message
	 */
	private void process(TextMessage message) throws JMSException {

		/**
		 * TextMessage is processed - Add applicative code here ... ...
		 */

		/* Then, processed message is acknowledged */
		message.acknowledge();
		System.out.println("onMessage() received and processed: " + message.getText());
	}

}
