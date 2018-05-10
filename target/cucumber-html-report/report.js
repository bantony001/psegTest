$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("pseg.feature");
formatter.feature({
  "line": 1,
  "name": "Test PSEG login",
  "description": "",
  "id": "test-pseg-login",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Test Login with valid credentials",
  "description": "",
  "id": "test-pseg-login;test-login-with-valid-credentials",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "the user is in pseg application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "the user enters login information",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "the user should be logged in",
  "keyword": "Then "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "test-pseg-login;test-login-with-valid-credentials;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 10,
      "id": "test-pseg-login;test-login-with-valid-credentials;;1"
    },
    {
      "cells": [
        "ntbejoe5@gmail.com",
        "password1"
      ],
      "line": 11,
      "id": "test-pseg-login;test-login-with-valid-credentials;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 11,
  "name": "Test Login with valid credentials",
  "description": "",
  "id": "test-pseg-login;test-login-with-valid-credentials;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "the user is in pseg application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "the user enters login information",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "the user should be logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "SmokeTest.the_user_is_in_pseg_application()"
});
formatter.result({
  "duration": 6479718629,
  "status": "passed"
});
formatter.match({
  "location": "SmokeTest.the_user_enters_login_information()"
});
formatter.result({
  "duration": 5000554216,
  "status": "passed"
});
formatter.match({
  "location": "SmokeTest.the_user_should_be_logged_in()"
});
formatter.result({
  "duration": 38285089,
  "status": "passed"
});
});