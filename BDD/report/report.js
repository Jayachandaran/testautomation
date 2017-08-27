$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("LogIn_Test.feature");
formatter.feature({
  "line": 1,
  "name": "Login Action",
  "description": "",
  "id": "login-action",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Successful Login with Valid Credentials",
  "description": "",
  "id": "login-action;successful-login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User is on Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User Navigate to LogIn Page",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User enters \u003cUserName\u003e and \u003cPassword\u003e",
  "rows": [
    {
      "cells": [
        "jayachandran",
        "chandru-17"
      ],
      "line": 7
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Message displayed Login Successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "Login_Steps.user_is_on_Home_Page()"
});
formatter.result({
  "duration": 38627365624,
  "status": "passed"
});
formatter.match({
  "location": "Login_Steps.user_Navigate_to_LogIn_Page()"
});
formatter.result({
  "duration": 4261959320,
  "status": "passed"
});
formatter.match({
  "location": "Login_Steps.userEntersUserNameAndPassword(DataTable)"
});
formatter.result({
  "duration": 1431258701,
  "status": "passed"
});
formatter.match({
  "location": "Login_Steps.message_displayed_Login_Successfully()"
});
formatter.result({
  "duration": 341450,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Successful LogOut",
  "description": "",
  "id": "login-action;successful-logout",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 11,
  "name": "User LogOut from the Application",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "Message displayed LogOut Successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "Login_Steps.user_LogOut_from_the_Application()"
});
formatter.result({
  "duration": 5852962342,
  "status": "passed"
});
formatter.match({
  "location": "Login_Steps.messageDisplayedLogOutSuccessfully()"
});
formatter.result({
  "duration": 212765,
  "status": "passed"
});
formatter.match({
  "location": "Login_Steps.closeTheBrowser()"
});
formatter.result({
  "duration": 1130161366,
  "status": "passed"
});
});