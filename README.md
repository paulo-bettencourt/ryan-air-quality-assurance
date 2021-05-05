# README #
#SBA Web Automated Tests

This project of automated tests assist in verifying the stability of the environments and also help us understand what features
are not working as expected. The tests are ready run in different environments and that every environment has a unique 
set of data for every specification that has been defined.




#Installation:
You will need to install from in your development enviroment: Cucumber For Java, Gherkin, Substeps InteliJ Plugin to get
the tests to properly run

#OS and Driver:
The project should be able to auto-detect your OS and the necessary WebDrivers

#Running the tests for the different enviroments:

In the test automation project, we use maven profiles to determine which environment to run our tests.

An example of a command to run only UXT environment tests is as shown below:

mvn clean verify -Puxt -Dcucumber.options="--tags @uxt" -f AutoTestWeb/pom.xml

This example would only run the TEST enviroment tests:

mvn clean verify -Ptest -Dcucumber.options="--tags @test" -f AutoTestWeb/pom.xml


### Need further help? ###

SBA Business QAs - Diogo Brandão and Josphat Waweru
SBA Retail QAs - Ana Rita Câmara and José Diogo Correia