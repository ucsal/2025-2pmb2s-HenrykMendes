package br.com.mariojp.solid.srp;

public class ReceiptService {
	private TaxCalculator TC;
	private ReceiptFormatter RC;

	public ReceiptService() {
		TC = new TaxCalculator();
		RC = new ReceiptFormatter();
	}

	public ReceiptService(TaxCalculator tC, ReceiptFormatter rC) {
		super();
		this.TC = tC;
		this.RC = rC;
	}

	public String generate(Order order) {
		double subtotal = order.getItems().stream().mapToDouble(i -> i.getUnitPrice() * i.getQuantity()).sum();

		double tax = TC.calculate(subtotal);
		double total = subtotal + tax;

		return RC.format(order, subtotal, tax, total);
	}

}
