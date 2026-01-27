
package com.example;

class CustomException extends Exception {
    private static final long serialVersionUID = 1L;

    public CustomException(String message) {
        super(message); 
    }
}

public class Activity8 {
    public static void exceptionTest(String value) throws CustomException {
        if (value == null) {
            throw new CustomException("Custom Exception: String value is null");
        } else {
            System.out.println(value);
        }
    }

    public static void main(String[] args) {
        try {
            Activity8.exceptionTest("Will print to console");
            Activity8.exceptionTest(null);
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
    }
}
