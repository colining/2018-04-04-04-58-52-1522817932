package practice3;

import java.math.BigDecimal;
import java.util.List;

public class PriceCaculator {

    public BigDecimal calculate(List<OrderLineItem> orderLineItemList, List<BigDecimal> discounts, BigDecimal tax1) {
        BigDecimal subTotal = new BigDecimal(0);

        // Total up line items
        for (OrderLineItem lineItem : orderLineItemList) {
            subTotal = subTotal.add(lineItem.getPrice());
        }

        // Subtract discounts
        for (BigDecimal discount : discounts) {
            subTotal = subTotal.subtract(discount);
        }

        // calculate tax
        BigDecimal tax = subTotal.multiply(tax1);

        // calculate GrandTotal
        BigDecimal grandTotal = subTotal.add(tax);

        return grandTotal;
    }
}
