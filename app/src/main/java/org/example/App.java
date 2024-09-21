package org.example;

public class App {

    // Method to check if the cube of the number is equal to 3 times the number
    public boolean isCubeEqualToThreeTimes(int number) {
        int cube = number * number * number;
        int threeTimes = number * 3;
        return cube == threeTimes;
    }

    public static void main(String[] args) {
        App app = new App();
        int testNumber = 1; // Change this number to test
        boolean result = app.isCubeEqualToThreeTimes(testNumber);
        System.out.println("Is the cube of " + testNumber + " equal to three times the number? " + result);

    }
}
