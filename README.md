# This is a repository from Selenium Test Automation.

I used http://demo.automationtesting.in/ for tests

For all tests were use Java Eclipse, JUnit, Maven, Selenium Webdriver.

For Configuration: 
In Eclipse, create a new Project using Maven Project.

In Pom.xml add dependencies:

<dependencies>
	<!-- https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-api -->
	<dependency>
		<groupId>org.junit.jupiter</groupId>
		<artifactId>junit-jupiter-api</artifactId>
		<version>5.8.0-M1</version>
		<scope>test</scope>
	</dependency>

	<!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java -->
	<dependency>
		<groupId>org.seleniumhq.selenium</groupId>
		<artifactId>selenium-java</artifactId>
		<version>4.0.0-beta-2</version>
	</dependency>
	 
 </dependencies>

In src/test/java create a new Package: test and create a new Class JUnit Test Case, and select JUnit 4.0




