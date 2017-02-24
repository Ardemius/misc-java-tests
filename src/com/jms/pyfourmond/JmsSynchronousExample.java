package com.jms.pyfourmond;

/*
 * A simple example for receiving JMS messages synchronously from a queue.
 *
 * This sample uses Sun Java System Message Queue JMS provider.
 *
 * More samples on http://pyfourmond.free.fr.
 */

import java.util.Hashtable;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Queue;
import javax.jms.QueueConnection;
import javax.jms.QueueConnectionFactory;
import javax.jms.QueueReceiver;
import javax.jms.QueueSession;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class JmsSynchronousExample {

	public static final String JNDI_PREFIX = "cn=";
	public static final String INITIAL_CONTEXT_FACTORY = "com.sun.jndi.fscontext.RefFSContextFactory";
	public static final String PROVIDER_URL = "file:///E:/Informatique/eclipse_projects/misc/src/com/misc/jms/pyfourmond/imq/imq_admin_objects";
	public static final String QUEUE_CONNECTION_FACTORY = "QueueConnectionFactory";
	public static final String QUEUE = "Queue1";

	public static void main(String args[]) {
		Hashtable env;
		InitialContext context;
		QueueConnectionFactory qcf;
		QueueConnection connection;
		QueueSession session;
		QueueReceiver receiver;
		Queue queue;

		env = new Hashtable();
		env.put(Context.INITIAL_CONTEXT_FACTORY, INITIAL_CONTEXT_FACTORY);
		env.put(Context.PROVIDER_URL, PROVIDER_URL);

		try {
			context = new InitialContext(env);
			qcf = (javax.jms.QueueConnectionFactory) context.lookup(JNDI_PREFIX + QUEUE_CONNECTION_FACTORY);
			connection = qcf.createQueueConnection("admin", "admin");
			session = connection.createQueueSession(false, Session.CLIENT_ACKNOWLEDGE);
			queue = (javax.jms.Queue) context.lookup(JNDI_PREFIX + QUEUE);
			receiver = session.createReceiver(queue);
			connection.start();
			Message msg = receiver.receive();
			if (msg instanceof TextMessage) {
				System.out.println("Received a TextMessage: " + ((TextMessage) msg).getText());
				msg.acknowledge();
			} else if (msg != null) {
				System.out.println("Received a Message: " + msg.toString());
			}
		} catch (NamingException ne) {
			ne.printStackTrace();
		} catch (JMSException jms) {
			jms.printStackTrace();
		}
	}
}
