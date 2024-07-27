public class Main2 {
    public static void main(String[] args) {
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        System.out.println("The max value for an integer is: "+ max);
        System.out.println("The min value for an integer is: " + min);

        char letter = 'C';
        System.out.println(letter);

        double decNum = 3.14;
        System.out.println(decNum);

        String commando_unit = "Delta Squad";
        System.out.println(commando_unit);
        
        Integer id = 7567;
        System.out.println(id);

        int num1 = 5;
        int num2 = 2;
        System.out.println("Addition Result is: " + (num1 + num2));
        System.out.println("Subtraction Result is: " + (num1 - num2));
        System.out.println("Multiplication Result is: " + (num1 * num2));
        System.out.println("Division Result is: " + (num1 / num2));
        System.out.println("Division Result is: " + (num1 % num2));
        System.out.println("\n");
        
        float num3 = 5f;
        int num4 = 2;
        System.out.println("Addition Result is: " + (num3 + num4));
        System.out.println("Subtraction Result is: " + (num3 - num4));
        System.out.println("Multiplication Result is: " + (num3 * num4));
        System.out.println("Division Result is: " + (num3 / num4));
        System.out.println("Division Result is: " + (num3 % num4));
        System.out.println("\n");

        int myNumber = 0;
        myNumber += 4;
        System.out.println(myNumber);
        System.out.println(myNumber++);
        System.out.println(myNumber--);        
    }
    
}
