/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Ryan Harding
 */

package base;

import java.util.Scanner;

public class SimpleInterest {
  Scanner input = new Scanner(System.in);

  public static void main(String[] args) {
    SimpleInterest investment = new SimpleInterest();
    double initial = investment.getPrincipal();
    double rate = investment.getRate();
    int time = investment.getTime();
    System.out.println(investment.total(initial, rate, time));
  }

  public double getPrincipal() {
    System.out.print("What is the principal? ");
    String n = input.next();
    try {
      Double.parseDouble(n);
    }
    catch (NumberFormatException e) {
      System.out.println("ERROR: Invalid Value, Try Again!");
      return getPrincipal();
    }
    return Double.parseDouble(n);
  }

  public double getRate() {
    System.out.print("What is the rate of interest (In %)? ");
    String n = input.next();
    try {
      Double.parseDouble(n);
    }
    catch (NumberFormatException e) {
      System.out.println("ERROR: Invalid Value, Try Again!");
      return getRate();
    }
    return Double.parseDouble(n);
  }

  public int getTime() {
    System.out.print("How many years? ");
    String n = input.next();
    try {
      Integer.parseInt(n);
    }
    catch (NumberFormatException e) {
      System.out.println("ERROR: Invalid Value, Try Again!");
      return getTime();
    }
    return Integer.parseInt(n);
  }

  public String total(double principal, double rate, int time) {
    double finalAmt = principal * (1 + rate * time / 100);
    return String.format("After %d years at %.1f%%, the investment will be worth $%.2f", time, rate, finalAmt);
  }
}
