package com.young;

public class Employee{

    private double amount;
    private int hoursWorked;
    private double salary;

    public Employee(double amount, int hoursWorked){
        this.amount = amount;
        this.hoursWorked = hoursWorked;
    }

    public double calcSalary(){
        return this.salary = this.amount * this.hoursWorked;
    }

    public double AddSal(){
        double newSal = 0;
        if (this.calcSalary() < 500){
            newSal = this.calcSalary() + 10;
        }else {
            newSal = this.calcSalary();
        }
        return newSal;
    }

    public double AddWork(){
        double newSal = 0;
        if( this.hoursWorked > 6){
            newSal = this.AddSal() + 5;
        }else{
            newSal = this.AddSal();
        }

        return newSal;
    }

    public double finalSalary(){
        return AddWork();
    }
}


