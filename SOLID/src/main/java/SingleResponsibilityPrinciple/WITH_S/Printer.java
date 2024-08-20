package SingleResponsibilityPrinciple.WITH_S;

// NOTE: Printer class is only responsible for handling the displaying logic
public class Printer {
    private Bill bill;

    public Printer(Bill bill) {
        this.bill = bill;
    }

    public void printBill() {
        System.out.println("---------");
        System.out.println("Customer Name: "+this.bill.getCustomerName());
        for(Item item: this.bill.getItems()) {
            System.out.println(item.getId()+": "+item.getPrice());
        }
        System.out.println("Total: "+bill.getTotalAmount());
        System.out.println("---------");
    }
}
