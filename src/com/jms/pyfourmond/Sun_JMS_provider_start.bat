rem      ==========================================================
rem      Start of the JMS provider "Sun Java System Message Queue")
rem      ==========================================================

@echo off

rem Start of the JMS provider
C:\Tools\glassfishv3\mq\bin\imqbrokerd -tty

rem test of the JMS provider (password = admin)
rem C:\Tools\glassfishv3\mq\bin\imqcmd query bkr -u admin -p admin