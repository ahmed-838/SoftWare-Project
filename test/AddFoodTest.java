/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *
 * @author Ahmed shams
 */
public class AddFoodTest {
    
    public AddFoodTest() {
    }

    @Test
    public void testCalculate_calories() {
       int expected = 209;
       int  fat = 13 ;
       int protein = 23; 
       int carb = 0;
       AddFood obj1 = new AddFood();
       int actual =obj1.calculate_calories(fat, protein, carb);
       assertEquals(expected, actual,"Created with Mariam Nagy");
    }

    @Test
    public void testMain() {
    }
    
}
