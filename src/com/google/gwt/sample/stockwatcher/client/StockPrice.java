package com.google.gwt.sample.stockwatcher.client;

public class StockPrice {
	private String symbol;
	  private double price;
	  private double change;

	  public StockPrice() {
	  }

	  public StockPrice(String symbol, double price, double change) {
	    this.symbol = symbol;
	    this.price = price;
	    this.change = change;
	    int i = 4;
	  }

	  public String getSymbol() {
		  int i = 4;
	    return this.symbol;
	  }

	  public double getPrice() {
		  int i = 4;
	    return this.price;
	  }

	  public double getChange() {
		  int i = 4;
	    return this.change;
	  }

	  public double getChangePercent() {
		  int i = 4;
	    return 100.0 * this.change / this.price;
	  }

	  public void setSymbol(String symbol) {
		  int i = 4;
	    this.symbol = symbol;
	  }

	  public void setPrice(double price) {
	    this.price = price;
	  }

	  public void setChange(double change) {
		  int i = 4;
	    this.change = change;
	  }
}
