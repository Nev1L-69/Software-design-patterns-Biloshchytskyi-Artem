// RetailInvestor.java
class RetailInvestor implements Investor {
    private String name;

    public RetailInvestor(String name) {
        this.name = name;
    }

    @Override
    public void update(Stock stock) {
        System.out.println("Retail Investor " + name + " notified. " +
                "Stock: " + stock.getSymbol() + " is now $" + stock.getPrice());
    }
}

// InstitutionalInvestor.java
class InstitutionalInvestor implements Investor {
    private String institutionName;

    public InstitutionalInvestor(String institutionName) {
        this.institutionName = institutionName;
    }

    @Override
    public void update(Stock stock) {
        System.out.println("Institutional Investor " + institutionName + " notified. " +
                "Stock: " + stock.getSymbol() + " is now $" + stock.getPrice());
    }
}
