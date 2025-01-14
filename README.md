# Company Investment Predictor

## Description
The **Company Investment Predictor** is a simple yet effective tool that helps users determine whether they should invest in a company based on its financial metrics. This project is built using Java and Spring Boot and includes a web-based user interface for input and output display.

## Features
- Accepts key financial metrics as input:
  - Company Name
  - Annual Revenue
  - Annual Expenses
  - Growth Rate (%)
  - Profit Margin (%)
  - Debt-to-Equity Ratio
- Predicts whether to **Invest**, **Hold**, or **Avoid**.
- Provides a forecasted revenue for the next 3 years based on growth rate.

## Technologies Used
- Java (version 17)
- Spring Boot (version 3.4.1)
- Maven
- HTML/CSS/JavaScript for frontend

## Setup Instructions
1. Clone this repository:
   ```bash
   git clone https://github.com/gregleejy/company-investment-predictor.git
   cd company-investment-predictor
   ```

2. Build the project using Maven:
   ```bash
   mvn clean package
   ```

3. Run the application:
   ```bash
   mvn spring-boot:run
   ```

4. Access the web application at `http://localhost:8080`.

## Example Input
Here is an example input for **JP Morgan**:
- **Company Name**: JP Morgan
- **Annual Revenue**: 120000000
- **Annual Expenses**: 90000000
- **Growth Rate**: 7.5%
- **Profit Margin**: 20%
- **Debt-to-Equity Ratio**: 0.8

## Example Output
- **Prediction**: Invest
- **Forecasted Revenue (3 years)**: $149.38M

## How It Works
1. The input values are processed using a predictive algorithm that evaluates the company's financial health.
2. The application calculates the forecasted revenue based on the growth rate.
3. A recommendation is made based on predefined thresholds for the financial metrics.

## Contributing
Contributions are welcome! Please follow these steps:
1. Fork this repository.
2. Create a new branch:
   ```bash
   git checkout -b feature/your-feature-name
   ```
3. Commit your changes:
   ```bash
   git commit -m "Add your feature description"
   ```
4. Push to your branch:
   ```bash
   git push origin feature/your-feature-name
   ```
5. Open a pull request.

## License
This project is licensed under the [MIT License](LICENSE).

## Contact
For any questions or feedback, please contact:
- **Name**: Greg Lee
- **Email**: gregleejiayou@hotmail.com
- **GitHub**: [gregleejy](https://github.com/gregleejy)
```
