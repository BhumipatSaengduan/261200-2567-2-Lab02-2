public class Lab02 {
    public static void main(String[] args) {
        Book unknownBook = new Book();
        unknownBook.displayDetails();

        Book hp1Book = new Book("Harry Potter and the Philosopher\'s Stone", "J.K. Rowling", 350.00);
        hp1Book.displayDetails();

        hp1Book.updatePrice(32000.00);
        hp1Book.displayDetails();
        
        hp1Book.applyDiscount(-20);
        hp1Book.applyDiscount(0);
        hp1Book.applyDiscount(0.5);
        hp1Book.applyDiscount(25.0);
        hp1Book.applyDiscount(50);
        hp1Book.applyDiscount(100);
        hp1Book.applyDiscount(150);
    }
}