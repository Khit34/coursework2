/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Khit
 */
                 //NUMBER TWO
//Declaring the class called runner
public class Runner {

    public static void main(String[] args) {
        //Storing names in an  Array of runners' names
        String[] names = {
            "Elena", "Thomas", "Hamilton", "Suzie", "Phil",
            "Matt", "Alex", "Emma", "John", "James",
            "Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate"
        };

        //Storing time an Array of corresponding times (in minutes)
        int[] times = {
            341, 273, 278, 329, 445,
            402, 388, 275, 243, 334,
            412, 393, 299, 343, 317, 265
        };

      
        findFastestRunners(names, times);
    }

    public static void findFastestRunners(String[] names, int[] times) {
        // Initializing variables to store indices of fastest and second-fastest runners
        int fastestIndex = 0;
        int secondFastestIndex = 0;

        // Looping to find the fastest runner
        for (int i = 1; i < times.length; i++) {
            if (times[i] < times[fastestIndex]) {
                secondFastestIndex = fastestIndex;
                fastestIndex = i;
            } else if (times[i] < times[secondFastestIndex] || fastestIndex == secondFastestIndex) {
                secondFastestIndex = i;
            }
        }
        System.out.println("The Fastest runner is: " + names[fastestIndex] + " with a time of " + times[fastestIndex] + " minutes.");
        System.out.println("The Second fastest runner is: " + names[secondFastestIndex] + " with a time of " + times[secondFastestIndex] + " minutes.");
    }
}

