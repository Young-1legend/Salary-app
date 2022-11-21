package com.young;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Employee james = new Employee(100, 7);
        System.out.println(james.finalSalary());

        Employee john = new Employee(30,5);
        System.out.println(john.finalSalary());
    }

    }


