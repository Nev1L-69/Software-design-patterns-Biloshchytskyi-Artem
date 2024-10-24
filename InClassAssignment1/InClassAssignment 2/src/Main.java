// Main.java
public class Main {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();

        stockMarket.addStock("AAPL", 150.00);
        stockMarket.addStock("GOOGL", 2800.00);

        RetailInvestor retailInvestor1 = new RetailInvestor("Alice");
        RetailInvestor retailInvestor2 = new RetailInvestor("Bob");
        InstitutionalInvestor institutionalInvestor = new InstitutionalInvestor("Big Fund Inc.");

        Stock appleStock = stockMarket.getStock("AAPL");
        Stock googleStock = stockMarket.getStock("GOOGL");

        appleStock.addInvestor(retailInvestor1);
        appleStock.addInvestor(institutionalInvestor);
        googleStock.addInvestor(retailInvestor2);
        googleStock.addInvestor(institutionalInvestor);

        System.out.println("Updating AAPL stock price to $155.00:");
        stockMarket.updateStockPrice("AAPL", 155.00);

        System.out.println("\nUpdating GOOGL stock price to $2850.00:");
        stockMarket.updateStockPrice("GOOGL", 2850.00);

        appleStock.removeInvestor(institutionalInvestor);
        System.out.println("\nUpdating AAPL stock price to $160.00 (after unsubscribing Big Fund Inc.):");
        stockMarket.updateStockPrice("AAPL", 160.00);
    }
}
