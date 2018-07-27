$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("CucumTest.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: your.email@your.domain.com"
    },
    {
      "line": 2,
      "value": "#Keywords Summary :"
    },
    {
      "line": 3,
      "value": "#Feature: List of scenarios."
    },
    {
      "line": 4,
      "value": "#Scenario: Business rule through list of steps with arguments."
    },
    {
      "line": 5,
      "value": "#Given: Some precondition step"
    },
    {
      "line": 6,
      "value": "#When: Some key actions"
    },
    {
      "line": 7,
      "value": "#Then: To observe outcomes or validation"
    },
    {
      "line": 8,
      "value": "#And,But: To enumerate more Given,When,Then steps"
    },
    {
      "line": 9,
      "value": "#Scenario Outline: List of steps for data-driven as an Examples and \u003cplaceholder\u003e"
    },
    {
      "line": 10,
      "value": "#Examples: Container for s table"
    },
    {
      "line": 11,
      "value": "#Background: List of steps run before each of the scenarios"
    },
    {
      "line": 12,
      "value": "#\"\"\" (Doc Strings)"
    },
    {
      "line": 13,
      "value": "#| (Data Tables)"
    },
    {
      "line": 14,
      "value": "#@ (Tags/Labels):To group Scenarios"
    },
    {
      "line": 15,
      "value": "#\u003c\u003e (placeholder)"
    },
    {
      "line": 16,
      "value": "#\"\""
    },
    {
      "line": 17,
      "value": "## (Comments)"
    },
    {
      "line": 18,
      "value": "#Sample Feature Definition Template"
    }
  ],
  "line": 20,
  "name": "Title of your feature",
  "description": "I want to use this template for my feature file",
  "id": "title-of-your-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 24,
  "name": "Title of your scenario",
  "description": "",
  "id": "title-of-your-feature;title-of-your-scenario",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 23,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 25,
  "name": "I want to write a step with precondition",
  "keyword": "Given "
});
formatter.step({
  "line": 26,
  "name": "some other precondition",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "I complete action",
  "keyword": "When "
});
formatter.step({
  "line": 28,
  "name": "some other action",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "yet another action",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "I validate the outcomes",
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "check more outcomes",
  "keyword": "And "
});
formatter.match({
  "location": "basicSeleniumTest.i_want_to_write_a_step_with_precondition()"
});
formatter.result({
  "duration": 213856249,
  "status": "passed"
});
formatter.match({
  "location": "basicSeleniumTest.some_other_precondition()"
});
formatter.result({
  "duration": 84475,
  "status": "passed"
});
formatter.match({
  "location": "basicSeleniumTest.i_complete_action()"
});
formatter.result({
  "duration": 81604,
  "status": "passed"
});
formatter.match({
  "location": "basicSeleniumTest.some_other_action()"
});
formatter.result({
  "duration": 161569,
  "status": "passed"
});
formatter.match({
  "location": "basicSeleniumTest.yet_another_action()"
});
formatter.result({
  "duration": 207498,
  "status": "passed"
});
formatter.match({
  "location": "basicSeleniumTest.i_validate_the_outcomes()"
});
formatter.result({
  "duration": 236203,
  "status": "passed"
});
formatter.match({
  "location": "basicSeleniumTest.check_more_outcomes()"
});
formatter.result({
  "duration": 241124,
  "status": "passed"
});
});