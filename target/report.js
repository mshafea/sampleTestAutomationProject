$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("HomeTestSpec.feature");
formatter.feature({
  "line": 1,
  "name": "homePage functionality",
  "description": "As a user  I want to check some functionality of HomePage",
  "id": "homepage-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3794615273,
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
  "location": "BaseClass.user_is_on_home_page()"
});
formatter.result({
  "duration": 4822168544,
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
  "duration": 590491402,
  "status": "passed"
});
formatter.after({
  "duration": 1265469157,
  "status": "passed"
});
formatter.before({
  "duration": 2802036316,
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
  "location": "BaseClass.user_is_on_home_page()"
});
formatter.result({
  "duration": 4451888558,
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
  "duration": 2360118538,
  "status": "passed"
});
formatter.match({
  "location": "HomeStep.the_slider_will_move_to_next_slide()"
});
formatter.result({
  "duration": 219876662,
  "status": "passed"
});
formatter.match({
  "location": "HomeStep.user_press_on_the_left_arrow_on_the_slider()"
});
formatter.result({
  "duration": 1906337907,
  "status": "passed"
});
formatter.match({
  "location": "HomeStep.the_slider_will_move_back_to_previous_slide()"
});
formatter.result({
  "duration": 234705325,
  "status": "passed"
});
formatter.after({
  "duration": 1051366610,
  "status": "passed"
});
formatter.before({
  "duration": 2544447304,
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
  "location": "BaseClass.user_is_on_home_page()"
});
formatter.result({
  "duration": 4310635314,
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
  "duration": 5752644281,
  "status": "passed"
});
formatter.match({
  "location": "HomeStep.complaint_page_is_oepened_successfully()"
});
formatter.result({
  "duration": 373711216,
  "status": "passed"
});
formatter.after({
  "duration": 1291199833,
  "status": "passed"
});
});