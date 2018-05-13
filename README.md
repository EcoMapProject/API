#EcoMap API

Hi!\
This project is the back-end part of EcoMap.\
It's a guide how to build, to deploy, to use this project in order to run the EcoMap back-end on your local computer.

##Building and Deployment

Prerequisite software:

1) JDK 8 or higher (or JRE 8 or higher).\
http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html
2) Maven.\
https://maven.apache.org/install.html
3) PostgreSQL.\
https://www.postgresql.org/download


Then create PostgreSQL user with username 'ecomap' and password 'postgres'
(Or you can change them in folder ./src/main/resources/application.properties).
Further create database schema with scripts in directory ./database/scripts.


Then you have to clone the git repository. Type in command line:\
git clone https://github.com/EcoMapProject/API


Now you can build the program with Maven and run it:\
cd ./API # (Go to root directory of the cloned project)\
mvn package\
java -jar api-1.0-SNAPSHOT.jar