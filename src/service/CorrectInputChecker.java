package service;

public class CorrectInputChecker {

    static public boolean checkInputString(String input){
        return input.matches("[A-H]?[1-8]") && input.length() == 2;
    }
}
