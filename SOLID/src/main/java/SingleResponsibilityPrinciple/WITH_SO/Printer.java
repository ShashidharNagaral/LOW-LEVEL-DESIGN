package SingleResponsibilityPrinciple.WITH_SO;

// NOTE: Printer class is only responsible for handling the displaying logic
public class Printer {

    public void printBill(Bill bill) {
        System.out.println("---------");
        System.out.println("Customer Name: "+ bill.getCustomerName());
        for(Item item: bill.getItems()) {
            System.out.println(item.getId()+": "+item.getPrice());
        }
        System.out.println("Total: "+bill.getTotalAmount());
        System.out.println("---------");
    }
}
