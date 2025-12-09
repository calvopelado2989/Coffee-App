public class Coffe {
    double price;
    String flavor;
    String customer;
    int quantity;

    public Coffe(double precio, String sabor, String cliente, int cantidad) {
        this.price = precio;
        this.flavor = sabor;
        this.customer = cliente;
        this.quantity = cantidad;
    }

    public double total() {
        return price * quantity;
    }

    @Override
    public String toString() {
        return "Coffee order\n"
                + "Cliente: " + customer + "\n"
                + "Sabor: " + flavor + "\n"
                + "Precio unitario: " + price + "\n"
                + "Cantidad: " + quantity + "\n"
                + "Total: " + String.format("%.2f", total());
    }
}