package com.mycompany.poe;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class TaskTest {
    
    public TaskTest() 
    {
    }

    @Test
    public void testDescriptionLengthUnder50Characters() 
    {
        boolean expected = true;
        boolean actual = Task.checkTaskDescription("Create Add Task feature to add task users");
                
        assertEquals(expected,actual);
    }

    @Test
    public void testDescriptionLengthOver50Characters() 
    {
        boolean expected = false;
        boolean actual = Task.checkTaskDescription("Make a sentence that is over 50 characters long so that the test will return a false boolean, gibberish gibberish gibberish. Make a sentence that is over 50 characters long so that the test will return a false boolean, gibberish gibberish gibberish.");
        
        assertEquals(expected,actual);
    }

    @Test
    public void testTaskIDisCorrect() 
    {
        String expected = "LO:1:SON";
        String actual = Task.createTaskID("Login Feature", "Harrison", 1);
        
        assertEquals(expected,actual);
    }

    @Test
    public void testReturnTotalHours() 
    {
        int expected = 18;
        int actual = Task.returnTotalHours(18);
        
        assertEquals(expected,actual);
    }
    
}
