package javaLearning.ExeptionHandling;

class InvalidAgeException extends Exception {
    InvalidAgeException(String s){
         super(s);
    }

}

public class CustomException {
    static  void checkAgeValidation(int age)throws InvalidAgeException{
        if(age < 18){
            throw  new InvalidAgeException ("Invalid age for Vote");
        }else
            System.out.println("Welcome to vote");

    }

    public static void main(String[] args) {
        try {
            checkAgeValidation(16);
        } catch (InvalidAgeException e) {
            e.printStackTrace();
        }
    }

}