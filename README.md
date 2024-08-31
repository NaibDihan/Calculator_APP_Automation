# Calculator App Test Automation
## Overview
### The project includes a test method that takes a series of arithmetic operations as input and verifies that the calculator app produces the correct result. The goal is to ensure that the calculator handles various expressions accurately.

## Test Method
### The doSeries method is designed to accept a string representing a mathematical expression. It then passes this expression to the calculateSeries method, which performs the calculations and verifies the output.

## Example
### public void doSeries() {
     calculateSeries("100/10*5-10+60");
}

## Prerequisites
- JDK LTS Version
- NODEJS LTS Version
- Android SDK
- Appium
- Gradle
- Allure 

## Preferred IDE
- Intellij

## Emulator Setup:
- Setup Android Studio Emulator

## How to run?
### Execute the following steps:
- ``` git clone <repo_url> ```
- Open CMD
- Write command ``` npm i appium --global ``` to install appium
- ``` appium driver list ```
- ``` appium driver install uiautomator2 ```
- ``` appium plugin list ```
- ``` appium plugin install execute-driver ```
- ``` appium --use-plugins=execute-driver ``` to start the Appium Server
- Open Terminal of IDE (Intelij)
- Write command ``` gradle clean test ```

## Gradle Report
![gradle report](https://github.com/user-attachments/assets/129db05c-83a3-4392-b543-3581cedb517e)

## Allure Report
### Overview Section
![allure report overview](https://github.com/user-attachments/assets/c3036859-8dbd-4cbe-93e7-f14c6ae0da3e)

### Behaviour Section
![allure report behaviour](https://github.com/user-attachments/assets/b57ad6bf-faee-415f-a8a7-ae1788b2e211)

## Video Presentation
- Drive Link: https://drive.google.com/drive/folders/1zrXxbW_R5WY_v_vzp4l30nvlGlGUqDjf?usp=sharing





