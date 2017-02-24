rem      ========================================================================================
rem      JNDI configuration for JMS test (using the JMS provider "Sun Java System Message Queue")
rem      ========================================================================================

@echo off

set PROVIDER_URL=file:///E:/Informatique/eclipse_projects/misc/src/com/jms/pyfourmond/imq/imq_admin_objects

rem Ajout d'une QueueConnectionFactory dans JNDI
C:\Tools\glassfishv3\mq\bin\imqobjmgr add -t qf -l cn=QueueConnectionFactory ^
              -j java.naming.factory.initial=com.sun.jndi.fscontext.RefFSContextFactory ^
              -j java.naming.provider.url=%PROVIDER_URL%
echo ======= QueueConnectionFactory created

rem Ajout d'une Queue Queue1 dans JNDI
C:\Tools\glassfishv3\mq\bin\imqobjmgr add -t q -l cn=Queue1 ^
              -o imqDestinationName=MyQueue ^
              -j java.naming.factory.initial=com.sun.jndi.fscontext.RefFSContextFactory ^
              -j java.naming.provider.url=%PROVIDER_URL%
echo ======= Queue "Queue1" created
