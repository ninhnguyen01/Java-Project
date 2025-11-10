public class methodExample2 {
    public static void main(String[] args) {
        sayHello();
        System.out.println(getSquare(10));
        sayName("Kim");
    }

    static void sayHello() {
        System.out.println("Hello there!" + " The number is:");
    }

    static int getSquare(int number) {
        return number * number;
    }

    static void sayName(String name) {
        System.out.println("Come with me, " + name);
    }
}
