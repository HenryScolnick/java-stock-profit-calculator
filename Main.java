import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double totalInvested = 0;
        double totalValue = 0;
        String addStock = "yes";

        System.out.println("STOCK PORTFOLIO CALCULATOR");

        while (addStock.equalsIgnoreCase("yes")) {
            System.out.print("\nEnter stock name: ");
            String stockName = input.nextLine();

            System.out.print("Enter number of shares: ");
            int shares = input.nextInt();

            System.out.print("Enter price paid per share: $");
            double purchasePrice = input.nextDouble();

            System.out.print("Enter current price per share: $");
            double currentPrice = input.nextDouble();

            if (shares < 0 || purchasePrice < 0 || currentPrice < 0) {
                System.out.println("Please use zero or positive numbers. Run the program again.");
                input.close();
                return;
            }

            double investment = shares * purchasePrice;
            double currentValue = shares * currentPrice;
            double profit = currentValue - investment;
            double percentReturn = 0;

            if (investment > 0) {
                percentReturn = (profit / investment) * 100;
            }

            totalInvested = totalInvested + investment;
            totalValue = totalValue + currentValue;

            System.out.println("\n--- " + stockName + " Report ---");
            System.out.printf("Initial investment: $%.2f%n", investment);
            System.out.printf("Current value: $%.2f%n", currentValue);
            System.out.printf("Profit/Loss: $%.2f%n", profit);
            System.out.printf("Return: %.2f%%%n", percentReturn);

            input.nextLine(); // Consume the newline after numeric input.

            System.out.print("\nWould you like to add another stock? (yes/no): ");
            addStock = input.nextLine();
        }

        double totalProfit = totalValue - totalInvested;
        double totalReturn = 0;

        if (totalInvested > 0) {
            totalReturn = (totalProfit / totalInvested) * 100;
        }

        System.out.println("\n===== TOTAL PORTFOLIO REPORT =====");
        System.out.printf("Total invested: $%.2f%n", totalInvested);
        System.out.printf("Current portfolio value: $%.2f%n", totalValue);
        System.out.printf("Total profit/loss: $%.2f%n", totalProfit);
        System.out.printf("Total portfolio return: %.2f%%%n", totalReturn);
        System.out.println("\nThank you for using the Stock Portfolio Calculator!");

        input.close();
    }
}
