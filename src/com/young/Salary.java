package com.young;
import java.util.Scanner;
public class Salary {


    public static void main(String[] args) {


            float basic_salary,da,ot_h,ot_rt,Total_payment,ot_amount;
            String employerName, em_id, companyName;

            Scanner scan=new Scanner(System.in);

            System.out.println("Enter the name of your Employer:");
                employerName =scan.nextLine();

        System.out.println("Name of the company/work place you work in:");
            companyName = scan.nextLine();

            System.out.println("Enter your ID: ");
                em_id =scan.nextLine();


            System.out.println("Enter Your Basic Salary: ");
            basic_salary=scan.nextFloat();

            System.out.println("How many hours do you spend overtime?: ");
            ot_h=scan.nextFloat();

            System.out.println("Rate your overtime 1-10: ");
            ot_rt=scan.nextFloat();

            System.out.println("How much do you spend on extra cost averagely per month?: ");
            da=scan.nextFloat();

            ot_amount = ot_amount(ot_h,ot_rt);
            Total_payment = Total_payment(ot_amount,basic_salary,da);


            System.out.println("__________________________SALARY DETAILS_______________________________");

            System.out.println("1.Name of employer :"+employerName);
        System.out.println("2. Name of Company/workplace:"+ companyName);
            System.out.println("3.Employee id :"+em_id);
            System.out.println("4.Total Salary :"+Total_payment);
        }

        public static float ot_amount(float ot_h,float ot_rt){
            float ot_amount=ot_h*ot_rt;
            return ot_amount;
        }
        public static float Total_payment(float ot_amount,float basic_salary,float da){
            float Total_payment=ot_amount+(basic_salary-da);
            return Total_payment;
        }


    }


