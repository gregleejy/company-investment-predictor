package com.example.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CompanyController {

    @PostMapping("/predict")
    public PredictionResponse predictInvestment(@RequestBody Company company) {
        String prediction = PredictionEngine.predict(company);
        double forecastedRevenue = PredictionEngine.forecastRevenue(company, 3);
        return new PredictionResponse(prediction, forecastedRevenue);
    }

    // Static nested class for prediction response
    static class PredictionResponse {
        private String prediction;
        private double forecastedRevenue;

        public PredictionResponse(String prediction, double forecastedRevenue) {
            this.prediction = prediction;
            this.forecastedRevenue = forecastedRevenue;
        }

        public String getPrediction() {
            return prediction;
        }

        public double getForecastedRevenue() {
            return forecastedRevenue;
        }
    }
}
