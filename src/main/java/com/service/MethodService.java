package com.service;

public class MethodService {

    public static boolean validateAge(int age) {
        if (age > 60) {
            System.out.println("you are Senior");
            return true;

        } else {
            return false;
        }
    }
    public static double rateCalculation(String type,double rate){
        if(type.equalsIgnoreCase("ac")){
             rate=100;

        }else{
            rate=60;

        }
return rate;
    }

}