public class Main8 {
    public static void main(String[] args) {
        Car car = new Car("TESLA","S PLAID","BLACK",4);
        Car car2 = new Car("FORD", "MUSTANG", "RED", 2);

        System.out.println(car.getClass());
        System.out.println(car2.getClass());

        car.move();
        car2.stop();
    }
}
