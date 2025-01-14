package com.example.demo;

import com.example.demo.Company;
import com.example.demo.PredictionEngine;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user inputs
        System.out.println("Enter Company Name: ");
        String name = scanner.nextLine();

        System.out.println("Enter Annual Revenue (in dollars): ");
        double revenue = scanner.nextDouble();

        System.out.println("Enter Annual Expenses (in dollars): ");
        double expenses = scanner.nextDouble();

        System.out.println("Enter Revenue Growth Rate (%): ");
        double growthRate = scanner.nextDouble();

        System.out.println("Enter Profit Margin (%): ");
        double profitMargin = scanner.nextDouble();

        System.out.println("Enter Debt-to-Equity Ratio: ");
        double debtToEquity = scanner.nextDouble();

        // Create Company object
        Company company = new Company(name, revenue, expenses, growthRate, profitMargin, debtToEquity);

        // Make prediction
        String prediction = PredictionEngine.predict(company);
        System.out.println("\nPrediction for " + company.getName() + ": " + prediction);

        // Forecast revenue
        System.out.println("Forecasted Revenue for next 3 years: $" +
                String.format("%.2f", PredictionEngine.forecastRevenue(company, 3)));

        scanner.close();
    }
}
