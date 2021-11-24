
# Ryan Air Quality Assurance Automated Test

This automated test will book two tickets from Terceira Island to Lisbon, round trip.

Here are the test steps for this application:

- Given i am in the index page
- Then i want to travel from "Terceira Lajes" to "Lisboa"
- And i want to select the trips
- And i want to continue with the value price
- Then i want to login later
- And i want to write down the pax names
- Then i want to take a small luggage
- Then i dont want to take any more luggage
- And i want to select seats later
- And i am sure that everything is ok with my trip

This test has been created in the September 29th and Ryan Air's plataform is well known for changing its div classes and ids periodically. Therefore, this application may require to update the mentioned classes and ids, according to Ryan Air's HTML skeleton.

This project is a template to create tests for the Web platforms. The tests assist in verifying the stability of the environments and also help us understand what features
are not working as expected. By default, Maven is used to execute all the commands for this repository. 

## Screenshot

<img width="1784" alt="Screenshot 2021-11-24 at 01 16 05" src="https://user-images.githubusercontent.com/37920932/143159948-5de230eb-c2d5-48b2-ab74-309391b72d8d.png">


## Setting up the application
Clone the respository from bitbucket with the following command

```bash 
git clone git@github.com:diogo-brandao1/web-automation-template.git

cd web-automation-template
```

## Install the dependencies 

```bash
mvn install
```
## Installing Plugins - IntelliJ IDE

In the event that you are using IntelliJ, you will need to install the following plugins on your IDE: Java and Gherkin Substeps InteliJ plugins. 

## Project Setup & Driver Information

To run the project on either linux, windows or MaC operating systems, you require to have a driver that is specific to your operating system. The different driver configuration properties for different operating systems can be found in the directory `src/test/resources`. The drivers required by selenium to run your project can be found in the directory `drivers` in the project root. 

## Running tests - Using the terminal
The following GIF shows how you can run tets using the IDE terminal 

![ Terminal test run ](./assets/test-run-cli.gif)

## Running tests on IntelliJ - Using the IDE
The following GIF shows how you can run tets using the IDE and cucumber. 

![ IDE test run ](./assets/test-run-intellij.gif)

It is important to note, that with the configuration on the GIF done, you can run, whole folders like `business` or even subfolders like `auth` and even single `.feature` files, just by right clicking and using the run option for cucumber as long as you have the plugins mentioned above installed. 
