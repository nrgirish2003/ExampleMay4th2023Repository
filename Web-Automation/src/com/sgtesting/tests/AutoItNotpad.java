package com.sgtesting.tests;

public class AutoItNotpad {

	public static void main (String []args) {
		executeAutoITFile();
	}
	private static void executeAutoITFile()
	{
		try 
		{
			Runtime obj=Runtime.getRuntime();
			//obj.exec("F:\\SeleniumAutomation\\Automation\\AutoIt\\NotepadDemo.exe");
			obj.exec("F:\\SeleniumAutomation\\Automation\\AutoIt\\NotepadDemo2.exe");
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
			
		}
	}

}
