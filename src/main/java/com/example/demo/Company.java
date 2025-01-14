package com.example.demo;

public class Company {
    private String name;
    private double revenue; // Annual revenue
    private double expenses; // Annual expenses
    private double growthRate; // Revenue growth rate in percentage
    private double profitMargin; // Percentage
    private double debtToEquity; // Ratio

    // Constructor
    public Company(String name, double revenue, double expenses, double growthRate, double profitMargin, double debtToEquity) {
        this.name = name;
        this.revenue = revenue;
        this.expenses = expenses;
        this.growthRate = growthRate;
        this.profitMargin = profitMargin;
        this.debtToEquity = debtToEquity;
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getRevenue() {
        return revenue;
    }

    public double getExpenses() {
        return expenses;
    }

    public double getGrowthRate() {
        return growthRate;
    }

    public double getProfitMargin() {
        return profitMargin;
    }

    public double getDebtToEquity() {
        return debtToEquity;
    }
}
