package com.Calculator.model;

import lombok.Data;

/**
 
*/
@Data
public class CalcDTO {
    private String firstNum;
    private String operator;
    private String secondNum;
    private String result = "0";
    private String C;
    private boolean flag;
    
}
