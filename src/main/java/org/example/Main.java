package org.example;

public class Main {
    public static void main(String[] args) {
        boolean isShouldWakeUp = shouldWakeUp(true, -8);

        System.out.println(isShouldWakeUp);
    }

    public static boolean shouldWakeUp(boolean isDogBark, int hoursOfDay){
        boolean result = false;

        // Check if the hoursOfDay is valid (between 0-23)
        if(hoursOfDay < 0 || hoursOfDay > 23){
            return false;
        }

        // If dog is barking before 8 and after 22 return true
        if(isDogBark && (hoursOfDay < 8 || hoursOfDay > 22)){
            result = true;
        }

        return result;
    }
}