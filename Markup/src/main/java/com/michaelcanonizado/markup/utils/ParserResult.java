/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.michaelcanonizado.markup.utils;

/**
 *
 * @author lilac
 */
public class ParserResult {
    private boolean isValid;
    private int errorIndex;
    private String errorMessage;
    private String errorContext;

    public ParserResult(boolean isValid, int errorIndex, String errorMessage, String errorContext) {
        this.isValid = isValid;
        this.errorIndex = errorIndex;
        this.errorMessage = errorMessage;
        this.errorContext = errorContext;
    }

    public boolean isIsValid() {
        return isValid;
    }

    public int getErrorIndex() {
        return errorIndex;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public String getErrorContext() {
        return errorContext;
    }

    public void setIsValid(boolean isValid) {
        this.isValid = isValid;
    }

    public void setErrorIndex(int errorIndex) {
        this.errorIndex = errorIndex;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public void setErrorContext(String errorContext) {
        this.errorContext = errorContext;
    }
    
    @Override
    public String toString() {
        if (isValid) {
            return "Parsing successful!";
        }
        return "Parsing failed at index " + errorIndex + 
                ":\nError Message: " + errorMessage +
                "\nContext: " + errorContext;
    }
}
