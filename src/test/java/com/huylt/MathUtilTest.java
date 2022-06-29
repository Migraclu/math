/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.huylt;

import static com.mycompany.mathutil.core.MathUtil.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author Thanh Huy
 */
public class MathUtilTest {

    @Test
    public void MathUtilTestdsaf() {
        assertEquals(1, getFactorial(1));
    }
    // import static là dành riêng cho những hàm static
    // gọi hàm mà bỏ qua tên Class
    // * cho cuối dòng import

    @Test
    public void testGetFactorialGivenWrongargThrowException() {
        Executable exObject = new Executable() {
            @Override
            public void execute() throws Throwable {
                getFactorial(-5);
            }

        };
        assertThrows(IllegalArgumentException.class, exObject);
        
        
        assertThrows(IllegalArgumentException.class, () -> getFactorial(-5));
        
        
    }
    
    
    public static Object[][] initData(){
        return new Integer[][]{
            {1,1},
            {2,2},
            {5,120},
            {6,720}
        };
    }
    
    @ParameterizedTest
    @MethodSource(value = "initData")
    // 
    public void MathUtilTestdsaf(int input, long expected) {
        assertEquals(expected, getFactorial(input));
    }
}
