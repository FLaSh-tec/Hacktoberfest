package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Enter the source currency code: ");
        String sourceCurrencyCode = scanner.nextLine();

        System.out.println("Enter the target currency code: ");
        String targetCurrencyCode = scanner.nextLine();

        
        double exchangeRate = getExchangeRate(sourceCurrencyCode, targetCurrencyCode);

        
        System.out.println("Enter the amount to be converted: ");
        double amount = scanner.nextDouble();

        
        double convertedAmount = amount * exchangeRate;

        
        System.out.println("The converted amount is: " + convertedAmount);

        scanner.close();
    }

    
    private static double getExchangeRate(String sourceCurrencyCode, String targetCurrencyCode) {
        // TODO: Implement this method to fetch the exchange rate from the API
        
        return 1.0;
    }
}
