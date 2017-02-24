/*
 * A simple example for sending JMS messages to a queue.
 *
 * This sample uses Sun Java System Message Queue JMS provider.
 *
 * More samples on http://pyfourmond.free.fr.
 */

package com.jms.pyfourmond;

import java.util.Hashtable;

import javax.jms.JMSException;
import javax.jms.Queue;
import javax.jms.QueueConnection;
import javax.jms.QueueConnectionFactory;
import javax.jms.QueueSender;
import javax.jms.QueueSession;
import javax.jms.TextMessage;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class JmsSendExample {

	public static final String JNDI_PREFIX = "cn=";
	public static final String INITIAL_CONTEXT_FACTORY = "com.sun.jndi.fscontext.RefFSContextFactory";
	public static final String PROVIDER_URL = "file:///E:/Informatique/eclipse_projects/misc/src/com/misc/jms/pyfourmond/imq/imq_admin_objects";
	public static final String QUEUE_CONNECTION_FACTORY = "QueueConnectionFactory";
	public static final String QUEUE = "Queue1";

	public static void main(String args[]) {
		Hashtable env;
		InitialContext context = null;
		QueueConnectionFactory qcf;
		QueueConnection connection = null;
		QueueSession session;
		Queue queue;
		QueueSender sender;
		TextMessage message;

		env = new Hashtable();
		env.put(Context.INITIAL_CONTEXT_FACTORY, INITIAL_CONTEXT_FACTORY);
		env.put(Context.PROVIDER_URL, PROVIDER_URL);

		try {
			context = new InitialContext(env);
			qcf = (javax.jms.QueueConnectionFactory) context.lookup(JNDI_PREFIX + QUEUE_CONNECTION_FACTORY);
			connection = qcf.createQueueConnection();
			session = connection.createQueueSession(true, 0);
			queue = (javax.jms.Queue) context.lookup(JNDI_PREFIX + QUEUE);
			sender = session.createSender(queue);
			message = session.createTextMessage("This is a sample JMS message");
			sender.send(message);
			session.commit();
		} catch (NamingException ne) {
			ne.printStackTrace();
		} catch (JMSException jms) {
			jms.printStackTrace();
		} finally {
			try {
				if (context != null)
					context.close();
				if (connection != null)
					connection.close();
			} catch (Exception e) {
			}
		}
	}
}
