package tc_web;

import java.math.BigDecimal;

import yahoofinance.Stock;
import yahoofinance.YahooFinance;

public class TestaYahooFinanceAPI {

	public static void main(String[] args) throws Exception {
//		Stock stock = YahooFinance.get("INTC");
//		BigDecimal price = stock.getQuote(true).getPrice();
		
		Stock stock = YahooFinance.get("INTC");
		
		BigDecimal price = stock.getQuote().getPrice();
		BigDecimal change = stock.getQuote().getChangeInPercent();
		BigDecimal peg = stock.getStats().getPeg();
		BigDecimal dividend = stock.getDividend().getAnnualYieldPercent();
		
		stock.print();
		
	}
}
