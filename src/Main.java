public class Main {
    public static void main(String[] args) {
        Depot depot1 = Depot.getInstance();
        Depot depot2 = Depot.getInstance();
        Depot depot3 = Depot.getInstance(); // Should return depot1 or depot2

        System.out.println(depot1); // Should print the first instance
        System.out.println(depot2); // Should print the second instance
        System.out.println(depot3); // Should print the first or second instance (if modulo logic applies)
    }
}
