public class boolExample {
    public static void main(String[] args) {
        boolean isloggedIn = true;
        boolean isAdmin = true;

//        && = and, || = or, ! = not true
        if (isloggedIn && isAdmin) {
            System.out.println("Welcome admin!");
        }

        else {
            System.out.println("Access denied!");
        }
    }
}
