package OOPComposition;

public class TestBook {
    public static void main(String[] args) {
        Author ahteck = new Author("Tan Ah Teck", "ahTeck@somewhere.com", 'm');
        System.out.println(ahteck);

        Book dummyBook = new Book("Java for dummies", ahteck, 9.99, 99);
        System.out.println(dummyBook);

        dummyBook.setPrice(8.88);
        dummyBook.setQty(88);
        System.out.println("name is : " + dummyBook.getName());
        System.out.println("price is : " + dummyBook.getPrice());
        System.out.println("qty is : " + dummyBook.getQty());
        System.out.println("author is : " + dummyBook.getAuthor());
        System.out.println("author'name is : " + dummyBook.getAuthor().getName());
        System.out.println("author'email is : " + dummyBook.getAuthor().getEmail());
        System.out.println("author'gender is : " + dummyBook.getAuthor().getGender());

        Book moreDummyBook = new Book("Java for more dummies", new Author("Peter Lee", "peter@nowhere.com",'m'), 19.99, 8);
        System.out.println(moreDummyBook);
    }
}
