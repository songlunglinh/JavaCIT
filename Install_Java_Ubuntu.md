# Introduction

#### As a lot of articles and programs require to have Java installed, this article will guide you through the process of installing and managing different versions of Java.
# Installing default JRE/JDK

#### This is the recommended and easiest option. This will install OpenJDK 6 on Ubuntu 12.04 and earlier and on 12.10+ it will install OpenJDK 7.

#### Installing Java with apt-get is easy. First, update the package index:

##### sudo apt-get update

#### Then, check if Java is not already installed:
##### java -version
#### If it returns "The program java can be found in the following packages", Java hasn't been installed yet, so execute the following command:
##### sudo apt-get install default-jre
#### This will install the Java Runtime Environment (JRE). If you instead need the Java Development Kit (JDK), which is usually needed to compile Java applications (for example Apache Ant, Apache Maven, Eclipse and IntelliJ IDEA execute the following command:
##### sudo apt-get install default-jdk
#### That is everything that is needed to install Java. 
#### All other steps are optional and must only be executed when needed.
# Installing OpenJDK 7 (optional)
#### To install OpenJDK 7, execute the following command:
##### sudo apt-get install openjdk-7-jre 
#### This will install the Java Runtime Environment (JRE). If you instead need the Java Development Kit (JDK), execute the following command:
##### sudo apt-get install openjdk-7-jdk
# Installing Oracle JDK (optional)
#### The Oracle JDK is the official JDK; however, it is no longer provided by Oracle as a default installation for Ubuntu. 
#### You can still install it using apt-get. To install any version, first execute the following commands:
##### sudo apt-get install python-software-properties
##### sudo add-apt-repository ppa:webupd8team/java
##### sudo apt-get update
#### Then, depending on the version you want to install, execute one of the following commands:
# Oracle JDK 6
#### This is an old version but still in use.
##### sudo apt-get install oracle-java6-installer
# Oracle JDK 7
#### This is the ltest stable version.
##### sudo apt-get install oracle-java7-installer
# Oracle JDK 8
#### This is a developer preview, the general release is scheduled for March 2014. This external article about Java 8 may help you to understand what it's all about.
##### sudo apt-get install oracle-java8-installer
#### It will usually return something like this if you have 2 installations (if you have more, it will of course return more):
#### You can now choose the number to use as default. This can also be done for the Java compiler (javac):
##### sudo update-alternatives --config javac

