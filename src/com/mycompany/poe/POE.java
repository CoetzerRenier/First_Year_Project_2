package com.mycompany.poe;

import javax.swing.JOptionPane;

public class POE 
{
    public static void main(String[] args)
    {   
        //Prompts user for their first name and last name and saves them in variables.
        Login.firstName = JOptionPane.showInputDialog("Please enter your first name: ");
        Login.lastName = JOptionPane.showInputDialog("Please enter your last name: ");
        
        //Prompts user for a username, then sends it to the usernameComplexity checker method, then the registerUsername method checks if it complys with the rules and displays a message accordingly.
        Login.username = JOptionPane.showInputDialog("Please enter your desired username: ");
        Login.checkUsername(Login.username);
        JOptionPane.showMessageDialog(null, Login.registerUserUsername());
        
        //Prompts user for a password, then sends it to the passwordComplexity checker method, then the registerPassword method checks if it complys with the rules and displays a message accordingly.
        Login.password = JOptionPane.showInputDialog("Please enter your desired password: ");
        Login.checkPasswordComplexity(Login.password);
        JOptionPane.showMessageDialog(null, Login.registerUserPassword());
        
        //The registerSuccessfull method checks if both previous register methods where successfull, and displays a message accordingly.
        JOptionPane.showMessageDialog(null, Login.registerUserSuccessfull());
        
        //Prompts the user to enter the username and password that they used to register, the sends it to the loginUser method to check if they where valid.
        Login.savedUsername = JOptionPane.showInputDialog("Please login using your username: ");
        Login.savedPassword = JOptionPane.showInputDialog("Please login using your password: ");
        Login.loginUser(Login.savedUsername, Login.savedPassword);
        
        //This method displays a message based off of what the boolean result from the previous method was. 
        JOptionPane.showMessageDialog(null, Login.returnLoginStatus());
        
        if(!"Login failed. ".equals(Login.returnLoginStatus()) )
        {   
            JOptionPane.showMessageDialog(null, "Welcome to EasyKanban");
        }
        
        //Variables for Part 2.
        String taskDescription, taskName, firstName, lastName, taskID, a, b, taskStatus;
        int taskTime, c, numberOfTasks;
        int result;
        int totalHours = 0;
        
        result = 0;
        
        while(result != 3)
        {
            result = Integer.parseInt(JOptionPane.showInputDialog("Option 1) Add tasks \nOption 2) Show report \nOption 3) Exit "));
                                                                              
            if(result == 2)
            {
                JOptionPane.showMessageDialog(null, "Coming soon.");
            }
            else if(result == 1)
            {
                int i = 0;
                int taskNumber = 1;
                
                numberOfTasks = Integer.parseInt(JOptionPane.showInputDialog("How many tasks would you like to add?: "));
                
                while(numberOfTasks > i)
                {
                    taskName = JOptionPane.showInputDialog(null, "Please enter a name for your task: ");
                    
                    firstName = JOptionPane.showInputDialog(null, "Please enter your first name: ");
                    
                    lastName = JOptionPane.showInputDialog(null, "Please enter your last name: ");
                    
                    Task.createTaskID(taskName, lastName, taskNumber);
                
                    taskDescription = JOptionPane.showInputDialog(null, "Please enter a description for your task (note that it may not be more then 50 characters in length): ");
                    Task.checkTaskDescription(taskDescription);
        
                    taskTime = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the estimated time that your task will take to complete: "));
                
                    taskStatus = JOptionPane.showInputDialog("What is the status of your task? \nTo Do \nDoing \nDone");
         
                    JOptionPane.showMessageDialog(null, Task.printTaskDetails(taskStatus, firstName, lastName, taskName, taskDescription, taskTime, taskNumber));
         
                    taskNumber++;
                    i++;
                   
                    JOptionPane.showMessageDialog(null, "You will need a total of: " + Task.returnTotalHours(taskTime) + " hours to complete all tasks.");
                }
            }    
        }   
    }
}
