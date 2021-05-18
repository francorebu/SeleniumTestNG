The web application: https://opensource-demo.orangehrmlive.com/index.php/auth/login
is an app to practice automation by myself.

Considerations
-Relative xpaths
-Simple methods
-Page object pattern
-java 8
-Maven
-TestNG
-Allure report
-Sample apis test cases
-Sample web test cases

To execute test case:
1)Right click en testcase method and click on run.

To execute test by command line
1) navigate to the project directory where the pom.xml file
is located and then enter in command line: 
mvn clean test -Dtest=HelpSupportTest#helpSupportTest 

To execute all the tests by command line:
1)mvn clean test -Dtest=*

To view the results in allure report:
1)>mvn io.qameta.allure:allure-maven:serve

