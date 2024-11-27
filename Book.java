public class Book {
    String title;
    String author;
    double price; 

    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    } 

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    public void updatePrice(double newPrice) {
        price = newPrice;
    }

    public void applyDiscount(double percent) {
        if (percent >= 0.0 && percent <= 100.0) {
            price = price - (price * percent * 0.01);
            System.out.println("Discount Percent: " + percent);
            System.out.println("Sale Price: " + price);
        } else {
            System.out.println("Invalid");
        }
    }

}