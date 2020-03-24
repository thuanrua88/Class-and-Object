package OOPComposition;

public class TestAuthor {
    public static void main(String[] args) {
        Author ahTeck = new Author("Tan Ah Teck", "teck@nowhere.com", 'm');
        System.out.println(ahTeck);

        ahTeck.setEmail("teck@somewhere.com");
        System.out.println(ahTeck);
        System.out.println("Name is : " + ahTeck.getName());
        System.out.println("Gender is : " + ahTeck.getGender());
        System.out.println("Email is : " + ahTeck.getEmail());
    }
}
