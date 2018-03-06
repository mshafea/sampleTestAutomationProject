$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("HomeTestSpec.feature");
formatter.feature({
  "line": 1,
  "name": "homePage functionality",
  "description": "As a user  I want to check some functionality of HomePage",
  "id": "homepage-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3999828675,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "user is on home page",
  "keyword": "Given "
});
formatter.match({
  "location": "TestBase.user_is_on_home_page()"
});
formatter.result({
  "duration": 1939536830,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Check whether UBS logo is displayed or not",
  "description": "",
  "id": "homepage-functionality;check-whether-ubs-logo-is-displayed-or-not",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@ie"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "UBS logo is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "HomeStep.ubs_logo_is_displayed()"
});
formatter.result({
  "duration": 713153153,
  "status": "passed"
});
formatter.after({
  "duration": 1237279404,
  "status": "passed"
});
formatter.before({
  "duration": 3067273542,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "user is on home page",
  "keyword": "Given "
});
formatter.match({
  "location": "TestBase.user_is_on_home_page()"
});
formatter.result({
  "duration": 1614059321,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Check home page slide",
  "description": "",
  "id": "homepage-functionality;check-home-page-slide",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@ie"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "User Press on the right Arrow on the Slider",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "the Slider will  move to next slide",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "User Press on the left arrow on the slider",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "the Slider will  move back to Previous slide",
  "keyword": "Then "
});
formatter.match({
  "location": "HomeStep.user_press_on_the_right_arrow_on_the_slider()"
});
formatter.result({
  "duration": 4553933,
  "error_message": "java.lang.NullPointerException\r\n\tat com.pages.bdd.PageBase.waitForVisibilityOf(PageBase.java:20)\r\n\tat com.pages.bdd.HomePage.pressRightArrow(HomePage.java:57)\r\n\tat com.steps.bdd.HomeStep.user_press_on_the_right_arrow_on_the_slider(HomeStep.java:24)\r\n\tat ✽.When User Press on the right Arrow on the Slider(HomeTestSpec.feature:13)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "HomeStep.the_slider_will_move_to_next_slide()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "HomeStep.user_press_on_the_left_arrow_on_the_slider()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "HomeStep.the_slider_will_move_back_to_previous_slide()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 1507020581,
  "status": "passed"
});
formatter.before({
  "duration": 2370785115,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "user is on home page",
  "keyword": "Given "
});
formatter.match({
  "location": "TestBase.user_is_on_home_page()"
});
formatter.result({
  "duration": 1735878209,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "Navigate to complaint page",
  "description": "",
  "id": "homepage-functionality;navigate-to-complaint-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 18,
      "name": "@ie"
    }
  ]
});
formatter.step({
  "line": 20,
  "name": "User press on contact dropdown list and select complaint",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "complaint page is opened successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "HomeStep.user_press_on_contact_dropdown_list_and_select_complaint()"
});
formatter.result({
  "duration": 198016807234,
  "status": "passed"
});
formatter.match({
  "location": "HomeStep.complaint_page_is_oepened_successfully()"
});
formatter.result({
  "duration": 617008,
  "error_message": "java.lang.NullPointerException\r\n\tat com.pages.bdd.PageBase.waitForVisibilityOf(PageBase.java:20)\r\n\tat com.pages.bdd.ComplaintPage.getPageHeader(ComplaintPage.java:17)\r\n\tat com.steps.bdd.HomeStep.complaint_page_is_oepened_successfully(HomeStep.java:57)\r\n\tat ✽.Then complaint page is opened successfully(HomeTestSpec.feature:21)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 1046472933,
  "status": "passed"
});
});