package com.adactin.stepdefinition;


import java.io.IOException;

import com.frame_work.org.Cucumberframework.BaseClass1;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hookes extends BaseClass1 {
@Before
public static void beforehookes(Scenario scenerio) {
String name = scenerio.getName();
System.out.println(name);
}
@After
public static void afterhookes(Scenario scenerio) throws IOException {
String status = scenerio.getStatus();
System.out.println(status);
if(scenerio.isFailed()) {
	
	screenshot("failedscenerio");
}
}
}
