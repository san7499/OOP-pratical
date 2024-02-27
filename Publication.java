import java.util.Scanner;

class Publication {
    protected String title;
    protected double price;
    protected int copies;

    public Publication(String title, double price, int copies) {
        this.title = title;
        this.price = price;
        this.copies = copies;
    }

    public void saleCopy(int soldCopies) {
        if (soldCopies <= copies) {
            copies -= soldCopies;
            System.out.println(soldCopies + " copies of '" + title + "' sold successfully.");
        } else {
            System.out.println("Insufficient copies of '" + title + "' available for sale.");
        }
    }

    public double getTotalSale() {
        return price * (copies - 1); // Assuming one copy is retained for record or display purpose
    }
}

class Book extends Publication {
    private String author;
    private int availableStock;

    public Book(String title, double price, int initialStock, String author) {
        super(title, price, initialStock);
        this.author = author;
        this.availableStock = initialStock;
    }

    public void orderCopies(int additionalCopies) {
        copies += additionalCopies;
        availableStock += additionalCopies;
        System.out.println(additionalCopies + " copies of '" + title + "' ordered successfully.");
    }

    public void displayAuthorInfo() {
        System.out.println("Author of '" + title + "': " + author);
    }

    public void displayAvailableStock() {
        System.out.println("Available stock for '" + title + "': " + availableStock);
    }

    @Override
    public void saleCopy(int soldCopies) {
        if (soldCopies <= availableStock) {
            availableStock -= soldCopies;
            System.out.println(soldCopies + " copies of '" + title + "' sold successfully.");
        } else {
            System.out.println("Insufficient copies of '" + title + "' available for sale.");
        }
    }
}

class Magazine extends Publication {
    private int currentIssue;

    public Magazine(String title, double price, int copies, int currentIssue) {
        super(title, price, copies);
        this.currentIssue = currentIssue;
    }

    public void orderQty(int additionalCopies) {
        copies += additionalCopies;
        System.out.println(additionalCopies + " copies of '" + title + "' ordered successfully.");
    }

    public void receiveIssue() {
        currentIssue++;
        System.out.println("Received the latest issue of '" + title + "'. Current issue: " + currentIssue);
    }
}

class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose a publication type:");
            System.out.println("1. Book");
            System.out.println("2. Magazine");
            System.out.println("3. Exit");

            int choice = scanner.nextInt();

            if (choice == 1) {
                // Creating a Book with user input
                System.out.print("Enter the title of the book: ");
                String bookTitle = scanner.next();

                System.out.print("Enter the author of the book: ");
                String author = scanner.next();

                System.out.print("Enter the price of the book: ");
                double bookPrice = scanner.nextDouble();

                System.out.print("Enter the initial stock of the book: ");
                int initialStock = scanner.nextInt();

                Book book = new Book(bookTitle, bookPrice, initialStock, author);

                // Performing operations on the book
                System.out.print("Enter the number of additional copies to order for the book: ");
                int bookOrder = scanner.nextInt();
                book.orderCopies(bookOrder);

                book.displayAuthorInfo();
                book.displayAvailableStock();

                System.out.print("Enter the number of copies to sell for the book: ");
                int bookSale = scanner.nextInt();
                book.saleCopy(bookSale);

                double totalSale = book.getTotalSale();
                System.out.println("Total Sale for all publications: $" + totalSale);

            } else if (choice == 2) {
                // Creating a Magazine with user input
                System.out.print("Enter the title of the magazine: ");
                String magazineTitle = scanner.next();

                System.out.print("Enter the price of the magazine: ");
                double magazinePrice = scanner.nextDouble();

                System.out.print("Enter the initial stock of the magazine: ");
                int initialStock = scanner.nextInt();

                System.out.print("Enter the current issue of the magazine: ");
                int currentIssue = scanner.nextInt();

                Magazine magazine = new Magazine(magazineTitle, magazinePrice, initialStock, currentIssue);

                // Performing operations on the magazine
                System.out.print("Enter the number of additional copies to order for the magazine: ");
                int magazineOrder = scanner.nextInt();
                magazine.orderQty(magazineOrder);

                magazine.receiveIssue();

                System.out.print("Enter the number of copies to sell for the magazine: ");
                int magazineSale = scanner.nextInt();
                magazine.saleCopy(magazineSale);

                double totalSale = magazine.getTotalSale();
                System.out.println("Total Sale for all publications: $" + totalSale);

            } else if (choice == 3) {
                System.out.println("Exiting the program.");
                break;

            } else {
                System.out.println("Invalid choice. Please choose either 1, 2, or 3.");
            }

            System.out.print("Do you want to perform another task? (1 for Yes, 0 for No): ");
            int continueChoice = scanner.nextInt();

            if (continueChoice == 0) {
                System.out.println("Exiting the program.");
                break;
            }
        }

        scanner.close();
    }
}
