package com.company;

public class Main {

    public static void main(String[] args) {

        printHeader();

        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("Enter your birth year: ");
        int birthYear = input.nextInt();
        input.nextLine();
        System.out.println("Enter your first name: ");
        String firstName = input.nextLine();
        System.out.println("Enter your last name: ");
        String lastName = input.nextLine();
        System.out.println("Please enter your 5 digit employee number: ");
        int employeeNumber = input.nextInt();
        int password = 0;

        printName(lastName, firstName);
        printAge(birthYear);
        printEvenOrOdd(employeeNumber);
        printGeneratedSecretPassword(employeeNumber);
    }

    private static void printHeader(){
        System.out.println("Welcome to the WallabyTech Employee Application");
        System.out.println("===============================================");
    }

    private static void printName (String firstName, String lastName){
        System.out.println(lastName + ", " + firstName);
    }

    private static void printAge(int birthYear){
        int currentYear = 2019;
        int age = currentYear - birthYear;
        System.out.println(age);
    }

    private static void printEvenOrOdd(int employeeNumber){
        if (employeeNumber == employeeNumber % 2) {
            System.out.println("Employee number is even: true");
        }
        else if (employeeNumber != employeeNumber %2 ) {
            System.out.println("Employee number is even: false");
        }
    }

    private static void printGeneratedSecretPassword (int employeeNumber) {
        int secretPassword = 0;
        int min = 1;
        int max = 10;
        java.util.Random random = new java.util.Random();
        int randomNumber = random.nextInt(max + 1 - min) + min;
        secretPassword = (employeeNumber + randomNumber) * 5;
        System.out.println("Employee's random secret password is: " + secretPassword);
    }
}
