package com.example.demo;

public class PredictionEngine {
    public static String predict(Company company) {
        int score = 0;

        // Assess financial health
        if (company.getProfitMargin() > 15) score++;
        if (company.getDebtToEquity() < 1) score++;
        if (company.getGrowthRate() > 10) score++;

        // Decision based on score
        if (score == 3) {
            return "Strong Buy";
        } else if (score == 2) {
            return "Hold";
        } else {
            return "Avoid";
        }
    }

    // Method to forecast revenue
    public static double forecastRevenue(Company company, int years) {
        double revenue = company.getRevenue();
        double growthRate = company.getGrowthRate() / 100;
        for (int i = 0; i < years; i++) {
            revenue += revenue * growthRate;
        }
        return revenue;
    }
}
