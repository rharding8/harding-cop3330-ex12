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
    return input.nextDouble();
  }

  public double getRate() {
    System.out.print("What is the rate of interest (In %)? ");
    return input.nextDouble();
  }

  public int getTime() {
    System.out.print("How many years? ");
    return input.nextInt();
  }

  public String total(double principal, double rate, int time) {
    double finalAmt = principal * (1 + rate * time / 100);
    return String.format("After %d years at %.1f%%, the investment will be worth $%.2f", time, rate, finalAmt);
  }
}
