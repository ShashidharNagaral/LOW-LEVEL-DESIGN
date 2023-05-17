package srp;

public class SingleResponsibility {
    public static void main(String[] args) {
        // create a customer object
        Customer customer = new Customer("Shiv", 25, "7878656523");

        // create an order object for the customer
        PrintOrder printOrder = new PrintOrder();
        Order order = new Order(customer, printOrder, 4);
        order.addItem(new Item("GoodDay Biscuit", 2));
        order.addItem(new Item("Oreo", 2));
        Item item = order.addItem(new Item("Bhakarwadi", 1));
        order.removeItem(item);

        // save the order in database
        SaveOrder saveOrder = new SaveOrder(order);
        saveOrder.saveToDB();

        // we also achieve single responsibility principle through delegation
        // the print order responsibility is delegated to PrintOrder class
        order.print();
    }
}
