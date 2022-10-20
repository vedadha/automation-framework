# automation-framework
> Automation framework based on Selenium with Java.
> Website [_here_](http://automationpractice.com/). 


## Table of Contents
* [General Info](#general-information)
* [Technologies Used](#technologies-used)
* [Setup](#setup)
* [Usage](#usage)
* [Contact](#contact)


## General Information
- Test cases coverage for this project and reported defects can be found on this > [_link_](https://docs.google.com/spreadsheets/d/1tSAeVf57g5brG9S11QzYARR7FOX_ecBczEwAGVEmVHE/edit?usp=sharing)
- Automation framework is based on Selenium with Java project covering testing the most important functionalities. Framework is using Page Object Model pattern in  witch creates an object repository for storing all web elements.


## Technologies Used
- Maven
- JUnit
- Selenium Webdriver
- Java
- InteliJ


## Setup
- Manual Installation - https://github.com/lmc-eu/steward/wiki/Selenium-server-&-browser-drivers
- Automated Installation - https://www.npmjs.com/package/selenium-standalone

##### Installation and Launch

- Step I : Install NPM
- Step II : Install selenium-standalone
Terminal or Command Prompt
```
# In Windows, Run CMD as Administrator

npm install selenium-standalone@latest -g
# If need use sudo npm install selenium-standalone@latest -g

selenium-standalone install
# if needed use sudo 
```
- Step III : Launch Selenium Standalone
```
selenium-standalone start
```

> By default, google chrome, firefox and phantomjs are available when installed on the host system
```
# install a single driver within the default list (chrome, ie, edge, firefox) 
selenium-standalone install --singleDriverInstall=chrome
```


## Usage
- Download the zip or clone the Git repository.
- Unzip the zip file (if you downloaded one).
- Open Command Prompt and Change directory (cd) to folder containing pom.xml
- Open InteliJ 
   - File -> Open -> Navigate to the folder where you unzipped the zip
   - Select the right project
- You are all Set

## Contact
Created by [@vedadhal](https://www.instagram.com/vedad_ha/) - feel free to contact me!

