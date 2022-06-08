package com.mycompany.poe;

import javax.swing.JOptionPane;

public class Task 
{   
    //Variables.
    static String taskStatus, firstName, taskDescription;
    static int taskTime, totalHours;
    
    //This method checks to ensure the description does not exceed 50 characters.
     public static boolean checkTaskDescription(String taskDescription)
    {
        boolean result;
        
        if(taskDescription.length() > 50)
        {
            JOptionPane.showMessageDialog(null, "Please enter a task description of less than 50 characters.");
            result = false;
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Task successfully captured.");
            result = true;
        }
        
        return result;
    }
    
     //This method uses the user inputted data, and a number generated based off of how many tasks where added to create an ID for each task.
    public static String createTaskID(String taskName, String lastName, int taskNumber)
    {
        String a, b;
        int c;
                
        a = taskName.substring(0, 2).toUpperCase();
        b = lastName.substring(0, 3).toUpperCase();
        c = taskNumber;
        
        String result = a + ":" + c + ":" + b;
        
        return result;
    }
    
    //This method takes all the inputted and generated data, and displays it in a specific order after each task.
    public static String printTaskDetails(String taskStatus, String firstName, String lastName, String taskName, String taskDescription, int taskTime, int taskNumber)
    {
        String result = "Task Status: " + taskStatus + "  Developer Details: " + firstName + " " + lastName + "  Task Number: " + taskNumber + "  Task Name: " + taskName + "  Task Description: " + taskDescription + "  Task ID: " + createTaskID(taskName, lastName, taskNumber) + "  Hours needed to complete task: " + taskTime;
        
        return result;
    }
    
    //This method adds all the estimated time needed to complete each task together and displays it at the end of the application.
    public static int returnTotalHours(int taskTime)
    {  
        totalHours = totalHours + taskTime;
        
        return totalHours;
    }
}
