package com.company;

import java.util.Scanner;

public class Person {


    Scanner sr = new Scanner(System.in);
    String surnameAli56275 , firstNameShanjed56275, street56275 , city56275;
    int zipCode56275;

    void Initialize(){
        System.out.println("Please enter your Name: ");
        firstNameShanjed56275 = sr.nextLine();
        System.out.println("Please enter your Surname: ");
        surnameAli56275 = sr.nextLine();
        System.out.println("Please enter your Street name: ");
        street56275 = sr.nextLine();
        System.out.println("Please enter your City: ");
        city56275 = sr.nextLine();
        System.out.println("Please enter your Zip Code: ");
        zipCode56275 = sr.nextInt();
    }

    void printData(){
        System.out.println("Name: "+ firstNameShanjed56275);
        System.out.println("Surname: "+ surnameAli56275);
        System.out.println("Street Name: "+ street56275);
        System.out.println("City: "+ city56275);
        System.out.println("Zip Code: "+ zipCode56275);
    }

}


class Staff extends com.company.Person implements Salary{
    String education , Position;
    void Initialize1(){
        Initialize();
        System.out.println("Enter your Education: ");
        education = sr.nextLine();
        System.out.println("Enter your Position");
        Position = sr.nextLine();
    }

    void Print1(){
        printData();
        System.out.println("Education: " + education);
        System.out.println("Position: "+ Position);
    }


    @Override
    public void salaryToPayAli56275(int hoursALi56275, int RateAli56275) {

    }

    @Override
    public int salaryForOvertime(int extrahoursAli56275, int rateAli56275) {
        return Salary.super.salaryForOvertime(extrahoursAli56275, rateAli56275);
    }
}

interface Salary{
    void salaryToPayAli56275(int hoursAli56275, int RateAli56275);



    default int salaryForOvertime(int extrahoursAli56275, int rateAli56275){
        int salaryOverTime=extrahoursAli56275 * rateAli56275;
        return salaryOverTime;

    }

    static double bonusCheckAli56275( int yearsOfExpirience){
        double bonusAli56275=0;
        if (yearsOfExpirience>3) bonusAli56275=100;
        else bonusAli56275=0;
        return bonusAli56275;
    };


}


class Main {
    public static void main(String[] args) {
        Staff employee = new Staff();
        employee.Initialize1();
        employee.Print1();
        employee.salaryToPayAli56275(5,9);
        Salary.bonusCheckAli56275(7);
    }
}