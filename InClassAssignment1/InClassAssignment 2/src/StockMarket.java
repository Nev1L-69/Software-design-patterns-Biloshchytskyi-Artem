import java.util.HashMap;
import java.util.Map;

public class StockMarket {
    private Map<String, Stock> stocks = new HashMap<>();

    public void addStock(String symbol, double price) {
        stocks.put(symbol, new Stock(symbol, price));
    }

    public Stock getStock(String symbol) {
        return stocks.get(symbol);
    }

    public void updateStockPrice(String symbol, double newPrice) {
        Stock stock = stocks.get(symbol);
        if (stock != null) {
            stock.setPrice(newPrice);
        } else {
            System.out.println("Stock with symbol " + symbol + " not found.");
        }
    }
}
