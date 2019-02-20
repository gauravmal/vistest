package com.mal.runner;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;

public class RunTestNG 
{

	public static void main(String[] args) 
	{
		TestNG runner = new TestNG();
		List<String> suiteFiles = new ArrayList<String>();
		suiteFiles.add("D:\\Automation\\Java-Automation\\vistest\\testng.xml");
		runner.setTestSuites(suiteFiles);
		runner.run();
	}
}
